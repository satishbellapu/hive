/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.hadoop.hive.metastore.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-10-5")
public class MetadataPpdResult implements org.apache.thrift.TBase<MetadataPpdResult, MetadataPpdResult._Fields>, java.io.Serializable, Cloneable, Comparable<MetadataPpdResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MetadataPpdResult");

  private static final org.apache.thrift.protocol.TField METADATA_FIELD_DESC = new org.apache.thrift.protocol.TField("metadata", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INCLUDE_BITSET_FIELD_DESC = new org.apache.thrift.protocol.TField("includeBitset", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MetadataPpdResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MetadataPpdResultTupleSchemeFactory());
  }

  private ByteBuffer metadata; // optional
  private ByteBuffer includeBitset; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    METADATA((short)1, "metadata"),
    INCLUDE_BITSET((short)2, "includeBitset");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // METADATA
          return METADATA;
        case 2: // INCLUDE_BITSET
          return INCLUDE_BITSET;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.METADATA,_Fields.INCLUDE_BITSET};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.METADATA, new org.apache.thrift.meta_data.FieldMetaData("metadata", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.INCLUDE_BITSET, new org.apache.thrift.meta_data.FieldMetaData("includeBitset", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MetadataPpdResult.class, metaDataMap);
  }

  public MetadataPpdResult() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MetadataPpdResult(MetadataPpdResult other) {
    if (other.isSetMetadata()) {
      this.metadata = org.apache.thrift.TBaseHelper.copyBinary(other.metadata);
    }
    if (other.isSetIncludeBitset()) {
      this.includeBitset = org.apache.thrift.TBaseHelper.copyBinary(other.includeBitset);
    }
  }

  public MetadataPpdResult deepCopy() {
    return new MetadataPpdResult(this);
  }

  @Override
  public void clear() {
    this.metadata = null;
    this.includeBitset = null;
  }

  public byte[] getMetadata() {
    setMetadata(org.apache.thrift.TBaseHelper.rightSize(metadata));
    return metadata == null ? null : metadata.array();
  }

  public ByteBuffer bufferForMetadata() {
    return org.apache.thrift.TBaseHelper.copyBinary(metadata);
  }

  public void setMetadata(byte[] metadata) {
    this.metadata = metadata == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(metadata, metadata.length));
  }

  public void setMetadata(ByteBuffer metadata) {
    this.metadata = org.apache.thrift.TBaseHelper.copyBinary(metadata);
  }

  public void unsetMetadata() {
    this.metadata = null;
  }

  /** Returns true if field metadata is set (has been assigned a value) and false otherwise */
  public boolean isSetMetadata() {
    return this.metadata != null;
  }

  public void setMetadataIsSet(boolean value) {
    if (!value) {
      this.metadata = null;
    }
  }

  public byte[] getIncludeBitset() {
    setIncludeBitset(org.apache.thrift.TBaseHelper.rightSize(includeBitset));
    return includeBitset == null ? null : includeBitset.array();
  }

  public ByteBuffer bufferForIncludeBitset() {
    return org.apache.thrift.TBaseHelper.copyBinary(includeBitset);
  }

  public void setIncludeBitset(byte[] includeBitset) {
    this.includeBitset = includeBitset == null ? (ByteBuffer)null : ByteBuffer.wrap(Arrays.copyOf(includeBitset, includeBitset.length));
  }

  public void setIncludeBitset(ByteBuffer includeBitset) {
    this.includeBitset = org.apache.thrift.TBaseHelper.copyBinary(includeBitset);
  }

  public void unsetIncludeBitset() {
    this.includeBitset = null;
  }

  /** Returns true if field includeBitset is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludeBitset() {
    return this.includeBitset != null;
  }

  public void setIncludeBitsetIsSet(boolean value) {
    if (!value) {
      this.includeBitset = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case METADATA:
      if (value == null) {
        unsetMetadata();
      } else {
        setMetadata((ByteBuffer)value);
      }
      break;

    case INCLUDE_BITSET:
      if (value == null) {
        unsetIncludeBitset();
      } else {
        setIncludeBitset((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case METADATA:
      return getMetadata();

    case INCLUDE_BITSET:
      return getIncludeBitset();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case METADATA:
      return isSetMetadata();
    case INCLUDE_BITSET:
      return isSetIncludeBitset();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MetadataPpdResult)
      return this.equals((MetadataPpdResult)that);
    return false;
  }

  public boolean equals(MetadataPpdResult that) {
    if (that == null)
      return false;

    boolean this_present_metadata = true && this.isSetMetadata();
    boolean that_present_metadata = true && that.isSetMetadata();
    if (this_present_metadata || that_present_metadata) {
      if (!(this_present_metadata && that_present_metadata))
        return false;
      if (!this.metadata.equals(that.metadata))
        return false;
    }

    boolean this_present_includeBitset = true && this.isSetIncludeBitset();
    boolean that_present_includeBitset = true && that.isSetIncludeBitset();
    if (this_present_includeBitset || that_present_includeBitset) {
      if (!(this_present_includeBitset && that_present_includeBitset))
        return false;
      if (!this.includeBitset.equals(that.includeBitset))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_metadata = true && (isSetMetadata());
    list.add(present_metadata);
    if (present_metadata)
      list.add(metadata);

    boolean present_includeBitset = true && (isSetIncludeBitset());
    list.add(present_includeBitset);
    if (present_includeBitset)
      list.add(includeBitset);

    return list.hashCode();
  }

  @Override
  public int compareTo(MetadataPpdResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetMetadata()).compareTo(other.isSetMetadata());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMetadata()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.metadata, other.metadata);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludeBitset()).compareTo(other.isSetIncludeBitset());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludeBitset()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includeBitset, other.includeBitset);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MetadataPpdResult(");
    boolean first = true;

    if (isSetMetadata()) {
      sb.append("metadata:");
      if (this.metadata == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.metadata, sb);
      }
      first = false;
    }
    if (isSetIncludeBitset()) {
      if (!first) sb.append(", ");
      sb.append("includeBitset:");
      if (this.includeBitset == null) {
        sb.append("null");
      } else {
        org.apache.thrift.TBaseHelper.toString(this.includeBitset, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MetadataPpdResultStandardSchemeFactory implements SchemeFactory {
    public MetadataPpdResultStandardScheme getScheme() {
      return new MetadataPpdResultStandardScheme();
    }
  }

  private static class MetadataPpdResultStandardScheme extends StandardScheme<MetadataPpdResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // METADATA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.metadata = iprot.readBinary();
              struct.setMetadataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INCLUDE_BITSET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.includeBitset = iprot.readBinary();
              struct.setIncludeBitsetIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.metadata != null) {
        if (struct.isSetMetadata()) {
          oprot.writeFieldBegin(METADATA_FIELD_DESC);
          oprot.writeBinary(struct.metadata);
          oprot.writeFieldEnd();
        }
      }
      if (struct.includeBitset != null) {
        if (struct.isSetIncludeBitset()) {
          oprot.writeFieldBegin(INCLUDE_BITSET_FIELD_DESC);
          oprot.writeBinary(struct.includeBitset);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MetadataPpdResultTupleSchemeFactory implements SchemeFactory {
    public MetadataPpdResultTupleScheme getScheme() {
      return new MetadataPpdResultTupleScheme();
    }
  }

  private static class MetadataPpdResultTupleScheme extends TupleScheme<MetadataPpdResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetMetadata()) {
        optionals.set(0);
      }
      if (struct.isSetIncludeBitset()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetMetadata()) {
        oprot.writeBinary(struct.metadata);
      }
      if (struct.isSetIncludeBitset()) {
        oprot.writeBinary(struct.includeBitset);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MetadataPpdResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.metadata = iprot.readBinary();
        struct.setMetadataIsSet(true);
      }
      if (incoming.get(1)) {
        struct.includeBitset = iprot.readBinary();
        struct.setIncludeBitsetIsSet(true);
      }
    }
  }

}
