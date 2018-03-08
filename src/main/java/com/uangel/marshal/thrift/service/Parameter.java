/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.uangel.marshal.thrift.service;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-03-08")
public class Parameter implements org.apache.thrift.TBase<Parameter, Parameter._Fields>, java.io.Serializable, Cloneable, Comparable<Parameter> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Parameter");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField IMAGE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("imageName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField IMAGE_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("imageMap", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ParameterStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ParameterTupleSchemeFactory();

  public int id; // required
  public java.lang.String imageName; // required
  public java.nio.ByteBuffer imageMap; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    IMAGE_NAME((short)2, "imageName"),
    IMAGE_MAP((short)3, "imageMap");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // IMAGE_NAME
          return IMAGE_NAME;
        case 3: // IMAGE_MAP
          return IMAGE_MAP;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.IMAGE_NAME, new org.apache.thrift.meta_data.FieldMetaData("imageName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IMAGE_MAP, new org.apache.thrift.meta_data.FieldMetaData("imageMap", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Parameter.class, metaDataMap);
  }

  public Parameter() {
  }

  public Parameter(
    int id,
    java.lang.String imageName,
    java.nio.ByteBuffer imageMap)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.imageName = imageName;
    this.imageMap = org.apache.thrift.TBaseHelper.copyBinary(imageMap);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Parameter(Parameter other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetImageName()) {
      this.imageName = other.imageName;
    }
    if (other.isSetImageMap()) {
      this.imageMap = org.apache.thrift.TBaseHelper.copyBinary(other.imageMap);
    }
  }

  public Parameter deepCopy() {
    return new Parameter(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.imageName = null;
    this.imageMap = null;
  }

  public int getId() {
    return this.id;
  }

  public Parameter setId(int id) {
    this.id = id;
    setIdIsSet(true);
    return this;
  }

  public void unsetId() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  public java.lang.String getImageName() {
    return this.imageName;
  }

  public Parameter setImageName(java.lang.String imageName) {
    this.imageName = imageName;
    return this;
  }

  public void unsetImageName() {
    this.imageName = null;
  }

  /** Returns true if field imageName is set (has been assigned a value) and false otherwise */
  public boolean isSetImageName() {
    return this.imageName != null;
  }

  public void setImageNameIsSet(boolean value) {
    if (!value) {
      this.imageName = null;
    }
  }

  public byte[] getImageMap() {
    setImageMap(org.apache.thrift.TBaseHelper.rightSize(imageMap));
    return imageMap == null ? null : imageMap.array();
  }

  public java.nio.ByteBuffer bufferForImageMap() {
    return org.apache.thrift.TBaseHelper.copyBinary(imageMap);
  }

  public Parameter setImageMap(byte[] imageMap) {
    this.imageMap = imageMap == null ? (java.nio.ByteBuffer)null : java.nio.ByteBuffer.wrap(imageMap.clone());
    return this;
  }

  public Parameter setImageMap(java.nio.ByteBuffer imageMap) {
    this.imageMap = org.apache.thrift.TBaseHelper.copyBinary(imageMap);
    return this;
  }

  public void unsetImageMap() {
    this.imageMap = null;
  }

  /** Returns true if field imageMap is set (has been assigned a value) and false otherwise */
  public boolean isSetImageMap() {
    return this.imageMap != null;
  }

  public void setImageMapIsSet(boolean value) {
    if (!value) {
      this.imageMap = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.Integer)value);
      }
      break;

    case IMAGE_NAME:
      if (value == null) {
        unsetImageName();
      } else {
        setImageName((java.lang.String)value);
      }
      break;

    case IMAGE_MAP:
      if (value == null) {
        unsetImageMap();
      } else {
        if (value instanceof byte[]) {
          setImageMap((byte[])value);
        } else {
          setImageMap((java.nio.ByteBuffer)value);
        }
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case IMAGE_NAME:
      return getImageName();

    case IMAGE_MAP:
      return getImageMap();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case IMAGE_NAME:
      return isSetImageName();
    case IMAGE_MAP:
      return isSetImageMap();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Parameter)
      return this.equals((Parameter)that);
    return false;
  }

  public boolean equals(Parameter that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_imageName = true && this.isSetImageName();
    boolean that_present_imageName = true && that.isSetImageName();
    if (this_present_imageName || that_present_imageName) {
      if (!(this_present_imageName && that_present_imageName))
        return false;
      if (!this.imageName.equals(that.imageName))
        return false;
    }

    boolean this_present_imageMap = true && this.isSetImageMap();
    boolean that_present_imageMap = true && that.isSetImageMap();
    if (this_present_imageMap || that_present_imageMap) {
      if (!(this_present_imageMap && that_present_imageMap))
        return false;
      if (!this.imageMap.equals(that.imageMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + id;

    hashCode = hashCode * 8191 + ((isSetImageName()) ? 131071 : 524287);
    if (isSetImageName())
      hashCode = hashCode * 8191 + imageName.hashCode();

    hashCode = hashCode * 8191 + ((isSetImageMap()) ? 131071 : 524287);
    if (isSetImageMap())
      hashCode = hashCode * 8191 + imageMap.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Parameter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetImageName()).compareTo(other.isSetImageName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImageName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imageName, other.imageName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetImageMap()).compareTo(other.isSetImageMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetImageMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.imageMap, other.imageMap);
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
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (!first) sb.append(", ");
    sb.append("imageName:");
    if (this.imageName == null) {
      sb.append("null");
    } else {
      sb.append(this.imageName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("imageMap:");
    if (this.imageMap == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.imageMap, sb);
    }
    first = false;
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ParameterStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ParameterStandardScheme getScheme() {
      return new ParameterStandardScheme();
    }
  }

  private static class ParameterStandardScheme extends org.apache.thrift.scheme.StandardScheme<Parameter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Parameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IMAGE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imageName = iprot.readString();
              struct.setImageNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IMAGE_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.imageMap = iprot.readBinary();
              struct.setImageMapIsSet(true);
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

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Parameter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.imageName != null) {
        oprot.writeFieldBegin(IMAGE_NAME_FIELD_DESC);
        oprot.writeString(struct.imageName);
        oprot.writeFieldEnd();
      }
      if (struct.imageMap != null) {
        oprot.writeFieldBegin(IMAGE_MAP_FIELD_DESC);
        oprot.writeBinary(struct.imageMap);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ParameterTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ParameterTupleScheme getScheme() {
      return new ParameterTupleScheme();
    }
  }

  private static class ParameterTupleScheme extends org.apache.thrift.scheme.TupleScheme<Parameter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Parameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetImageName()) {
        optionals.set(1);
      }
      if (struct.isSetImageMap()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetId()) {
        oprot.writeI32(struct.id);
      }
      if (struct.isSetImageName()) {
        oprot.writeString(struct.imageName);
      }
      if (struct.isSetImageMap()) {
        oprot.writeBinary(struct.imageMap);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Parameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.id = iprot.readI32();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.imageName = iprot.readString();
        struct.setImageNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.imageMap = iprot.readBinary();
        struct.setImageMapIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

