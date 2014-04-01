/**
 * 
 */
package edu.stanford.eil.util;

import java.util.HashMap;

/**
 * Utility class specifically restricting the queries which can be
 * executed to the {@link edu.stanford.eil.query.QueryManager}
 * @author lewismc
 *
 */
public class TRECQuery {


  /**
   * Chosen trec query to be executed over the 
   * {@link edu.stanford.eil.store.FedStore}
   */
  private String trecQuery;
  
  /**
   * Queries supported by {@link edu.stanford.eil.query.QueryManager}
   */
  private static final String supportedQueries[] = {"q7001", "q7002", "q7003", "q7004", "q7007", "q7008", "q7009", "q7010", "q7018", 
    "q7020", "q7023", "q7025", "q7026", "q7027", "q7029", "q7030", "q7031", "q7033", "q7034", "q7037", "q7039", "q7040", "q7042", "q7043", 
    "q7046", "q7047", "q7048", "q7050", "q7051", "q7052", "q7053", "q7054", "q7056", "q7057", "q7059", "q7060", "q7061", "q7062", "q7063", 
    "q7064", "q7065", "q7067", "q7068", "q7069", "q7070", "q7071", "q7073", "q7075", "q7076", "q7077", "q7078", "q7079", "q7080", "q7081", 
    "q7082", "q7083", "q7084", "q7087", "q7089", "q7090", "q7091", "q7093", "q7094", "q7095", "q7097", "q7098", "q7099", "q7100", "q7101", 
    "q7102", "q7103", "q7104", "q7105", "q7106", "q7108", "q7109", "q7110", "q7112", "q7115", "q7116", "q7118", "q7119", "q7120", "q7121", 
    "q7122", "q7124", "q7125", "q7126", "q7127", "q7128", "q7129", "q7130", "q7131", "q7132", "q7133", "q7134", "q7135", "q7136", "q7138", 
    "q7141", "q7142", "q7143", "q7144", "q7145", "q7147", "q7150", "q7152", "q7153", "q7154", "q7189", "q7209", "q7218", "q7219", "q7221", 
    "q7258", "q7259", "q7344", "q7348", "q7401", "q7403", "q7404", "q7405", "q7406", "q7407", "q7408", "q7409", "q7411", "q7412", "q7415", 
    "q7416", "q7417", "q7420", "q7421", "q7423", "q7424", "q7425", "q7426", "q7427", "q7428", "q7430", "q7432", "q7433", "q7434", "q7435", 
    "q7437", "q7438", "q7439", "q7440", "q7445", "q7446", "q7447", "q7449", "q7450", "q7451", "q7452", "q7453", "q7454", "q7456", "q7457", 
    "q7458", "q7459", "q7461", "q7463", "q7465", "q7466", "q7468", "q7469", "q7470", "q7471", "q7472", "q7473", "q7474", "q7475", "q7457", 
    "q7478", "q7479", "q7480", "q7481", "q7482", "q7483", "q7484", "q7485", "q7487", "q7488", "q7489", "q7490", "q7492", "q7493", "q7494", 
    "q7496", "q7497", "q7498", "q7499", "q7500", "q7502", "q7503", "q7504", "q7505", "q7506"}; 

  /**
   * HashMap containing supported queries names and corresponding 
   * text.
   */
  private HashMap<String, String> relatedQueries;

  private static final String q7001 = "LHC collision publications";
  
  private static final String q7002 = "exhaled NO IBS papers";   
 
  private static final String q7003 = "Male circumcision";  
  
  private static final String q7004 = "z-machine";
  
  private static final String q7007 = "Allen Ginsberg Howl review"; 
  
  private static final String q7008 = "jesse van ruller solo transcriptions";
  
  private static final String q7009 = "linkedin engineering";
  
  private static final String q7010 = "manchester united FC football";
  
  private static final String q7018 = "audiobook Raymond e feist";

  private static final String q7020 = "synovial joint";
  
