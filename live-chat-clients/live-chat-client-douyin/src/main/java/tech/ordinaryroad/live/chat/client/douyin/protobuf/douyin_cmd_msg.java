/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin_cmd_msg.proto

package tech.ordinaryroad.live.chat.client.douyin.protobuf;

import tech.ordinaryroad.live.chat.client.douyin.constant.DouyinCmdEnum;
import tech.ordinaryroad.live.chat.client.douyin.msg.base.IDouyinCmdMsg;

/**
 * Protobuf type {@code tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg}
 */
public final class douyin_cmd_msg extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)
    douyin_cmd_msgOrBuilder, IDouyinCmdMsg {

  @Override
  public String getCmd() {
    return getMethod();
  }

  @Override
  public void setCmd(String cmd) {
    // ignore
    // method_ = cmd;
  }

  @Override
  public DouyinCmdEnum getCmdEnum() {
    return DouyinCmdEnum.getByName(getMethod());
  }

private static final long serialVersionUID = 0L;
  // Use douyin_cmd_msg.newBuilder() to construct.
  private douyin_cmd_msg(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private douyin_cmd_msg() {
    method_ = "";
    payload_ = com.google.protobuf.ByteString.EMPTY;
    wrdsSubKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new douyin_cmd_msg();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return tech.ordinaryroad.live.chat.client.douyin.protobuf.Douyin_cmd_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_cmd_msg_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.ordinaryroad.live.chat.client.douyin.protobuf.Douyin_cmd_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_cmd_msg_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object method_ = "";
  /**
   * <code>string method = 1;</code>
   * @return The method.
   */
  @java.lang.Override
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   * <code>string method = 1;</code>
   * @return The bytes for method.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      method_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes payload = 2;</code>
   * @return The payload.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPayload() {
    return payload_;
  }

  public static final int MSG_ID_FIELD_NUMBER = 3;
  private long msgId_ = 0L;
  /**
   * <code>int64 msg_id = 3;</code>
   * @return The msgId.
   */
  @java.lang.Override
  public long getMsgId() {
    return msgId_;
  }

  public static final int MSG_TYPE_FIELD_NUMBER = 4;
  private int msgType_ = 0;
  /**
   * <code>int32 msg_type = 4;</code>
   * @return The msgType.
   */
  @java.lang.Override
  public int getMsgType() {
    return msgType_;
  }

  public static final int OFFSET_FIELD_NUMBER = 5;
  private long offset_ = 0L;
  /**
   * <code>int64 offset = 5;</code>
   * @return The offset.
   */
  @java.lang.Override
  public long getOffset() {
    return offset_;
  }

  public static final int NEED_WRDS_STORE_FIELD_NUMBER = 6;
  private boolean needWrdsStore_ = false;
  /**
   * <code>bool need_wrds_store = 6;</code>
   * @return The needWrdsStore.
   */
  @java.lang.Override
  public boolean getNeedWrdsStore() {
    return needWrdsStore_;
  }

  public static final int WRDS_VERSION_FIELD_NUMBER = 7;
  private long wrdsVersion_ = 0L;
  /**
   * <code>int64 wrds_version = 7;</code>
   * @return The wrdsVersion.
   */
  @java.lang.Override
  public long getWrdsVersion() {
    return wrdsVersion_;
  }

  public static final int WRDS_SUB_KEY_FIELD_NUMBER = 8;
  @SuppressWarnings("serial")
  private volatile java.lang.Object wrdsSubKey_ = "";
  /**
   * <code>string wrds_sub_key = 8;</code>
   * @return The wrdsSubKey.
   */
  @java.lang.Override
  public java.lang.String getWrdsSubKey() {
    java.lang.Object ref = wrdsSubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      wrdsSubKey_ = s;
      return s;
    }
  }
  /**
   * <code>string wrds_sub_key = 8;</code>
   * @return The bytes for wrdsSubKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getWrdsSubKeyBytes() {
    java.lang.Object ref = wrdsSubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      wrdsSubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, method_);
    }
    if (!payload_.isEmpty()) {
      output.writeBytes(2, payload_);
    }
    if (msgId_ != 0L) {
      output.writeInt64(3, msgId_);
    }
    if (msgType_ != 0) {
      output.writeInt32(4, msgType_);
    }
    if (offset_ != 0L) {
      output.writeInt64(5, offset_);
    }
    if (needWrdsStore_ != false) {
      output.writeBool(6, needWrdsStore_);
    }
    if (wrdsVersion_ != 0L) {
      output.writeInt64(7, wrdsVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(wrdsSubKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, wrdsSubKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, method_);
    }
    if (!payload_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, payload_);
    }
    if (msgId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, msgId_);
    }
    if (msgType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, msgType_);
    }
    if (offset_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, offset_);
    }
    if (needWrdsStore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, needWrdsStore_);
    }
    if (wrdsVersion_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, wrdsVersion_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(wrdsSubKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, wrdsSubKey_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)) {
      return super.equals(obj);
    }
    tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg other = (tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg) obj;

    if (!getMethod()
        .equals(other.getMethod())) return false;
    if (!getPayload()
        .equals(other.getPayload())) return false;
    if (getMsgId()
        != other.getMsgId()) return false;
    if (getMsgType()
        != other.getMsgType()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (getNeedWrdsStore()
        != other.getNeedWrdsStore()) return false;
    if (getWrdsVersion()
        != other.getWrdsVersion()) return false;
    if (!getWrdsSubKey()
        .equals(other.getWrdsSubKey())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
    hash = (53 * hash) + getPayload().hashCode();
    hash = (37 * hash) + MSG_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMsgId());
    hash = (37 * hash) + MSG_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMsgType();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOffset());
    hash = (37 * hash) + NEED_WRDS_STORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNeedWrdsStore());
    hash = (37 * hash) + WRDS_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWrdsVersion());
    hash = (37 * hash) + WRDS_SUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getWrdsSubKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msgOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.Douyin_cmd_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_cmd_msg_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.Douyin_cmd_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_cmd_msg_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.class, tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.Builder.class);
    }

    // Construct using tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      method_ = "";
      payload_ = com.google.protobuf.ByteString.EMPTY;
      msgId_ = 0L;
      msgType_ = 0;
      offset_ = 0L;
      needWrdsStore_ = false;
      wrdsVersion_ = 0L;
      wrdsSubKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.Douyin_cmd_msgProto.internal_static_tech_ordinaryroad_live_chat_client_douyin_protobuf_douyin_cmd_msg_descriptor;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg getDefaultInstanceForType() {
      return tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.getDefaultInstance();
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg build() {
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg buildPartial() {
      tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg result = new tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.method_ = method_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.payload_ = payload_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.msgId_ = msgId_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.msgType_ = msgType_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.offset_ = offset_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.needWrdsStore_ = needWrdsStore_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.wrdsVersion_ = wrdsVersion_;
      }
      if (((from_bitField0_ & 0x00000080) != 0)) {
        result.wrdsSubKey_ = wrdsSubKey_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg) {
        return mergeFrom((tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg other) {
      if (other == tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg.getDefaultInstance()) return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
        setPayload(other.getPayload());
      }
      if (other.getMsgId() != 0L) {
        setMsgId(other.getMsgId());
      }
      if (other.getMsgType() != 0) {
        setMsgType(other.getMsgType());
      }
      if (other.getOffset() != 0L) {
        setOffset(other.getOffset());
      }
      if (other.getNeedWrdsStore() != false) {
        setNeedWrdsStore(other.getNeedWrdsStore());
      }
      if (other.getWrdsVersion() != 0L) {
        setWrdsVersion(other.getWrdsVersion());
      }
      if (!other.getWrdsSubKey().isEmpty()) {
        wrdsSubKey_ = other.wrdsSubKey_;
        bitField0_ |= 0x00000080;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              method_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              payload_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              msgId_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              msgType_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              offset_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 48: {
              needWrdsStore_ = input.readBool();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
            case 56: {
              wrdsVersion_ = input.readInt64();
              bitField0_ |= 0x00000040;
              break;
            } // case 56
            case 66: {
              wrdsSubKey_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000080;
              break;
            } // case 66
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object method_ = "";
    /**
     * <code>string method = 1;</code>
     * @return The method.
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string method = 1;</code>
     * @return The bytes for method.
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string method = 1;</code>
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      method_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string method = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      method_ = getDefaultInstance().getMethod();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string method = 1;</code>
     * @param value The bytes for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      method_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes payload = 2;</code>
     * @return The payload.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPayload() {
      return payload_;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @param value The payload to set.
     * @return This builder for chaining.
     */
    public Builder setPayload(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      payload_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes payload = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayload() {
      bitField0_ = (bitField0_ & ~0x00000002);
      payload_ = getDefaultInstance().getPayload();
      onChanged();
      return this;
    }

    private long msgId_ ;
    /**
     * <code>int64 msg_id = 3;</code>
     * @return The msgId.
     */
    @java.lang.Override
    public long getMsgId() {
      return msgId_;
    }
    /**
     * <code>int64 msg_id = 3;</code>
     * @param value The msgId to set.
     * @return This builder for chaining.
     */
    public Builder setMsgId(long value) {

      msgId_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 msg_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      msgId_ = 0L;
      onChanged();
      return this;
    }

    private int msgType_ ;
    /**
     * <code>int32 msg_type = 4;</code>
     * @return The msgType.
     */
    @java.lang.Override
    public int getMsgType() {
      return msgType_;
    }
    /**
     * <code>int32 msg_type = 4;</code>
     * @param value The msgType to set.
     * @return This builder for chaining.
     */
    public Builder setMsgType(int value) {

      msgType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 msg_type = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsgType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      msgType_ = 0;
      onChanged();
      return this;
    }

    private long offset_ ;
    /**
     * <code>int64 offset = 5;</code>
     * @return The offset.
     */
    @java.lang.Override
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>int64 offset = 5;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(long value) {

      offset_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>int64 offset = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000010);
      offset_ = 0L;
      onChanged();
      return this;
    }

    private boolean needWrdsStore_ ;
    /**
     * <code>bool need_wrds_store = 6;</code>
     * @return The needWrdsStore.
     */
    @java.lang.Override
    public boolean getNeedWrdsStore() {
      return needWrdsStore_;
    }
    /**
     * <code>bool need_wrds_store = 6;</code>
     * @param value The needWrdsStore to set.
     * @return This builder for chaining.
     */
    public Builder setNeedWrdsStore(boolean value) {

      needWrdsStore_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>bool need_wrds_store = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearNeedWrdsStore() {
      bitField0_ = (bitField0_ & ~0x00000020);
      needWrdsStore_ = false;
      onChanged();
      return this;
    }

    private long wrdsVersion_ ;
    /**
     * <code>int64 wrds_version = 7;</code>
     * @return The wrdsVersion.
     */
    @java.lang.Override
    public long getWrdsVersion() {
      return wrdsVersion_;
    }
    /**
     * <code>int64 wrds_version = 7;</code>
     * @param value The wrdsVersion to set.
     * @return This builder for chaining.
     */
    public Builder setWrdsVersion(long value) {

      wrdsVersion_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <code>int64 wrds_version = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearWrdsVersion() {
      bitField0_ = (bitField0_ & ~0x00000040);
      wrdsVersion_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object wrdsSubKey_ = "";
    /**
     * <code>string wrds_sub_key = 8;</code>
     * @return The wrdsSubKey.
     */
    public java.lang.String getWrdsSubKey() {
      java.lang.Object ref = wrdsSubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        wrdsSubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wrds_sub_key = 8;</code>
     * @return The bytes for wrdsSubKey.
     */
    public com.google.protobuf.ByteString
        getWrdsSubKeyBytes() {
      java.lang.Object ref = wrdsSubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        wrdsSubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wrds_sub_key = 8;</code>
     * @param value The wrdsSubKey to set.
     * @return This builder for chaining.
     */
    public Builder setWrdsSubKey(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      wrdsSubKey_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    /**
     * <code>string wrds_sub_key = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearWrdsSubKey() {
      wrdsSubKey_ = getDefaultInstance().getWrdsSubKey();
      bitField0_ = (bitField0_ & ~0x00000080);
      onChanged();
      return this;
    }
    /**
     * <code>string wrds_sub_key = 8;</code>
     * @param value The bytes for wrdsSubKey to set.
     * @return This builder for chaining.
     */
    public Builder setWrdsSubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      wrdsSubKey_ = value;
      bitField0_ |= 0x00000080;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)
  }

  // @@protoc_insertion_point(class_scope:tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg)
  private static final tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg();
  }

  public static tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<douyin_cmd_msg>
      PARSER = new com.google.protobuf.AbstractParser<douyin_cmd_msg>() {
    @java.lang.Override
    public douyin_cmd_msg parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<douyin_cmd_msg> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<douyin_cmd_msg> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.ordinaryroad.live.chat.client.douyin.protobuf.douyin_cmd_msg getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

