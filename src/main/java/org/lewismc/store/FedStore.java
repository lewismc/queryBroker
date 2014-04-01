/**
 *Licensed to the Apache Software Foundation (ASF) under one
 *or more contributor license agreements.  See the NOTICE file
 *distributed with this work for additional information
 *regarding copyright ownership.  The ASF licenses this file
 *to you under the Apache License, Version 2.0 (the"
 *License"); you may not use this file except in compliance
 *with the License.  You may obtain a copy of the License at
 *
  * http://www.apache.org/licenses/LICENSE-2.0
 * 
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */

package org.lewismc.store;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.HashMap;
import org.apache.avro.Protocol;
import org.apache.avro.Schema;
import org.apache.avro.AvroRuntimeException;
import org.apache.avro.Protocol;
import org.apache.avro.util.Utf8;
import org.apache.avro.ipc.AvroRemoteException;
import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.FixedSize;
import org.apache.avro.specific.SpecificExceptionBase;
import org.apache.avro.specific.SpecificRecordBase;
import org.apache.avro.specific.SpecificRecord;
import org.apache.avro.specific.SpecificFixed;
import org.apache.gora.persistency.StateManager;
import org.apache.gora.persistency.impl.PersistentBase;
import org.apache.gora.persistency.impl.StateManagerImpl;
import org.apache.gora.persistency.StatefulHashMap;
import org.apache.gora.persistency.ListGenericArray;

@SuppressWarnings("all")
public class FedStore extends PersistentBase {
  public static final Schema _SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"FedStore\",\"namespace\":\"org.lewismc.store\",\"fields\":[{\"name\":\"trecSearchEngineNameId\",\"type\":\"string\"},{\"name\":\"trecSearchEngineName\",\"type\":\"string\"},{\"name\":\"trecSearchEngineURL\",\"type\":\"string\"},{\"name\":\"dictionaryMap\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}]}");
  public static enum Field {
    TREC_SEARCH_ENGINE_NAME_ID(0,"trecSearchEngineNameId"),
    TREC_SEARCH_ENGINE_NAME(1,"trecSearchEngineName"),
    TREC_SEARCH_ENGINE_URL(2,"trecSearchEngineURL"),
    DICTIONARY_MAP(3,"dictionaryMap"),
    ;
    private int index;
    private String name;
    Field(int index, String name) {this.index=index;this.name=name;}
    public int getIndex() {return index;}
    public String getName() {return name;}
    public String toString() {return name;}
  };
  public static final String[] _ALL_FIELDS = {"trecSearchEngineNameId","trecSearchEngineName","trecSearchEngineURL","dictionaryMap",};
  static {
    PersistentBase.registerFields(FedStore.class, _ALL_FIELDS);
  }
  private Utf8 trecSearchEngineNameId;
  private Utf8 trecSearchEngineName;
  private Utf8 trecSearchEngineURL;
  private Map<Utf8,Utf8> dictionaryMap;
  public FedStore() {
    this(new StateManagerImpl());
  }
  public FedStore(StateManager stateManager) {
    super(stateManager);
    dictionaryMap = new StatefulHashMap<Utf8,Utf8>();
  }
  public FedStore newInstance(StateManager stateManager) {
    return new FedStore(stateManager);
  }
  public Schema getSchema() { return _SCHEMA; }
  public Object get(int _field) {
    switch (_field) {
    case 0: return trecSearchEngineNameId;
    case 1: return trecSearchEngineName;
    case 2: return trecSearchEngineURL;
    case 3: return dictionaryMap;
    default: throw new AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int key, Object _value) {
    if(isFieldEqual(key, _value)) return;
    getStateManager().setDirty(this, key);
    switch (key) {
    case 0:trecSearchEngineNameId = (Utf8)_value; break;
    case 1:trecSearchEngineName = (Utf8)_value; break;
    case 2:trecSearchEngineURL = (Utf8)_value; break;
    case 3:dictionaryMap = (Map<Utf8,Utf8>)_value; break;
    default: throw new AvroRuntimeException("Bad index");
    }
  }
  public Utf8 getTrecSearchEngineNameId() {
    return (Utf8) get(0);
  }
  public void setTrecSearchEngineNameId(Utf8 value) {
    put(0, value);
  }
  public Utf8 getTrecSearchEngineName() {
    return (Utf8) get(1);
  }
  public void setTrecSearchEngineName(Utf8 value) {
    put(1, value);
  }
  public Utf8 getTrecSearchEngineURL() {
    return (Utf8) get(2);
  }
  public void setTrecSearchEngineURL(Utf8 value) {
    put(2, value);
  }
  public Map<Utf8, Utf8> getDictionaryMap() {
    return (Map<Utf8, Utf8>) get(3);
  }
  public Utf8 getFromDictionaryMap(Utf8 key) {
    if (dictionaryMap == null) { return null; }
    return dictionaryMap.get(key);
  }
  public void putToDictionaryMap(Utf8 key, Utf8 value) {
    getStateManager().setDirty(this, 3);
    dictionaryMap.put(key, value);
  }
  public Utf8 removeFromDictionaryMap(Utf8 key) {
    if (dictionaryMap == null) { return null; }
    getStateManager().setDirty(this, 3);
    return dictionaryMap.remove(key);
  }
}