  private static final String q7023 = "calculate jordan normal form";
  
  private static final String q7025 = "M/G/1 queue";
  
  private static final String q7026 = "keanu reeves films";
  
  private static final String q7027 = "prefered or preferred";
  
  private static final String q7029 = "best buy store closings"; 

  private static final String q7030 = "Lyrics Bangarang";
  
  private static final String q7031 = "Thomas test";
  
  private static final String q7033 = "Porto";
  
  private static final String q7034 = "sony vaio laptop";
  
  private static final String q7037 = "how to write journalistic review";
  
  private static final String q7039 = "import .csv excel";
  
  private static final String q7040 = "vom fass gent";
  
  private static final String q7042 = "bmw c1";
  
  private static final String q7043 = "rhapsody in blue sheet piano";
  
  private static final String q7046 = "tuning fork";
  
  private static final String q7047 = "Dewar flask";
  
  private static final String q7048 = "pictures auvergne";
  
  private static final String q7050 = "spotvps review";
  
  private static final String q7051 = "dinosaur names";
  
  private static final String q7052 = "hotel bruges";
  
  private static final String q7053 = "nintendo 3ds hack";
  
  private static final String q7054 = "yarra valley sightseeing";
  
  private static final String q7056 = "ROADM";
  
  private static final String q7057 = "web of science";
  
  private static final String q7059 = "doctor Amsterdam";
  
  private static final String q7060 = "jobs IBCN";
  
  private static final String q7061 = "startup advisors chicago";
  
  private static final String q7062 = "marquette university news";
  
  private static final String q7063 = "Spanish unemployment";
  
  private static final String q7064 = "Korea weather";
  
  private static final String q7065 = "disney easter dessert recipes";
  
  private static final String q7067 = "used kindle";
  
  private static final String q7068 = "Speech and Language Processing: An Introduction to Natural Language Processing, Computational Linguistics, and Speech Recognition";
  
  private static final String q7069 = "Eames chair";
  
  private static final String q7070 = "compact flash memory card";

  private static final String q7071 = "buy LP politics yellowjackets";
  
  private static final String q7073 = "buy bausack";
  
  private static final String q7075 = "zimerman chopin ballade";
  
  private static final String q7076 = "Bouguereau";
  
  private static final String q7077 = "django django";
  
  private static final String q7078 = "count in korean";
  
  private static final String q7079 = "a-team theme music";
  
  private static final String q7080 = "lord of the rings hobbits theme";
  
  private static final String q7081 = "translation bloopers";
  
  private static final String q7082 = "The raven";
  
  private static final String q7083 = "I'm on the road again";
  
  private static final String q7084 = "Burn after reading review";
  
  private static final String q7087 = "Jonathan Kreisberg discography";
  
  private static final String q7089 = "varese ionisation";
  
  private static final String q7090 = "eurovision 2012";
  
  private static final String q7091 = "don't listen to a word i say";
  
  private static final String q7093 = "What do i need to go fly fishing?";
  
  private static final String q7094 = "calculate inertia sphere";
  
  private static final String q7095 = "iron in water supply";
  
  private static final String q7096 = "touchpad scroll dell latitude";
  
  private static final String q7097 = "best dum blonds";
  
  private static final String q7098 = "tour moscow";
  
  private static final String q7099 = "lecture manova";
  
  private static final String q7100 = "korean bbq san francisco review";
  
  private static final String q7101 = "innodb versus myisam";
  
  private static final String q7102 = "vlc mac";
  
  private static final String q7103 = "cystic fibrosis treatment";
  
  private static final String q7104 = "How to go from New York to Montreal";
  
  private static final String q7105 = "dark knight rises dvd";
  
  private static final String q7106 = "active learning survey";
  
  private static final String q7108 = "renting car seattle";
  
  private static final String q7109 = "best place to eat pho in new york";
  
  private static final String q7110 = "civil engineering jobs pennsylvania";
  
  private static final String q7112 = "facebook icons";
  
