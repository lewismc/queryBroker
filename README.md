queryBroker
===========

Written by lewismc 
lewismc@apache.org

This project explores the use of Apache Gora as a query broker [0] which can be used within a federated web search scenario.
This work is motivated by the TREC Federated Web Search track [1].

Introduction
------------

Essentially, the code aims to implement a 'query broker' using
Apache Gora [0] for object-to-datastore mapping and data persistence.
Apache Gora, as an open source framework, provides an in-memory data model 
and persistence for big data. Gora supports persisting to column stores, 
key value stores, document stores and RDBMSs, and analyzing the data with 
extensive Apache Hadoop MapReduce support. 

The task can be broken in to three parts, namely

 - Vertical Selection: where the participants have to predict the quality of 
                       the different verticals for a particular query (for 
                       instance sports, news, or images). A set of relevant 
                       verticals should be selected for each test topic.

 - Resource Selection: where for some given query we must select only
                       th relevant data sources for which to execute 
                       the query on, and
                       
 - Results Merging:    given a number of hits for any given query, merge 
                       the results into a single ranked list. The algorithm 
                       which is used here is known as 'normalized discounted
                       cumulative gain'. 

Project Structure
-----------------

 - bin              - a directory containing scripts for invoking various commands relating to
                      data persistence, processing and analysis.  
 - conf             - storage directory for datastore specific data mappings and TREC queries.
 - dictionaryMap    - Contains term frequency-inverse document frequency (tf-idf) dictionary maps
                      of the various search engine data sources. These dictionary maps can be used
                      to assess relevancy judgements for appropriate data sources within the resource
                      selection task.
 - lib              - directory for publically available third party libraries
 - lib-ext          - directory for private or SNAPSHOT development libraries
 - pom.xml          - the main Maven build file
 - README.md        - this file
 - src              - the source code for this project. This contains the query broker deployment 
                      itself as well as some additional tools and implementations. 
                      
Finally
-------
Any issues or comments should be sent to lewismc@apache.org

[0] http://gora.apache.org 
[1] https://sites.google.com/site/trecfedweb/
