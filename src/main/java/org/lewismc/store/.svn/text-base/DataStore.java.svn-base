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

package edu.stanford.eil.store;

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
public class DataStore extends PersistentBase {
  public static final Schema _SCHEMA = Schema.parse("{\"type\":\"record\",\"name\":\"DataStore\",\"namespace\":\"edu.stanford.eil.store\",\"fields\":[{\"name\":\"goraDataStoreName\",\"type\":\"string\"},{\"name\":\"nativeDataStoreName\",\"type\":\"string\"},{\"name\":\"location\",\"type\":\"string\"},{\"name\":\"version\",\"type\":\"string\"},{\"name\":\"dataSize\",\"type\":\"long\"},{\"name\":\"numberOfDocs\",\"type\":\"int\"},{\"name\":\"dictionaryMap\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"contentType\",\"type\":\"string\"}]}");
  public static enum Field {
    GORA_DATA_STORE_NAME(0,"goraDataStoreName"),
    NATIVE_DATA_STORE_NAME(1,"nativeDataStoreName"),
    LOCATION(2,"location"),
    VERSION(3,"version"),
    DATA_SIZE(4,"dataSize"),
    NUMBER_OF_DOCS(5,"numberOfDocs"),
    DICTIONARY_MAP(6,"dictionaryMap"),
    CONTENT_TYPE(7,"contentType"),
    ;
    private int index;
    private String name;
    Field(int index, String name) {this.index=index;this.name=name;}
    public int getIndex() {return index;}
    public String getName() {return name;}
    public String toString() {return name;}
  };
  public static final String[] _ALL_FIELDS = {"goraDataStoreName","nativeDataStoreName","location","version","dataSize","numberOfDocs","dictionaryMap","contentType",};
  static {
    PersistentBase.registerFields(DataStore.class, _ALL_FIELDS);
  }
  private Utf8 goraDataStoreName;
  private Utf8 nativeDataStoreName;
  private Utf8 location;
  private Utf8 version;
  private long dataSize;
  private int numberOfDocs;
  private Map<Utf8,Utf8> dictionaryMap;
  private Utf8 contentType;
  public DataStore() {
    this(new StateManagerImpl());
  }
  public DataStore(StateManager stateManager) {
    super(stateManager);
    dictionaryMap = new StatefulHashMap<Utf8,Utf8>();
  }
  public DataStore newInstance(StateManager stateManager) {
    return new DataStore(stateManager);
  }
  public Schema getSchema() { return _SCHEMA; }
  public Object get(int _field) {
    switch (_field) {
    case 0: return goraDataStoreName;
    case 1: return nativeDataStoreName;
    case 2: return location;
    case 3: return version;
    case 4: return dataSize;
    case 5: return numberOfDocs;
    case 6: return dictionaryMap;
    case 7: return contentType;
    default: throw new AvroRuntimeException("Bad index");
    }
  }
  @SuppressWarnings(value="unchecked")
  public void put(int _field, Object _value) {
    if(isFieldEqual(_field, _value)) return;
    getStateManager().setDirty(this, _field);
    switch (_field) {
    case 0:goraDataStoreName = (Utf8)_value; break;
    case 1:nativeDataStoreName = (Utf8)_value; break;
    case 2:location = (Utf8)_value; break;
    case 3:version = (Utf8)_value; break;
    case 4:dataSize = (Long)_value; break;
    case 5:numberOfDocs = (Integer)_value; break;
    case 6:dictionaryMap = (Map<Utf8,Utf8>)_value; break;
    case 7:contentType = (Utf8)_value; break;
    default: throw new AvroRuntimeException("Bad index");
    }
  }
  public Utf8 getGoraDataStoreName() {
    return (Utf8) get(0);
  }
  public void setGoraDataStoreName(Utf8 value) {
    put(0, value);
  }
  public Utf8 getNativeDataStoreName() {
    return (Utf8) get(1);
  }
  public void setNativeDataStoreName(Utf8 value) {
    put(1, value);
  }
  public Utf8 getLocation() {
    return (Utf8) get(2);
  }
  public void setLocation(Utf8 value) {
    put(2, value);
  }
  public Utf8 getVersion() {
    return (Utf8) get(3);
  }
  public void setVersion(Utf8 value) {
    put(3, value);
  }
  public long getDataSize() {
    return (Long) get(4);
  }
  public void setDataSize(long value) {
    put(4, value);
  }
  public int getNumberOfDocs() {
    return (Integer) get(5);
  }
  public void setNumberOfDocs(int value) {
    put(5, value);
  }
  public Map<Utf8, Utf8> getDictionaryMap() {
    return (Map<Utf8, Utf8>) get(6);
  }
  public Utf8 getFromDictionaryMap(Utf8 key) {
    if (dictionaryMap == null) { return null; }
    return dictionaryMap.get(key);
  }
  public void putToDictionaryMap(Utf8 key, Utf8 value) {
    getStateManager().setDirty(this, 6);
    dictionaryMap.put(key, value);
  }
  public Utf8 removeFromDictionaryMap(Utf8 key) {
    if (dictionaryMap == null) { return null; }
    getStateManager().setDirty(this, 6);
    return dictionaryMap.remove(key);
  }
  public Utf8 getContentType() {
    return (Utf8) get(7);
  }
  public void setContentType(Utf8 value) {
    put(7, value);
  }
}