  private static final String q7115 = "pittsburgh steelers news";
  
  private static final String q7116 = "pumpkin pie recipe";
  
  private static final String q7118 = "part time jobs texas city";
  
  private static final String q7119 = "chocolate photo";
  
  private static final String q7120 = "tortellini pasta salad";
  
  private static final String q7121 = "who is the man in the m&m commercial";
  
  private static final String q7122 = "horse dog pics";
  
  private static final String q7124 = "yves saint laurent boots";
  
  private static final String q7125 = "psychological effects of obesity in children";
  
  private static final String q7126 = "alicia keys brand new me lyrics";
  
  private static final String q7127 = "which cities surround long beach ca";
  
  private static final String q7128 = "where to donate clothes in nyc";
  
  private static final String q7129 = "avg home edition";
  
  private static final String q7130 = "l1 versus l2 regularization";
  
  private static final String q7131 = "golf games";
  
  private static final String q7132 = "massachusetts general hospital jobs";
  
  private static final String q7133 = "museum of natural history";
  
  private static final String q7134 = "history of yoga";
  
  private static final String q7135 = "Ahmed Dogan assassination";
  
  private static final String q7136 = "Soccer trick";
  
  private static final String q7138 = "lance armstrong oprah";
  
  private static final String q7141 = "Cambridge must do";
  
  private static final String q7142 = "Amsterdam museums";
  
  private static final String q7143 = "from dusseldorf to washington dc";
  
  private static final String q7144 = "can headphones cause hearing loss";
  
  private static final String q7145 = "why do cats purr";
  
  private static final String q7147 = "breast cancer review";
  
  private static final String q7150 = "senior java developer";
  
  private static final String q7152 = "haskell hash string";
  
  private static final String q7153 = "pig latin help";
  
  private static final String q7154 = "stones satisfaction";
  
  private static final String q7189 = "judiciary act 1789";
  
  private static final String q7209 = "crab dip appetizer";
  
  private static final String q7218 = "edward kennedy";
  
  private static final String q7219 = "\"honda insight\"";
  
  private static final String q7221 = "what is mittelschmerz";
  
  private static final String q7258 = "swahili dishes";
  
  private static final String q7259 = "radish root";
  
  private static final String q7344 = "pampered chef";
  
  private static final String q7348 = "map of the united states";
  
  private static final String q7401 = "yo mama jokes";
  
  private static final String q7403 = "usc trojans";
  
  private static final String q7404 = "kobe bryant";
  
  private static final String q7405 = "light therapy";
  
  private static final String q7406 = "does my child have adhd";
  
  private static final String q7407 = "kim kardashian pregnant";
  
  private static final String q7408 = "tom cruise";
  
  private static final String q7409 = "rihanna chris brown";
  
  private static final String q7411 = "lenin mausoleum open";

  private static final String q7412 = "when queen elisabeth";
  
  private static final String q7415 = "most anticipated games of 2013";
  
  private static final String q7416 = "release date bioshock infinite";
  
  private static final String q7417 = "dota 2 heroes";
  
  private static final String q7420 = "Badland game for iphone";
  
  private static final String q7421 = "story magic flute";
  
  private static final String q7423 = "postdoc jobs european university biotech";
  
  private static final String q7424 = "best italian food Rome";
  
  private static final String q7425 = "coloring picture cars";
  
  private static final String q7426 = "game bmx boy";
  
  private static final String q7427 = "k3 mamase";
  
  private static final String q7428 = "rainy afternoon kids craft";
  
  private static final String q7430 = "conflict mali";
  
  private static final String q7432 = "ticket to mars";
  
  private static final String q7433 = "747-8";
  
  private static final String q7434 = "wellness hotel Maastricht";
  
  private static final String q7435 = "trendy bar Berlin";
  
  private static final String q7437 = "free aldi meyola songs";
  
  private static final String q7438 = "facebook privacy";
  
  private static final String q7439 = "make crown";
  
  private static final String q7440 = "barcelona real madrid";
  
