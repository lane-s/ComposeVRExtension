// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_builders_test.proto

package protobuf_unittest;

/**
 * Protobuf type {@code protobuf_unittest.Wheel}
 */
public  final class Wheel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protobuf_unittest.Wheel)
    WheelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Wheel.newBuilder() to construct.
  private Wheel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Wheel() {
    radius_ = 0;
    width_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Wheel(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            radius_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            width_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf_unittest.Wheel.class, protobuf_unittest.Wheel.Builder.class);
  }

  private int bitField0_;
  public static final int RADIUS_FIELD_NUMBER = 1;
  private int radius_;
  /**
   * <code>optional int32 radius = 1;</code>
   */
  public boolean hasRadius() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 radius = 1;</code>
   */
  public int getRadius() {
    return radius_;
  }

  public static final int WIDTH_FIELD_NUMBER = 2;
  private int width_;
  /**
   * <code>optional int32 width = 2;</code>
   */
  public boolean hasWidth() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 width = 2;</code>
   */
  public int getWidth() {
    return width_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, radius_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, width_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, radius_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, width_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof protobuf_unittest.Wheel)) {
      return super.equals(obj);
    }
    protobuf_unittest.Wheel other = (protobuf_unittest.Wheel) obj;

    boolean result = true;
    result = result && (hasRadius() == other.hasRadius());
    if (hasRadius()) {
      result = result && (getRadius()
          == other.getRadius());
    }
    result = result && (hasWidth() == other.hasWidth());
    if (hasWidth()) {
      result = result && (getWidth()
          == other.getWidth());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRadius()) {
      hash = (37 * hash) + RADIUS_FIELD_NUMBER;
      hash = (53 * hash) + getRadius();
    }
    if (hasWidth()) {
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + getWidth();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf_unittest.Wheel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Wheel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Wheel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Wheel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Wheel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Wheel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Wheel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Wheel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Wheel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(protobuf_unittest.Wheel prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code protobuf_unittest.Wheel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protobuf_unittest.Wheel)
      protobuf_unittest.WheelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.Wheel.class, protobuf_unittest.Wheel.Builder.class);
    }

    // Construct using protobuf_unittest.Wheel.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      radius_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      width_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Wheel_descriptor;
    }

    public protobuf_unittest.Wheel getDefaultInstanceForType() {
      return protobuf_unittest.Wheel.getDefaultInstance();
    }

    public protobuf_unittest.Wheel build() {
      protobuf_unittest.Wheel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protobuf_unittest.Wheel buildPartial() {
      protobuf_unittest.Wheel result = new protobuf_unittest.Wheel(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.radius_ = radius_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.width_ = width_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf_unittest.Wheel) {
        return mergeFrom((protobuf_unittest.Wheel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf_unittest.Wheel other) {
      if (other == protobuf_unittest.Wheel.getDefaultInstance()) return this;
      if (other.hasRadius()) {
        setRadius(other.getRadius());
      }
      if (other.hasWidth()) {
        setWidth(other.getWidth());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      protobuf_unittest.Wheel parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protobuf_unittest.Wheel) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int radius_ ;
    /**
     * <code>optional int32 radius = 1;</code>
     */
    public boolean hasRadius() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 radius = 1;</code>
     */
    public int getRadius() {
      return radius_;
    }
    /**
     * <code>optional int32 radius = 1;</code>
     */
    public Builder setRadius(int value) {
      bitField0_ |= 0x00000001;
      radius_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 radius = 1;</code>
     */
    public Builder clearRadius() {
      bitField0_ = (bitField0_ & ~0x00000001);
      radius_ = 0;
      onChanged();
      return this;
    }

    private int width_ ;
    /**
     * <code>optional int32 width = 2;</code>
     */
    public boolean hasWidth() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 width = 2;</code>
     */
    public int getWidth() {
      return width_;
    }
    /**
     * <code>optional int32 width = 2;</code>
     */
    public Builder setWidth(int value) {
      bitField0_ |= 0x00000002;
      width_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 width = 2;</code>
     */
    public Builder clearWidth() {
      bitField0_ = (bitField0_ & ~0x00000002);
      width_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protobuf_unittest.Wheel)
  }

  // @@protoc_insertion_point(class_scope:protobuf_unittest.Wheel)
  private static final protobuf_unittest.Wheel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf_unittest.Wheel();
  }

  public static protobuf_unittest.Wheel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Wheel>
      PARSER = new com.google.protobuf.AbstractParser<Wheel>() {
    public Wheel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Wheel(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Wheel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Wheel> getParserForType() {
    return PARSER;
  }

  public protobuf_unittest.Wheel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

