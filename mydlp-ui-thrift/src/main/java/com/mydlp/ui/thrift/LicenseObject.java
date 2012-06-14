/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.mydlp.ui.thrift;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LicenseObject implements org.apache.thrift.TBase<LicenseObject, LicenseObject._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LicenseObject");

  private static final org.apache.thrift.protocol.TField LICENSE_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("license_type", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NUMBER_OF_USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("number_of_users", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField ADMINISTRATIVE_USERS_FIELD_DESC = new org.apache.thrift.protocol.TField("administrative_users", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField EXPIRATION_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("expiration_date", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField IS_TRIAL_FIELD_DESC = new org.apache.thrift.protocol.TField("is_trial", org.apache.thrift.protocol.TType.BOOL, (short)5);
  private static final org.apache.thrift.protocol.TField IS_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("is_valid", org.apache.thrift.protocol.TType.BOOL, (short)6);

  public String license_type; // required
  public long number_of_users; // required
  public long administrative_users; // required
  public long expiration_date; // required
  public boolean is_trial; // required
  public boolean is_valid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LICENSE_TYPE((short)1, "license_type"),
    NUMBER_OF_USERS((short)2, "number_of_users"),
    ADMINISTRATIVE_USERS((short)3, "administrative_users"),
    EXPIRATION_DATE((short)4, "expiration_date"),
    IS_TRIAL((short)5, "is_trial"),
    IS_VALID((short)6, "is_valid");

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
        case 1: // LICENSE_TYPE
          return LICENSE_TYPE;
        case 2: // NUMBER_OF_USERS
          return NUMBER_OF_USERS;
        case 3: // ADMINISTRATIVE_USERS
          return ADMINISTRATIVE_USERS;
        case 4: // EXPIRATION_DATE
          return EXPIRATION_DATE;
        case 5: // IS_TRIAL
          return IS_TRIAL;
        case 6: // IS_VALID
          return IS_VALID;
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
  private static final int __NUMBER_OF_USERS_ISSET_ID = 0;
  private static final int __ADMINISTRATIVE_USERS_ISSET_ID = 1;
  private static final int __EXPIRATION_DATE_ISSET_ID = 2;
  private static final int __IS_TRIAL_ISSET_ID = 3;
  private static final int __IS_VALID_ISSET_ID = 4;
  private BitSet __isset_bit_vector = new BitSet(5);

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LICENSE_TYPE, new org.apache.thrift.meta_data.FieldMetaData("license_type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NUMBER_OF_USERS, new org.apache.thrift.meta_data.FieldMetaData("number_of_users", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.ADMINISTRATIVE_USERS, new org.apache.thrift.meta_data.FieldMetaData("administrative_users", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EXPIRATION_DATE, new org.apache.thrift.meta_data.FieldMetaData("expiration_date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.IS_TRIAL, new org.apache.thrift.meta_data.FieldMetaData("is_trial", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_VALID, new org.apache.thrift.meta_data.FieldMetaData("is_valid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LicenseObject.class, metaDataMap);
  }

  public LicenseObject() {
  }

  public LicenseObject(
    String license_type,
    long number_of_users,
    long administrative_users,
    long expiration_date,
    boolean is_trial,
    boolean is_valid)
  {
    this();
    this.license_type = license_type;
    this.number_of_users = number_of_users;
    setNumber_of_usersIsSet(true);
    this.administrative_users = administrative_users;
    setAdministrative_usersIsSet(true);
    this.expiration_date = expiration_date;
    setExpiration_dateIsSet(true);
    this.is_trial = is_trial;
    setIs_trialIsSet(true);
    this.is_valid = is_valid;
    setIs_validIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LicenseObject(LicenseObject other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetLicense_type()) {
      this.license_type = other.license_type;
    }
    this.number_of_users = other.number_of_users;
    this.administrative_users = other.administrative_users;
    this.expiration_date = other.expiration_date;
    this.is_trial = other.is_trial;
    this.is_valid = other.is_valid;
  }

  public LicenseObject deepCopy() {
    return new LicenseObject(this);
  }

  @Override
  public void clear() {
    this.license_type = null;
    setNumber_of_usersIsSet(false);
    this.number_of_users = 0;
    setAdministrative_usersIsSet(false);
    this.administrative_users = 0;
    setExpiration_dateIsSet(false);
    this.expiration_date = 0;
    setIs_trialIsSet(false);
    this.is_trial = false;
    setIs_validIsSet(false);
    this.is_valid = false;
  }

  public String getLicense_type() {
    return this.license_type;
  }

  public LicenseObject setLicense_type(String license_type) {
    this.license_type = license_type;
    return this;
  }

  public void unsetLicense_type() {
    this.license_type = null;
  }

  /** Returns true if field license_type is set (has been assigned a value) and false otherwise */
  public boolean isSetLicense_type() {
    return this.license_type != null;
  }

  public void setLicense_typeIsSet(boolean value) {
    if (!value) {
      this.license_type = null;
    }
  }

  public long getNumber_of_users() {
    return this.number_of_users;
  }

  public LicenseObject setNumber_of_users(long number_of_users) {
    this.number_of_users = number_of_users;
    setNumber_of_usersIsSet(true);
    return this;
  }

  public void unsetNumber_of_users() {
    __isset_bit_vector.clear(__NUMBER_OF_USERS_ISSET_ID);
  }

  /** Returns true if field number_of_users is set (has been assigned a value) and false otherwise */
  public boolean isSetNumber_of_users() {
    return __isset_bit_vector.get(__NUMBER_OF_USERS_ISSET_ID);
  }

  public void setNumber_of_usersIsSet(boolean value) {
    __isset_bit_vector.set(__NUMBER_OF_USERS_ISSET_ID, value);
  }

  public long getAdministrative_users() {
    return this.administrative_users;
  }

  public LicenseObject setAdministrative_users(long administrative_users) {
    this.administrative_users = administrative_users;
    setAdministrative_usersIsSet(true);
    return this;
  }

  public void unsetAdministrative_users() {
    __isset_bit_vector.clear(__ADMINISTRATIVE_USERS_ISSET_ID);
  }

  /** Returns true if field administrative_users is set (has been assigned a value) and false otherwise */
  public boolean isSetAdministrative_users() {
    return __isset_bit_vector.get(__ADMINISTRATIVE_USERS_ISSET_ID);
  }

  public void setAdministrative_usersIsSet(boolean value) {
    __isset_bit_vector.set(__ADMINISTRATIVE_USERS_ISSET_ID, value);
  }

  public long getExpiration_date() {
    return this.expiration_date;
  }

  public LicenseObject setExpiration_date(long expiration_date) {
    this.expiration_date = expiration_date;
    setExpiration_dateIsSet(true);
    return this;
  }

  public void unsetExpiration_date() {
    __isset_bit_vector.clear(__EXPIRATION_DATE_ISSET_ID);
  }

  /** Returns true if field expiration_date is set (has been assigned a value) and false otherwise */
  public boolean isSetExpiration_date() {
    return __isset_bit_vector.get(__EXPIRATION_DATE_ISSET_ID);
  }

  public void setExpiration_dateIsSet(boolean value) {
    __isset_bit_vector.set(__EXPIRATION_DATE_ISSET_ID, value);
  }

  public boolean isIs_trial() {
    return this.is_trial;
  }

  public LicenseObject setIs_trial(boolean is_trial) {
    this.is_trial = is_trial;
    setIs_trialIsSet(true);
    return this;
  }

  public void unsetIs_trial() {
    __isset_bit_vector.clear(__IS_TRIAL_ISSET_ID);
  }

  /** Returns true if field is_trial is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_trial() {
    return __isset_bit_vector.get(__IS_TRIAL_ISSET_ID);
  }

  public void setIs_trialIsSet(boolean value) {
    __isset_bit_vector.set(__IS_TRIAL_ISSET_ID, value);
  }

  public boolean isIs_valid() {
    return this.is_valid;
  }

  public LicenseObject setIs_valid(boolean is_valid) {
    this.is_valid = is_valid;
    setIs_validIsSet(true);
    return this;
  }

  public void unsetIs_valid() {
    __isset_bit_vector.clear(__IS_VALID_ISSET_ID);
  }

  /** Returns true if field is_valid is set (has been assigned a value) and false otherwise */
  public boolean isSetIs_valid() {
    return __isset_bit_vector.get(__IS_VALID_ISSET_ID);
  }

  public void setIs_validIsSet(boolean value) {
    __isset_bit_vector.set(__IS_VALID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LICENSE_TYPE:
      if (value == null) {
        unsetLicense_type();
      } else {
        setLicense_type((String)value);
      }
      break;

    case NUMBER_OF_USERS:
      if (value == null) {
        unsetNumber_of_users();
      } else {
        setNumber_of_users((Long)value);
      }
      break;

    case ADMINISTRATIVE_USERS:
      if (value == null) {
        unsetAdministrative_users();
      } else {
        setAdministrative_users((Long)value);
      }
      break;

    case EXPIRATION_DATE:
      if (value == null) {
        unsetExpiration_date();
      } else {
        setExpiration_date((Long)value);
      }
      break;

    case IS_TRIAL:
      if (value == null) {
        unsetIs_trial();
      } else {
        setIs_trial((Boolean)value);
      }
      break;

    case IS_VALID:
      if (value == null) {
        unsetIs_valid();
      } else {
        setIs_valid((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LICENSE_TYPE:
      return getLicense_type();

    case NUMBER_OF_USERS:
      return Long.valueOf(getNumber_of_users());

    case ADMINISTRATIVE_USERS:
      return Long.valueOf(getAdministrative_users());

    case EXPIRATION_DATE:
      return Long.valueOf(getExpiration_date());

    case IS_TRIAL:
      return Boolean.valueOf(isIs_trial());

    case IS_VALID:
      return Boolean.valueOf(isIs_valid());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LICENSE_TYPE:
      return isSetLicense_type();
    case NUMBER_OF_USERS:
      return isSetNumber_of_users();
    case ADMINISTRATIVE_USERS:
      return isSetAdministrative_users();
    case EXPIRATION_DATE:
      return isSetExpiration_date();
    case IS_TRIAL:
      return isSetIs_trial();
    case IS_VALID:
      return isSetIs_valid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LicenseObject)
      return this.equals((LicenseObject)that);
    return false;
  }

  public boolean equals(LicenseObject that) {
    if (that == null)
      return false;

    boolean this_present_license_type = true && this.isSetLicense_type();
    boolean that_present_license_type = true && that.isSetLicense_type();
    if (this_present_license_type || that_present_license_type) {
      if (!(this_present_license_type && that_present_license_type))
        return false;
      if (!this.license_type.equals(that.license_type))
        return false;
    }

    boolean this_present_number_of_users = true;
    boolean that_present_number_of_users = true;
    if (this_present_number_of_users || that_present_number_of_users) {
      if (!(this_present_number_of_users && that_present_number_of_users))
        return false;
      if (this.number_of_users != that.number_of_users)
        return false;
    }

    boolean this_present_administrative_users = true;
    boolean that_present_administrative_users = true;
    if (this_present_administrative_users || that_present_administrative_users) {
      if (!(this_present_administrative_users && that_present_administrative_users))
        return false;
      if (this.administrative_users != that.administrative_users)
        return false;
    }

    boolean this_present_expiration_date = true;
    boolean that_present_expiration_date = true;
    if (this_present_expiration_date || that_present_expiration_date) {
      if (!(this_present_expiration_date && that_present_expiration_date))
        return false;
      if (this.expiration_date != that.expiration_date)
        return false;
    }

    boolean this_present_is_trial = true;
    boolean that_present_is_trial = true;
    if (this_present_is_trial || that_present_is_trial) {
      if (!(this_present_is_trial && that_present_is_trial))
        return false;
      if (this.is_trial != that.is_trial)
        return false;
    }

    boolean this_present_is_valid = true;
    boolean that_present_is_valid = true;
    if (this_present_is_valid || that_present_is_valid) {
      if (!(this_present_is_valid && that_present_is_valid))
        return false;
      if (this.is_valid != that.is_valid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(LicenseObject other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    LicenseObject typedOther = (LicenseObject)other;

    lastComparison = Boolean.valueOf(isSetLicense_type()).compareTo(typedOther.isSetLicense_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLicense_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.license_type, typedOther.license_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNumber_of_users()).compareTo(typedOther.isSetNumber_of_users());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumber_of_users()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.number_of_users, typedOther.number_of_users);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAdministrative_users()).compareTo(typedOther.isSetAdministrative_users());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdministrative_users()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.administrative_users, typedOther.administrative_users);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExpiration_date()).compareTo(typedOther.isSetExpiration_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpiration_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.expiration_date, typedOther.expiration_date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_trial()).compareTo(typedOther.isSetIs_trial());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_trial()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_trial, typedOther.is_trial);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIs_valid()).compareTo(typedOther.isSetIs_valid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIs_valid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.is_valid, typedOther.is_valid);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // LICENSE_TYPE
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.license_type = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // NUMBER_OF_USERS
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.number_of_users = iprot.readI64();
            setNumber_of_usersIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // ADMINISTRATIVE_USERS
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.administrative_users = iprot.readI64();
            setAdministrative_usersIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // EXPIRATION_DATE
          if (field.type == org.apache.thrift.protocol.TType.I64) {
            this.expiration_date = iprot.readI64();
            setExpiration_dateIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // IS_TRIAL
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.is_trial = iprot.readBool();
            setIs_trialIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 6: // IS_VALID
          if (field.type == org.apache.thrift.protocol.TType.BOOL) {
            this.is_valid = iprot.readBool();
            setIs_validIsSet(true);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.license_type != null) {
      oprot.writeFieldBegin(LICENSE_TYPE_FIELD_DESC);
      oprot.writeString(this.license_type);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(NUMBER_OF_USERS_FIELD_DESC);
    oprot.writeI64(this.number_of_users);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(ADMINISTRATIVE_USERS_FIELD_DESC);
    oprot.writeI64(this.administrative_users);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(EXPIRATION_DATE_FIELD_DESC);
    oprot.writeI64(this.expiration_date);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IS_TRIAL_FIELD_DESC);
    oprot.writeBool(this.is_trial);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(IS_VALID_FIELD_DESC);
    oprot.writeBool(this.is_valid);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LicenseObject(");
    boolean first = true;

    sb.append("license_type:");
    if (this.license_type == null) {
      sb.append("null");
    } else {
      sb.append(this.license_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("number_of_users:");
    sb.append(this.number_of_users);
    first = false;
    if (!first) sb.append(", ");
    sb.append("administrative_users:");
    sb.append(this.administrative_users);
    first = false;
    if (!first) sb.append(", ");
    sb.append("expiration_date:");
    sb.append(this.expiration_date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_trial:");
    sb.append(this.is_trial);
    first = false;
    if (!first) sb.append(", ");
    sb.append("is_valid:");
    sb.append(this.is_valid);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
