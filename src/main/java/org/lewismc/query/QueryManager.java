/**
 * 
 */
package org.lewismc.query;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.StringTokenizer;

import org.apache.avro.util.Utf8;
import org.apache.gora.query.Query;
import org.apache.gora.query.Result;
import org.apache.gora.store.DataStore;
import org.apache.gora.store.DataStoreFactory;
import org.apache.hadoop.conf.Configuration;
import org.lewismc.store.FedStore;
import org.lewismc.util.TRECQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * QueryManager exposes a CLI enabling execution of get and delete queries to the service (query) broker.
 * In this case the service broker is an in-memory storage mechanism containing a 
 * metadata representation of underlying datastores involved in the overall query process.
 * 
 * 
 * @author lewismc
 *
 */
public class QueryManager {

  /** The logging implementation */
  private static final Logger log = LoggerFactory.getLogger(QueryManager.class);

  /** An instance of the TREC query id and content*/
  private static TRECQuery trecQuery = new TRECQuery(null);
  
  /** The run name */
  private static String runName;
  
  private long datastore = 0;
  
  /** Our instance of the Gora DataStore */
  private DataStore<String, FedStore> dataStore; 
  
  /** Key for Cassandra*/
  private String token;
  
  /**
   * Default constructor for QueryManager.
   */
  public QueryManager() throws IOException { 
    init();
  }

  private void init() throws IOException {
    dataStore = DataStoreFactory.getDataStore(String.class, FedStore.class, new Configuration());
  }

  /**
   * Parses a text file and store the contents at the data store.
   * The text file MUST be of the format
   * trecSearchEngineNameId(String), trecSearchEngineName(long), 
   * numberOfDocs(int), dictionaryMap(map, String), contentType(String).
   * @param input the input file location
   * @param args 
   * @throws Exception 
   * @throws ParseException 
   * @throws IOException 
   */
  private void parse(File dictionaryDir) throws IOException, ParseException, Exception {
    buildData(dictionaryDir);
  }

  private void buildData(File dictionaryDir) throws Exception  {
    buildBasicData(dictionaryDir);
    log.info("Finished parsing file all input files. Total of: " + datastore + " fedStore's added");
  }
  


  private void buildBasicData(File dictionaryDir) throws IOException, ParseException, Exception {
    for (File file: dictionaryDir.listFiles()) {
      System.out.println(file.getAbsolutePath().toLowerCase());
      if(file.getCanonicalPath().toLowerCase().contains(".svn")) {
        continue;
      }
        
      //This is the Key for a Cassandra entry.
      this.token = file.getName().toString();
      BufferedReader mapReader = new BufferedReader(new FileReader(file + "/dic_10.txt"));
      long lineNum = 0;
      FedStore fedStore = new FedStore();
      try {
        String mapLine = mapReader.readLine();
        fedStore.setTrecSearchEngineNameId(new Utf8("FW13-" + file.getName().toString()));
        do{ 
          StringTokenizer mapMatcher = new StringTokenizer(mapLine);
          //parse the line and pull out values.
          String dictionaryMapKey = mapMatcher.nextToken();
          String dictionaryMapValue = mapMatcher.nextToken();
          fedStore.putToDictionaryMap(new Utf8(dictionaryMapKey), new Utf8(dictionaryMapValue));
          lineNum++;
        } while ((mapLine = mapReader.readLine()) != null);
        if(fedStore != null) {
          //store the fedStore object
          storeFedStore(token, fedStore);
          datastore++;
        }
        log.info("Finished reading basic data for trec engineId: " + this.token + ". Number of map entires: " + lineNum);
      }catch (ParseException pe) {
        pe.printStackTrace();
      } finally {
      mapReader.close();  
      }
    }
  }
  
  /** Stores the fedStore object with the given key */
  private void storeFedStore(String lineCount, FedStore fedStore) throws IOException, Exception {
  log.info("Storing fedStore in: " + dataStore.toString());
    dataStore.put(lineCount, fedStore);
  }
  /** Fetches a single fedStore object and prints it*/
  //private void get(String key) throws IOException, Exception {
  //  FedStore engineCharacteristics = fedStore.get(key);
  //  printFedStore(engineCharacteristics);
  //}
  
  /** Queries and prints a single fedStore object 
   * for some given fields.
   */
  private void query(String key) throws IOException, Exception {
    //Queries are constructed from the data store
    Query<String, FedStore> query = dataStore.newQuery();
    query.setKey(key);
    
    Result<String, FedStore> result = query.execute(); //Actually executes the query.
    // alternatively fedStore.execute(query); can be used
    
    writeResult(result);
  }

