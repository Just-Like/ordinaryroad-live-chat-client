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
// source: TextPieceHeart.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto;

public final class TextPieceHeartOuterClass {
  private TextPieceHeartOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TextPieceHeartOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TextPieceHeart)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string color = 1;</code>
     * @return The color.
     */
    java.lang.String getColor();
    /**
     * <code>string color = 1;</code>
     * @return The bytes for color.
     */
    com.google.protobuf.ByteString
        getColorBytes();
  }
  /**
   * Protobuf type {@code TextPieceHeart}
   */
  public static final class TextPieceHeart extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TextPieceHeart)
      TextPieceHeartOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TextPieceHeart.newBuilder() to construct.
    private TextPieceHeart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TextPieceHeart() {
      color_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TextPieceHeart();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.internal_static_TextPieceHeart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.internal_static_TextPieceHeart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.Builder.class);
    }

    public static final int COLOR_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object color_ = "";
    /**
     * <code>string color = 1;</code>
     * @return The color.
     */
    @java.lang.Override
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      }
    }
    /**
     * <code>string color = 1;</code>
     * @return The bytes for color.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, color_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, color_);
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
      if (!(obj instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart)) {
        return super.equals(obj);
      }
      tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart other = (tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart) obj;

      if (!getColor()
          .equals(other.getColor())) return false;
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
      hash = (37 * hash) + COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getColor().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart parseFrom(
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
    public static Builder newBuilder(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart prototype) {
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
     * Protobuf type {@code TextPieceHeart}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TextPieceHeart)
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeartOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.internal_static_TextPieceHeart_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.internal_static_TextPieceHeart_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.class, tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.newBuilder()
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
        color_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.internal_static_TextPieceHeart_descriptor;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart getDefaultInstanceForType() {
        return tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.getDefaultInstance();
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart build() {
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart buildPartial() {
        tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart result = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.color_ = color_;
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
        if (other instanceof tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart) {
          return mergeFrom((tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart other) {
        if (other == tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart.getDefaultInstance()) return this;
        if (!other.getColor().isEmpty()) {
          color_ = other.color_;
          bitField0_ |= 0x00000001;
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
                color_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

      private java.lang.Object color_ = "";
      /**
       * <code>string color = 1;</code>
       * @return The color.
       */
      public java.lang.String getColor() {
        java.lang.Object ref = color_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          color_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string color = 1;</code>
       * @return The bytes for color.
       */
      public com.google.protobuf.ByteString
          getColorBytes() {
        java.lang.Object ref = color_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          color_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string color = 1;</code>
       * @param value The color to set.
       * @return This builder for chaining.
       */
      public Builder setColor(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        color_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string color = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearColor() {
        color_ = getDefaultInstance().getColor();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string color = 1;</code>
       * @param value The bytes for color to set.
       * @return This builder for chaining.
       */
      public Builder setColorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        color_ = value;
        bitField0_ |= 0x00000001;
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


      // @@protoc_insertion_point(builder_scope:TextPieceHeart)
    }

    // @@protoc_insertion_point(class_scope:TextPieceHeart)
    private static final tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart();
    }

    public static tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TextPieceHeart>
        PARSER = new com.google.protobuf.AbstractParser<TextPieceHeart>() {
      @java.lang.Override
      public TextPieceHeart parsePartialFrom(
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

    public static com.google.protobuf.Parser<TextPieceHeart> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TextPieceHeart> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.TextPieceHeartOuterClass.TextPieceHeart getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TextPieceHeart_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TextPieceHeart_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TextPieceHeart.proto\"\037\n\016TextPieceHeart" +
      "\022\r\n\005color\030\001 \001(\tB>\n<tech.ordinaryroad.liv" +
      "e.chat.client.codec.douyin.protobuf.dtob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TextPieceHeart_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TextPieceHeart_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TextPieceHeart_descriptor,
        new java.lang.String[] { "Color", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