  private static final String q7445 = "marathon training";
  
  private static final String q7446 = "cycling on the mont ventoux";
  
  private static final String q7447 = "running shoes";
  
  private static final String q7449 = "Asics GT 2000";
  
  private static final String q7450 = "thailand individual travel";
  
  private static final String q7451 = "buy animal farm";
  
  private static final String q7452 = "arizona game and fish homepage";
  
  private static final String q7453 = "pc 2 games reviews";
  
  private static final String q7454 = "inuyasha pics";
  
  private static final String q7456 = "gps reviews";
  
  private static final String q7457 = "the music man lyrics";
  
  private static final String q7458 = "rice recipe";
  
  private static final String q7459 = "little johnny jokes";
  
  private static final String q7461 = "navalni trial latest news";
  
  private static final String q7463 = "hollywood actress";
  
  private static final String q7465 = "xman sequel ";
  
  private static final String q7466 = "interconnects skin effect";
  
  private static final String q7468 = "car change radiator fluid";
  
  private static final String q7469 = "ibm thinkpad t43 change fan";
  
  private static final String q7470 = "is sugar poison";
  
  private static final String q7471 = "php foreach";
  
  private static final String q7472 = "python re tutorial";
  
  private static final String q7473 = "noise canceling head phones";
  
  private static final String q7474 = "php convert special symbols to html ";
  
  private static final String q7475 = "software consultant work at home";
  
  private static final String q7477 = "china bird flu";
  
  private static final String q7478 = "protect kids online";

  private static final String q7479 = "dunbar number social networks";
  
  private static final String q7480 = "phd comics";
  
  private static final String q7481 = "worms nexus 7";
  
  private static final String q7482 = "popular twitter stars";
  
  private static final String q7483 = "facebook paying?";
  
  private static final String q7484 = "earthquake";
  
  private static final String q7485 = "bachelor party jokes";
  
  private static final String q7487 = "april fools day ideas";
  
  private static final String q7488 = "DIY shops london open sunday ";
  
  private static final String q7489 = "make skull mask";
  
  private static final String q7490 = "convert wav mp3";
  
  private static final String q7492 = "oldest jokes";
  
  private static final String q7493 = "islam discussions social media";
  
  private static final String q7494 = "cartoons festival ";
  
  private static final String q7496 = "why IEEE member";
  
  private static final String q7497 = "shostakovich life";
  
  private static final String q7498 = "syria chemical weapons";
  
  private static final String q7499 = "gold price";
  
  private static final String q7500 = "roof isolation";
  
  private static final String q7502 = "baby todler snowsuit";
  
  private static final String q7503 = "uki";
  
  private static final String q7504 = "leiden schools";
  
  private static final String q7505 = "ethnic myanmar";
  
  private static final String q7506 = "I touch myself singer dead";

  /**
   * @param trecQuery 
   */
  public TRECQuery(String pTrecQuery) {
    this.initializeRelations();
    this.setQueryName(pTrecQuery);
  }

  /**
   * Initializes relations between supported query id's and query text
   */
  public void initializeRelations(){
    relatedQueries = new HashMap<String, String>();
    try {
        for (String queryValue : supportedQueries) {
          String var = (String) this.getClass().getDeclaredField(queryValue).get(queryValue);
          relatedQueries.put(queryValue,var);
        }
    } catch (SecurityException e) {
      e.printStackTrace();
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    }
  }

  /**
   *Set the query content for the TRECQuery object.
   *
   */  
  public void setQueryName(String pQueryName) {
    this.trecQuery = pQueryName;
  }
  
  /**
   * Get the query content for the TRECQuery object.
   * @return
   */
  public String getQuery() {
    return relatedQueries.get(trecQuery)!=null?relatedQueries.get(trecQuery):"";
  }
  
  /**
   * Get the TREC query name (id) for the TRECQuery object.
   * @return
   */
  public String getQueryId(){
    return trecQuery;
  }

}
