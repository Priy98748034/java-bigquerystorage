/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1beta2/storage.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.storage.v1beta2;

/**
 *
 *
 * <pre>
 * Request message for `FlushRows`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.FlushRowsRequest}
 */
public final class FlushRowsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1beta2.FlushRowsRequest)
    FlushRowsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FlushRowsRequest.newBuilder() to construct.
  private FlushRowsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FlushRowsRequest() {
    writeStream_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FlushRowsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_FlushRowsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_FlushRowsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.class,
            com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.Builder.class);
  }

  private int bitField0_;
  public static final int WRITE_STREAM_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object writeStream_ = "";
  /**
   *
   *
   * <pre>
   * Required. The stream that is the target of the flush operation.
   * </pre>
   *
   * <code>
   * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The writeStream.
   */
  @java.lang.Override
  public java.lang.String getWriteStream() {
    java.lang.Object ref = writeStream_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      writeStream_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The stream that is the target of the flush operation.
   * </pre>
   *
   * <code>
   * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for writeStream.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWriteStreamBytes() {
    java.lang.Object ref = writeStream_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      writeStream_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value offset_;
  /**
   *
   *
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   *
   * @return Whether the offset field is set.
   */
  @java.lang.Override
  public boolean hasOffset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   *
   * @return The offset.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getOffset() {
    return offset_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : offset_;
  }
  /**
   *
   *
   * <pre>
   * Ending offset of the flush operation. Rows before this offset(including
   * this offset) will be flushed.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value offset = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getOffsetOrBuilder() {
    return offset_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : offset_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(writeStream_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, writeStream_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOffset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(writeStream_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, writeStream_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getOffset());
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
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest other =
        (com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest) obj;

    if (!getWriteStream().equals(other.getWriteStream())) return false;
    if (hasOffset() != other.hasOffset()) return false;
    if (hasOffset()) {
      if (!getOffset().equals(other.getOffset())) return false;
    }
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
    hash = (37 * hash) + WRITE_STREAM_FIELD_NUMBER;
    hash = (53 * hash) + getWriteStream().hashCode();
    if (hasOffset()) {
      hash = (37 * hash) + OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + getOffset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for `FlushRows`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.FlushRowsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1beta2.FlushRowsRequest)
      com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_FlushRowsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_FlushRowsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.class,
              com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOffsetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      writeStream_ = "";
      offset_ = null;
      if (offsetBuilder_ != null) {
        offsetBuilder_.dispose();
        offsetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_FlushRowsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest build() {
      com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest buildPartial() {
      com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest result =
          new com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.writeStream_ = writeStream_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offsetBuilder_ == null ? offset_ : offsetBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest other) {
      if (other == com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest.getDefaultInstance())
        return this;
      if (!other.getWriteStream().isEmpty()) {
        writeStream_ = other.writeStream_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOffset()) {
        mergeOffset(other.getOffset());
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
            case 10:
              {
                writeStream_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getOffsetFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private java.lang.Object writeStream_ = "";
    /**
     *
     *
     * <pre>
     * Required. The stream that is the target of the flush operation.
     * </pre>
     *
     * <code>
     * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The writeStream.
     */
    public java.lang.String getWriteStream() {
      java.lang.Object ref = writeStream_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        writeStream_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The stream that is the target of the flush operation.
     * </pre>
     *
     * <code>
     * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for writeStream.
     */
    public com.google.protobuf.ByteString getWriteStreamBytes() {
      java.lang.Object ref = writeStream_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        writeStream_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The stream that is the target of the flush operation.
     * </pre>
     *
     * <code>
     * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The writeStream to set.
     * @return This builder for chaining.
     */
    public Builder setWriteStream(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      writeStream_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The stream that is the target of the flush operation.
     * </pre>
     *
     * <code>
     * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWriteStream() {
      writeStream_ = getDefaultInstance().getWriteStream();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The stream that is the target of the flush operation.
     * </pre>
     *
     * <code>
     * string write_stream = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for writeStream to set.
     * @return This builder for chaining.
     */
    public Builder setWriteStreamBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      writeStream_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Int64Value offset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value,
            com.google.protobuf.Int64Value.Builder,
            com.google.protobuf.Int64ValueOrBuilder>
        offsetBuilder_;
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     *
     * @return Whether the offset field is set.
     */
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     *
     * @return The offset.
     */
    public com.google.protobuf.Int64Value getOffset() {
      if (offsetBuilder_ == null) {
        return offset_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : offset_;
      } else {
        return offsetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public Builder setOffset(com.google.protobuf.Int64Value value) {
      if (offsetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        offset_ = value;
      } else {
        offsetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public Builder setOffset(com.google.protobuf.Int64Value.Builder builderForValue) {
      if (offsetBuilder_ == null) {
        offset_ = builderForValue.build();
      } else {
        offsetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public Builder mergeOffset(com.google.protobuf.Int64Value value) {
      if (offsetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && offset_ != null
            && offset_ != com.google.protobuf.Int64Value.getDefaultInstance()) {
          getOffsetBuilder().mergeFrom(value);
        } else {
          offset_ = value;
        }
      } else {
        offsetBuilder_.mergeFrom(value);
      }
      if (offset_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = null;
      if (offsetBuilder_ != null) {
        offsetBuilder_.dispose();
        offsetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getOffsetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOffsetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getOffsetOrBuilder() {
      if (offsetBuilder_ != null) {
        return offsetBuilder_.getMessageOrBuilder();
      } else {
        return offset_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : offset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Ending offset of the flush operation. Rows before this offset(including
     * this offset) will be flushed.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value offset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value,
            com.google.protobuf.Int64Value.Builder,
            com.google.protobuf.Int64ValueOrBuilder>
        getOffsetFieldBuilder() {
      if (offsetBuilder_ == null) {
        offsetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Int64Value,
                com.google.protobuf.Int64Value.Builder,
                com.google.protobuf.Int64ValueOrBuilder>(
                getOffset(), getParentForChildren(), isClean());
        offset_ = null;
      }
      return offsetBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1beta2.FlushRowsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.FlushRowsRequest)
  private static final com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest();
  }

  public static com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlushRowsRequest> PARSER =
      new com.google.protobuf.AbstractParser<FlushRowsRequest>() {
        @java.lang.Override
        public FlushRowsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlushRowsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlushRowsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.FlushRowsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