  /** Queries and prints pageview object that have keys between startKey and endKey*/
  //private void query(String startKey, String endKey) throws IOException, Exception {
  //  Query<String, FedStore> query = fedStore.newQuery();
  //  //set the properties of query
  //  query.setStartKey(startKey);
  // query.setEndKey(endKey);
  //  
  //  Result<String, FedStore> result = query.execute();
  //  
  //  writeResult(result);
  //}
  
  /**Deletes the fedStore with the given TREC identifier */
  //private void delete(String trecIdentifier) throws Exception {
  //  fedStore.delete(trecIdentifier);
  //  fedStore.flush(); //write changes may need to be flushed before
  //                     //they are committed 
  //  log.info("fedStore with key:" + trecIdentifier + " successfully deleted");
  //}
  
  /** This method illustrates delete by query call */
  //private void deleteByQuery(long startKey, long endKey) throws IOException, Exception {
    //Constructs a query from the dataStore. The matching rows to this query will be deleted
    //Query<Long, Pageview> query = dataStore.newQuery();
    //set the properties of query
    //query.setStartKey(startKey);
    //query.setEndKey(endKey);
    
    //dataStore.deleteByQuery(query);
    //log.info("pageviews with keys between " + startKey + " and " + endKey + " are deleted");
  //}
  
  /** Writes the query metrics to a text file in the format
   * query#, unused, search engine, rank, score, team qualifier. e.g.
   * 7001 Q0 FW13-e200 1 29.34 example13a
   * @throws IOException */
  private void printFedStore(FedStore fedStore) throws IOException {
    if(fedStore == null) {
      log.info("No result to show for that trec query..."); 
    } else {
      PrintWriter out = new PrintWriter(new FileWriter("query.txt"), true);
      out.write(trecQuery.getQueryId() + " Q0 " + fedStore.getTrecSearchEngineName() + "rank" + "score" + runName);
      out.close();
    }
  }
  
  /**
   * We only wish to write out the top ten results for each
   * query.
   * @param result
   * @throws IOException
   * @throws Exception
   */
  private void writeResult(Result<String, FedStore> result) throws IOException, Exception {
    
    for(int i=0; i < 10; i++) {
      while(result.next()) { //advances the Result object and breaks if at end
        String resultKey = result.getKey(); //obtain current key
        FedStore resultFedtore = result.get(); //obtain current value object
      
        //print the results
        log.info(resultKey + ":");
        printFedStore(resultFedtore);
      }
      log.info("Number of fedStores from the query:" + result.getOffset());
    }
  }
  
  
  private void close() throws IOException, Exception {
    //It is very important to close the datastore properly, otherwise
    //some data loss might occur.
    if(dataStore != null)
      dataStore.close();
  }

  private static final String USAGE = "QueryManager -parse <dictionary_file.txt>\n" + 
      //"             -get <lineNum>\n" +
      "             -query <trec_queryId> <runName>\n";
      //"             -query <startLineNum> <endLineNum>\n" +
      //"             -delete <lineNum>\n" +
      //"             -deleteByQuery <startLineNum> <endLineNum>\n";

  public static void main(String[] args) throws Exception {
    if(args.length < 2) {
      System.err.println(USAGE);
      System.exit(1);
    }

    QueryManager manager = new QueryManager();
    
    trecQuery.setQueryName("q7001");
    if("-parse".equals(args[0])) {
      manager.parse(new File(args[1]));
    } else if ("-query".equals(args[0])) {
      trecQuery.setQueryName(args[1]);
      manager.query(trecQuery.getQuery());
      runName = args[2];
     
    //} else if("-get".equals(args[0])) {
    //  manager.get(args[1]);
    //} else if("-query".equals(args[0])) {
    //  if(args.length == 2) 
    //    //TODO add field arguments for the query.
    //    manager.query(args[1]);
    //  else 
    //    manager.query(args[1], args[2]);
    //} else if("-delete".equals(args[0])) {
    //  manager.delete(args[1]);
    //} else if("-deleteByQuery".equalsIgnoreCase(args[0])) {
    //  manager.deleteByQuery(Long.parseLong(args[1]), Long.parseLong(args[2]));
    } else {
      System.err.println(USAGE);
      System.exit(1);
    }

    manager.close();
  }

}
