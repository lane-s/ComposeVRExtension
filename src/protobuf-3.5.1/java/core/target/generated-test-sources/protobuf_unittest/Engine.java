// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_builders_test.proto

package protobuf_unittest;

/**
 * Protobuf type {@code protobuf_unittest.Engine}
 */
public  final class Engine extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protobuf_unittest.Engine)
    EngineOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Engine.newBuilder() to construct.
  private Engine(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Engine() {
    cylinder_ = 0;
    liters_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Engine(
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
            cylinder_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            liters_ = input.readInt32();
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
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Engine_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Engine_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf_unittest.Engine.class, protobuf_unittest.Engine.Builder.class);
  }

  private int bitField0_;
  public static final int CYLINDER_FIELD_NUMBER = 1;
  private int cylinder_;
  /**
   * <code>optional int32 cylinder = 1;</code>
   */
  public boolean hasCylinder() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional int32 cylinder = 1;</code>
   */
  public int getCylinder() {
    return cylinder_;
  }

  public static final int LITERS_FIELD_NUMBER = 2;
  private int liters_;
  /**
   * <code>optional int32 liters = 2;</code>
   */
  public boolean hasLiters() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 liters = 2;</code>
   */
  public int getLiters() {
    return liters_;
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
      output.writeInt32(1, cylinder_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, liters_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, cylinder_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, liters_);
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
    if (!(obj instanceof protobuf_unittest.Engine)) {
      return super.equals(obj);
    }
    protobuf_unittest.Engine other = (protobuf_unittest.Engine) obj;

    boolean result = true;
    result = result && (hasCylinder() == other.hasCylinder());
    if (hasCylinder()) {
      result = result && (getCylinder()
          == other.getCylinder());
    }
    result = result && (hasLiters() == other.hasLiters());
    if (hasLiters()) {
      result = result && (getLiters()
          == other.getLiters());
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
    if (hasCylinder()) {
      hash = (37 * hash) + CYLINDER_FIELD_NUMBER;
      hash = (53 * hash) + getCylinder();
    }
    if (hasLiters()) {
      hash = (37 * hash) + LITERS_FIELD_NUMBER;
      hash = (53 * hash) + getLiters();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf_unittest.Engine parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Engine parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Engine parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Engine parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Engine parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Engine parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Engine parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Engine parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Engine parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Engine parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Engine parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Engine parseFrom(
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
  public static Builder newBuilder(protobuf_unittest.Engine prototype) {
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
   * Protobuf type {@code protobuf_unittest.Engine}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protobuf_unittest.Engine)
      protobuf_unittest.EngineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Engine_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Engine_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.Engine.class, protobuf_unittest.Engine.Builder.class);
    }

    // Construct using protobuf_unittest.Engine.newBuilder()
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
      cylinder_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      liters_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Engine_descriptor;
    }

    public protobuf_unittest.Engine getDefaultInstanceForType() {
      return protobuf_unittest.Engine.getDefaultInstance();
    }

    public protobuf_unittest.Engine build() {
      protobuf_unittest.Engine result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protobuf_unittest.Engine buildPartial() {
      protobuf_unittest.Engine result = new protobuf_unittest.Engine(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.cylinder_ = cylinder_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.liters_ = liters_;
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
      if (other instanceof protobuf_unittest.Engine) {
        return mergeFrom((protobuf_unittest.Engine)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf_unittest.Engine other) {
      if (other == protobuf_unittest.Engine.getDefaultInstance()) return this;
      if (other.hasCylinder()) {
        setCylinder(other.getCylinder());
      }
      if (other.hasLiters()) {
        setLiters(other.getLiters());
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
      protobuf_unittest.Engine parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protobuf_unittest.Engine) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int cylinder_ ;
    /**
     * <code>optional int32 cylinder = 1;</code>
     */
    public boolean hasCylinder() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 cylinder = 1;</code>
     */
    public int getCylinder() {
      return cylinder_;
    }
    /**
     * <code>optional int32 cylinder = 1;</code>
     */
    public Builder setCylinder(int value) {
      bitField0_ |= 0x00000001;
      cylinder_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 cylinder = 1;</code>
     */
    public Builder clearCylinder() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cylinder_ = 0;
      onChanged();
      return this;
    }

    private int liters_ ;
    /**
     * <code>optional int32 liters = 2;</code>
     */
    public boolean hasLiters() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 liters = 2;</code>
     */
    public int getLiters() {
      return liters_;
    }
    /**
     * <code>optional int32 liters = 2;</code>
     */
    public Builder setLiters(int value) {
      bitField0_ |= 0x00000002;
      liters_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 liters = 2;</code>
     */
    public Builder clearLiters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      liters_ = 0;
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


    // @@protoc_insertion_point(builder_scope:protobuf_unittest.Engine)
  }

  // @@protoc_insertion_point(class_scope:protobuf_unittest.Engine)
  private static final protobuf_unittest.Engine DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf_unittest.Engine();
  }

  public static protobuf_unittest.Engine getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Engine>
      PARSER = new com.google.protobuf.AbstractParser<Engine>() {
    public Engine parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Engine(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Engine> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Engine> getParserForType() {
    return PARSER;
  }

  public protobuf_unittest.Engine getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

