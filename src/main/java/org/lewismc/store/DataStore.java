/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.lewismc.store;  
@SuppressWarnings("all")
/** Record containing Fields required to build a Query Broker */
public class DataStore extends org.apache.gora.persistency.impl.PersistentBase implements org.apache.avro.specific.SpecificRecord, org.apache.gora.persistency.Persistent {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataStore\",\"namespace\":\"org.lewismc.store\",\"doc\":\"Record containing Fields required to build a Query Broker\",\"fields\":[{\"name\":\"__g__dirty\",\"type\":\"bytes\",\"doc\":\"Bytes used to represent weather or not a field is dirty.\",\"default\":\"AA==\"},{\"name\":\"goraDataStoreName\",\"type\":[\"null\",\"string\"],\"doc\":\"The Gora DataStore reference\",\"default\":null},{\"name\":\"nativeDataStoreName\",\"type\":[\"null\",\"string\"],\"doc\":\"The native DataStore identifier\",\"default\":null},{\"name\":\"_ipAddress\",\"type\":[\"null\",\"string\"],\"doc\":\"The native DataStore IP Address\",\"default\":null},{\"name\":\"nativeDataStoreVersion\",\"type\":[\"null\",\"string\"],\"doc\":\"The native DataStore version\",\"default\":null},{\"name\":\"dataSize\",\"type\":\"long\",\"doc\":\"The data volume in this particular DataStore\",\"default\":0},{\"name\":\"numberOfRecords\",\"type\":\"int\",\"doc\":\"The number of individual objects in this DataStore\",\"default\":0},{\"name\":\"dictionaryMap\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"doc\":\"A Map contaning token --> tf-idf mappings\",\"default\":{}}]}");

  /** Enum containing all data bean's fields. */
  public static enum Field {
    __G__DIRTY(0, "__g__dirty"),
    GORA_DATA_STORE_NAME(1, "goraDataStoreName"),
    NATIVE_DATA_STORE_NAME(2, "nativeDataStoreName"),
    _IP_ADDRESS(3, "_ipAddress"),
    NATIVE_DATA_STORE_VERSION(4, "nativeDataStoreVersion"),
    DATA_SIZE(5, "dataSize"),
    NUMBER_OF_RECORDS(6, "numberOfRecords"),
    DICTIONARY_MAP(7, "dictionaryMap"),
    ;
    /**
     * Field's index.
     */
    private int index;

    /**
     * Field's name.
     */
    private String name;

    /**
     * Field's constructor
     * @param index field's index.
     * @param name field's name.
     */
    Field(int index, String name) {this.index=index;this.name=name;}

    /**
     * Gets field's index.
     * @return int field's index.
     */
    public int getIndex() {return index;}

    /**
     * Gets field's name.
     * @return String field's name.
     */
    public String getName() {return name;}

    /**
     * Gets field's attributes to string.
     * @return String field's attributes to string.
     */
    public String toString() {return name;}
  };

  public static final String[] _ALL_FIELDS = {
  "__g__dirty",
  "goraDataStoreName",
  "nativeDataStoreName",
  "_ipAddress",
  "nativeDataStoreVersion",
  "dataSize",
  "numberOfRecords",
  "dictionaryMap",
  };

  /** Bytes used to represent weather or not a field is dirty. */
  private java.nio.ByteBuffer __g__dirty = java.nio.ByteBuffer.wrap(new byte[2]);
  /** The Gora DataStore reference */
  private java.lang.CharSequence goraDataStoreName;
  /** The native DataStore identifier */
  private java.lang.CharSequence nativeDataStoreName;
  /** The native DataStore IP Address */
  private java.lang.CharSequence _ipAddress;
  /** The native DataStore version */
  private java.lang.CharSequence nativeDataStoreVersion;
  /** The data volume in this particular DataStore */
  private long dataSize;
  /** The number of individual objects in this DataStore */
  private int numberOfRecords;
  /** A Map contaning token --> tf-idf mappings */
  private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> dictionaryMap;
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return __g__dirty;
    case 1: return goraDataStoreName;
    case 2: return nativeDataStoreName;
    case 3: return _ipAddress;
    case 4: return nativeDataStoreVersion;
    case 5: return dataSize;
    case 6: return numberOfRecords;
    case 7: return dictionaryMap;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value) {
    switch (field$) {
    case 0: __g__dirty = (java.nio.ByteBuffer)(value); break;
    case 1: goraDataStoreName = (java.lang.CharSequence)(value); break;
    case 2: nativeDataStoreName = (java.lang.CharSequence)(value); break;
    case 3: _ipAddress = (java.lang.CharSequence)(value); break;
    case 4: nativeDataStoreVersion = (java.lang.CharSequence)(value); break;
    case 5: dataSize = (java.lang.Long)(value); break;
    case 6: numberOfRecords = (java.lang.Integer)(value); break;
    case 7: dictionaryMap = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)((value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyMapWrapper((java.util.Map)value)); break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'goraDataStoreName' field.
   * The Gora DataStore reference   */
  public java.lang.CharSequence getGoraDataStoreName() {
    return goraDataStoreName;
  }

  /**
   * Sets the value of the 'goraDataStoreName' field.
   * The Gora DataStore reference   * @param value the value to set.
   */
  public void setGoraDataStoreName(java.lang.CharSequence value) {
    this.goraDataStoreName = value;
    setDirty(1);
  }
  
  /**
   * Checks the dirty status of the 'goraDataStoreName' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The Gora DataStore reference   * @param value the value to set.
   */
  public boolean isGoraDataStoreNameDirty(java.lang.CharSequence value) {
    return isDirty(1);
  }

  /**
   * Gets the value of the 'nativeDataStoreName' field.
   * The native DataStore identifier   */
  public java.lang.CharSequence getNativeDataStoreName() {
    return nativeDataStoreName;
  }

  /**
   * Sets the value of the 'nativeDataStoreName' field.
   * The native DataStore identifier   * @param value the value to set.
   */
  public void setNativeDataStoreName(java.lang.CharSequence value) {
    this.nativeDataStoreName = value;
    setDirty(2);
  }
  
  /**
   * Checks the dirty status of the 'nativeDataStoreName' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The native DataStore identifier   * @param value the value to set.
   */
  public boolean isNativeDataStoreNameDirty(java.lang.CharSequence value) {
    return isDirty(2);
  }

  /**
   * Gets the value of the '_ipAddress' field.
   * The native DataStore IP Address   */
  public java.lang.CharSequence getIpAddress$1() {
    return _ipAddress;
  }

  /**
   * Sets the value of the '_ipAddress' field.
   * The native DataStore IP Address   * @param value the value to set.
   */
  public void setIpAddress$1(java.lang.CharSequence value) {
    this._ipAddress = value;
    setDirty(3);
  }
  
  /**
   * Checks the dirty status of the '_ipAddress' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The native DataStore IP Address   * @param value the value to set.
   */
  public boolean isIpAddress$1Dirty(java.lang.CharSequence value) {
    return isDirty(3);
  }

  /**
   * Gets the value of the 'nativeDataStoreVersion' field.
   * The native DataStore version   */
  public java.lang.CharSequence getNativeDataStoreVersion() {
    return nativeDataStoreVersion;
  }

  /**
   * Sets the value of the 'nativeDataStoreVersion' field.
   * The native DataStore version   * @param value the value to set.
   */
  public void setNativeDataStoreVersion(java.lang.CharSequence value) {
    this.nativeDataStoreVersion = value;
    setDirty(4);
  }
  
  /**
   * Checks the dirty status of the 'nativeDataStoreVersion' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The native DataStore version   * @param value the value to set.
   */
  public boolean isNativeDataStoreVersionDirty(java.lang.CharSequence value) {
    return isDirty(4);
  }

  /**
   * Gets the value of the 'dataSize' field.
   * The data volume in this particular DataStore   */
  public java.lang.Long getDataSize() {
    return dataSize;
  }

  /**
   * Sets the value of the 'dataSize' field.
   * The data volume in this particular DataStore   * @param value the value to set.
   */
  public void setDataSize(java.lang.Long value) {
    this.dataSize = value;
    setDirty(5);
  }
  
  /**
   * Checks the dirty status of the 'dataSize' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The data volume in this particular DataStore   * @param value the value to set.
   */
  public boolean isDataSizeDirty(java.lang.Long value) {
    return isDirty(5);
  }

  /**
   * Gets the value of the 'numberOfRecords' field.
   * The number of individual objects in this DataStore   */
  public java.lang.Integer getNumberOfRecords() {
    return numberOfRecords;
  }

  /**
   * Sets the value of the 'numberOfRecords' field.
   * The number of individual objects in this DataStore   * @param value the value to set.
   */
  public void setNumberOfRecords(java.lang.Integer value) {
    this.numberOfRecords = value;
    setDirty(6);
  }
  
  /**
   * Checks the dirty status of the 'numberOfRecords' field. A field is dirty if it represents a change that has not yet been written to the database.
   * The number of individual objects in this DataStore   * @param value the value to set.
   */
  public boolean isNumberOfRecordsDirty(java.lang.Integer value) {
    return isDirty(6);
  }

  /**
   * Gets the value of the 'dictionaryMap' field.
   * A Map contaning token --> tf-idf mappings   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getDictionaryMap() {
    return dictionaryMap;
  }

  /**
   * Sets the value of the 'dictionaryMap' field.
   * A Map contaning token --> tf-idf mappings   * @param value the value to set.
   */
  public void setDictionaryMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.dictionaryMap = (value instanceof org.apache.gora.persistency.Dirtyable) ? value : new org.apache.gora.persistency.impl.DirtyMapWrapper(value);
    setDirty(7);
  }
  
  /**
   * Checks the dirty status of the 'dictionaryMap' field. A field is dirty if it represents a change that has not yet been written to the database.
   * A Map contaning token --> tf-idf mappings   * @param value the value to set.
   */
  public boolean isDictionaryMapDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    return isDirty(7);
  }

  /** Creates a new DataStore RecordBuilder */
  public static org.lewismc.store.DataStore.Builder newBuilder() {
    return new org.lewismc.store.DataStore.Builder();
  }
  
  /** Creates a new DataStore RecordBuilder by copying an existing Builder */
  public static org.lewismc.store.DataStore.Builder newBuilder(org.lewismc.store.DataStore.Builder other) {
    return new org.lewismc.store.DataStore.Builder(other);
  }
  
  /** Creates a new DataStore RecordBuilder by copying an existing DataStore instance */
  public static org.lewismc.store.DataStore.Builder newBuilder(org.lewismc.store.DataStore other) {
    return new org.lewismc.store.DataStore.Builder(other);
  }
  
  private static java.nio.ByteBuffer deepCopyToWriteOnlyBuffer(
      java.nio.ByteBuffer input) {
    java.nio.ByteBuffer copy = java.nio.ByteBuffer.allocate(input.capacity());
    int position = input.position();
    input.reset();
    int mark = input.position();
    int limit = input.limit();
    input.rewind();
    input.limit(input.capacity());
    copy.put(input);
    input.rewind();
    copy.rewind();
    input.position(mark);
    input.mark();
    copy.position(mark);
    copy.mark();
    input.position(position);
    copy.position(position);
    input.limit(limit);
    copy.limit(limit);
    return copy.asReadOnlyBuffer();
  }
  
  /**
   * RecordBuilder for DataStore instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataStore>
    implements org.apache.avro.data.RecordBuilder<DataStore> {

    private java.nio.ByteBuffer __g__dirty;
    private java.lang.CharSequence goraDataStoreName;
    private java.lang.CharSequence nativeDataStoreName;
    private java.lang.CharSequence _ipAddress;
    private java.lang.CharSequence nativeDataStoreVersion;
    private long dataSize;
    private int numberOfRecords;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> dictionaryMap;

    /** Creates a new Builder */
    private Builder() {
      super(org.lewismc.store.DataStore.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.lewismc.store.DataStore.Builder other) {
      super(other);
    }
    
    /** Creates a Builder by copying an existing DataStore instance */
    private Builder(org.lewismc.store.DataStore other) {
            super(org.lewismc.store.DataStore.SCHEMA$);
      if (isValidValue(fields()[0], other.__g__dirty)) {
        this.__g__dirty = (java.nio.ByteBuffer) data().deepCopy(fields()[0].schema(), other.__g__dirty);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.goraDataStoreName)) {
        this.goraDataStoreName = (java.lang.CharSequence) data().deepCopy(fields()[1].schema(), other.goraDataStoreName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.nativeDataStoreName)) {
        this.nativeDataStoreName = (java.lang.CharSequence) data().deepCopy(fields()[2].schema(), other.nativeDataStoreName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other._ipAddress)) {
        this._ipAddress = (java.lang.CharSequence) data().deepCopy(fields()[3].schema(), other._ipAddress);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.nativeDataStoreVersion)) {
        this.nativeDataStoreVersion = (java.lang.CharSequence) data().deepCopy(fields()[4].schema(), other.nativeDataStoreVersion);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.dataSize)) {
        this.dataSize = (java.lang.Long) data().deepCopy(fields()[5].schema(), other.dataSize);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.numberOfRecords)) {
        this.numberOfRecords = (java.lang.Integer) data().deepCopy(fields()[6].schema(), other.numberOfRecords);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.dictionaryMap)) {
        this.dictionaryMap = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) data().deepCopy(fields()[7].schema(), other.dictionaryMap);
        fieldSetFlags()[7] = true;
      }
    }

    /** Gets the value of the 'goraDataStoreName' field */
    public java.lang.CharSequence getGoraDataStoreName() {
      return goraDataStoreName;
    }
    
    /** Sets the value of the 'goraDataStoreName' field */
    public org.lewismc.store.DataStore.Builder setGoraDataStoreName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.goraDataStoreName = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'goraDataStoreName' field has been set */
    public boolean hasGoraDataStoreName() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'goraDataStoreName' field */
    public org.lewismc.store.DataStore.Builder clearGoraDataStoreName() {
      goraDataStoreName = null;
      fieldSetFlags()[1] = false;
      return this;
    }
    
    /** Gets the value of the 'nativeDataStoreName' field */
    public java.lang.CharSequence getNativeDataStoreName() {
      return nativeDataStoreName;
    }
    
    /** Sets the value of the 'nativeDataStoreName' field */
    public org.lewismc.store.DataStore.Builder setNativeDataStoreName(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.nativeDataStoreName = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'nativeDataStoreName' field has been set */
    public boolean hasNativeDataStoreName() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'nativeDataStoreName' field */
    public org.lewismc.store.DataStore.Builder clearNativeDataStoreName() {
      nativeDataStoreName = null;
      fieldSetFlags()[2] = false;
      return this;
    }
    
    /** Gets the value of the '_ipAddress' field */
    public java.lang.CharSequence getIpAddress$1() {
      return _ipAddress;
    }
    
    /** Sets the value of the '_ipAddress' field */
    public org.lewismc.store.DataStore.Builder setIpAddress$1(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this._ipAddress = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the '_ipAddress' field has been set */
    public boolean hasIpAddress$1() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the '_ipAddress' field */
    public org.lewismc.store.DataStore.Builder clearIpAddress$1() {
      _ipAddress = null;
      fieldSetFlags()[3] = false;
      return this;
    }
    
    /** Gets the value of the 'nativeDataStoreVersion' field */
    public java.lang.CharSequence getNativeDataStoreVersion() {
      return nativeDataStoreVersion;
    }
    
    /** Sets the value of the 'nativeDataStoreVersion' field */
    public org.lewismc.store.DataStore.Builder setNativeDataStoreVersion(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.nativeDataStoreVersion = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'nativeDataStoreVersion' field has been set */
    public boolean hasNativeDataStoreVersion() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'nativeDataStoreVersion' field */
    public org.lewismc.store.DataStore.Builder clearNativeDataStoreVersion() {
      nativeDataStoreVersion = null;
      fieldSetFlags()[4] = false;
      return this;
    }
    
    /** Gets the value of the 'dataSize' field */
    public java.lang.Long getDataSize() {
      return dataSize;
    }
    
    /** Sets the value of the 'dataSize' field */
    public org.lewismc.store.DataStore.Builder setDataSize(long value) {
      validate(fields()[5], value);
      this.dataSize = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'dataSize' field has been set */
    public boolean hasDataSize() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'dataSize' field */
    public org.lewismc.store.DataStore.Builder clearDataSize() {
      fieldSetFlags()[5] = false;
      return this;
    }
    
    /** Gets the value of the 'numberOfRecords' field */
    public java.lang.Integer getNumberOfRecords() {
      return numberOfRecords;
    }
    
    /** Sets the value of the 'numberOfRecords' field */
    public org.lewismc.store.DataStore.Builder setNumberOfRecords(int value) {
      validate(fields()[6], value);
      this.numberOfRecords = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'numberOfRecords' field has been set */
    public boolean hasNumberOfRecords() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'numberOfRecords' field */
    public org.lewismc.store.DataStore.Builder clearNumberOfRecords() {
      fieldSetFlags()[6] = false;
      return this;
    }
    
    /** Gets the value of the 'dictionaryMap' field */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getDictionaryMap() {
      return dictionaryMap;
    }
    
    /** Sets the value of the 'dictionaryMap' field */
    public org.lewismc.store.DataStore.Builder setDictionaryMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[7], value);
      this.dictionaryMap = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'dictionaryMap' field has been set */
    public boolean hasDictionaryMap() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'dictionaryMap' field */
    public org.lewismc.store.DataStore.Builder clearDictionaryMap() {
      dictionaryMap = null;
      fieldSetFlags()[7] = false;
      return this;
    }
    
    @Override
    public DataStore build() {
      try {
        DataStore record = new DataStore();
        record.__g__dirty = fieldSetFlags()[0] ? this.__g__dirty : (java.nio.ByteBuffer) java.nio.ByteBuffer.wrap(new byte[2]);
        record.goraDataStoreName = fieldSetFlags()[1] ? this.goraDataStoreName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.nativeDataStoreName = fieldSetFlags()[2] ? this.nativeDataStoreName : (java.lang.CharSequence) defaultValue(fields()[2]);
        record._ipAddress = fieldSetFlags()[3] ? this._ipAddress : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.nativeDataStoreVersion = fieldSetFlags()[4] ? this.nativeDataStoreVersion : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.dataSize = fieldSetFlags()[5] ? this.dataSize : (java.lang.Long) defaultValue(fields()[5]);
        record.numberOfRecords = fieldSetFlags()[6] ? this.numberOfRecords : (java.lang.Integer) defaultValue(fields()[6]);
        record.dictionaryMap = fieldSetFlags()[7] ? this.dictionaryMap : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) new org.apache.gora.persistency.impl.DirtyMapWrapper((java.util.Map)defaultValue(fields()[7]));
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
  
  public DataStore.Tombstone getTombstone(){
  	return TOMBSTONE;
  }

  public DataStore newInstance(){
    return newBuilder().build();
  }

  private static final Tombstone TOMBSTONE = new Tombstone();
  
  public static final class Tombstone extends DataStore implements org.apache.gora.persistency.Tombstone {
  
      private Tombstone() { }
  
	  				  /**
	   * Gets the value of the 'goraDataStoreName' field.
	   * The Gora DataStore reference	   */
	  public java.lang.CharSequence getGoraDataStoreName() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'goraDataStoreName' field.
	   * The Gora DataStore reference	   * @param value the value to set.
	   */
	  public void setGoraDataStoreName(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'goraDataStoreName' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The Gora DataStore reference	   * @param value the value to set.
	   */
	  public boolean isGoraDataStoreNameDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'nativeDataStoreName' field.
	   * The native DataStore identifier	   */
	  public java.lang.CharSequence getNativeDataStoreName() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'nativeDataStoreName' field.
	   * The native DataStore identifier	   * @param value the value to set.
	   */
	  public void setNativeDataStoreName(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'nativeDataStoreName' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The native DataStore identifier	   * @param value the value to set.
	   */
	  public boolean isNativeDataStoreNameDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the '_ipAddress' field.
	   * The native DataStore IP Address	   */
	  public java.lang.CharSequence getIpAddress$1() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the '_ipAddress' field.
	   * The native DataStore IP Address	   * @param value the value to set.
	   */
	  public void setIpAddress$1(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the '_ipAddress' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The native DataStore IP Address	   * @param value the value to set.
	   */
	  public boolean isIpAddress$1Dirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'nativeDataStoreVersion' field.
	   * The native DataStore version	   */
	  public java.lang.CharSequence getNativeDataStoreVersion() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'nativeDataStoreVersion' field.
	   * The native DataStore version	   * @param value the value to set.
	   */
	  public void setNativeDataStoreVersion(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'nativeDataStoreVersion' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The native DataStore version	   * @param value the value to set.
	   */
	  public boolean isNativeDataStoreVersionDirty(java.lang.CharSequence value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'dataSize' field.
	   * The data volume in this particular DataStore	   */
	  public java.lang.Long getDataSize() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'dataSize' field.
	   * The data volume in this particular DataStore	   * @param value the value to set.
	   */
	  public void setDataSize(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'dataSize' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The data volume in this particular DataStore	   * @param value the value to set.
	   */
	  public boolean isDataSizeDirty(java.lang.Long value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'numberOfRecords' field.
	   * The number of individual objects in this DataStore	   */
	  public java.lang.Integer getNumberOfRecords() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'numberOfRecords' field.
	   * The number of individual objects in this DataStore	   * @param value the value to set.
	   */
	  public void setNumberOfRecords(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'numberOfRecords' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * The number of individual objects in this DataStore	   * @param value the value to set.
	   */
	  public boolean isNumberOfRecordsDirty(java.lang.Integer value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
				  /**
	   * Gets the value of the 'dictionaryMap' field.
	   * A Map contaning token --> tf-idf mappings	   */
	  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getDictionaryMap() {
	    throw new java.lang.UnsupportedOperationException("Get is not supported on tombstones");
	  }
	
	  /**
	   * Sets the value of the 'dictionaryMap' field.
	   * A Map contaning token --> tf-idf mappings	   * @param value the value to set.
	   */
	  public void setDictionaryMap(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("Set is not supported on tombstones");
	  }
	  
	  /**
	   * Checks the dirty status of the 'dictionaryMap' field. A field is dirty if it represents a change that has not yet been written to the database.
	   * A Map contaning token --> tf-idf mappings	   * @param value the value to set.
	   */
	  public boolean isDictionaryMapDirty(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
	    throw new java.lang.UnsupportedOperationException("IsDirty is not supported on tombstones");
	  }
	
		  
  }
  
}