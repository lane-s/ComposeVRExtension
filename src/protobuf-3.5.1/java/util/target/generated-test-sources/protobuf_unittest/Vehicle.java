// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/nested_builders_test.proto

package protobuf_unittest;

/**
 * Protobuf type {@code protobuf_unittest.Vehicle}
 */
public  final class Vehicle extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:protobuf_unittest.Vehicle)
    VehicleOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Vehicle.newBuilder() to construct.
  private Vehicle(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Vehicle() {
    wheel_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Vehicle(
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
          case 10: {
            protobuf_unittest.Engine.Builder subBuilder = null;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
              subBuilder = engine_.toBuilder();
            }
            engine_ = input.readMessage(protobuf_unittest.Engine.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(engine_);
              engine_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000001;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>();
              mutable_bitField0_ |= 0x00000002;
            }
            wheel_.add(
                input.readMessage(protobuf_unittest.Wheel.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        wheel_ = java.util.Collections.unmodifiableList(wheel_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            protobuf_unittest.Vehicle.class, protobuf_unittest.Vehicle.Builder.class);
  }

  private int bitField0_;
  public static final int ENGINE_FIELD_NUMBER = 1;
  private protobuf_unittest.Engine engine_;
  /**
   * <code>optional .protobuf_unittest.Engine engine = 1;</code>
   */
  public boolean hasEngine() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional .protobuf_unittest.Engine engine = 1;</code>
   */
  public protobuf_unittest.Engine getEngine() {
    return engine_ == null ? protobuf_unittest.Engine.getDefaultInstance() : engine_;
  }
  /**
   * <code>optional .protobuf_unittest.Engine engine = 1;</code>
   */
  public protobuf_unittest.EngineOrBuilder getEngineOrBuilder() {
    return engine_ == null ? protobuf_unittest.Engine.getDefaultInstance() : engine_;
  }

  public static final int WHEEL_FIELD_NUMBER = 2;
  private java.util.List<protobuf_unittest.Wheel> wheel_;
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  public java.util.List<protobuf_unittest.Wheel> getWheelList() {
    return wheel_;
  }
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  public java.util.List<? extends protobuf_unittest.WheelOrBuilder> 
      getWheelOrBuilderList() {
    return wheel_;
  }
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  public int getWheelCount() {
    return wheel_.size();
  }
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  public protobuf_unittest.Wheel getWheel(int index) {
    return wheel_.get(index);
  }
  /**
   * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
   */
  public protobuf_unittest.WheelOrBuilder getWheelOrBuilder(
      int index) {
    return wheel_.get(index);
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
      output.writeMessage(1, getEngine());
    }
    for (int i = 0; i < wheel_.size(); i++) {
      output.writeMessage(2, wheel_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEngine());
    }
    for (int i = 0; i < wheel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, wheel_.get(i));
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
    if (!(obj instanceof protobuf_unittest.Vehicle)) {
      return super.equals(obj);
    }
    protobuf_unittest.Vehicle other = (protobuf_unittest.Vehicle) obj;

    boolean result = true;
    result = result && (hasEngine() == other.hasEngine());
    if (hasEngine()) {
      result = result && getEngine()
          .equals(other.getEngine());
    }
    result = result && getWheelList()
        .equals(other.getWheelList());
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
    if (hasEngine()) {
      hash = (37 * hash) + ENGINE_FIELD_NUMBER;
      hash = (53 * hash) + getEngine().hashCode();
    }
    if (getWheelCount() > 0) {
      hash = (37 * hash) + WHEEL_FIELD_NUMBER;
      hash = (53 * hash) + getWheelList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static protobuf_unittest.Vehicle parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Vehicle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static protobuf_unittest.Vehicle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Vehicle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Vehicle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static protobuf_unittest.Vehicle parseFrom(
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
  public static Builder newBuilder(protobuf_unittest.Vehicle prototype) {
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
   * Protobuf type {@code protobuf_unittest.Vehicle}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:protobuf_unittest.Vehicle)
      protobuf_unittest.VehicleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              protobuf_unittest.Vehicle.class, protobuf_unittest.Vehicle.Builder.class);
    }

    // Construct using protobuf_unittest.Vehicle.newBuilder()
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
        getEngineFieldBuilder();
        getWheelFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (engineBuilder_ == null) {
        engine_ = null;
      } else {
        engineBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (wheelBuilder_ == null) {
        wheel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        wheelBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_descriptor;
    }

    public protobuf_unittest.Vehicle getDefaultInstanceForType() {
      return protobuf_unittest.Vehicle.getDefaultInstance();
    }

    public protobuf_unittest.Vehicle build() {
      protobuf_unittest.Vehicle result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public protobuf_unittest.Vehicle buildPartial() {
      protobuf_unittest.Vehicle result = new protobuf_unittest.Vehicle(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      if (engineBuilder_ == null) {
        result.engine_ = engine_;
      } else {
        result.engine_ = engineBuilder_.build();
      }
      if (wheelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          wheel_ = java.util.Collections.unmodifiableList(wheel_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.wheel_ = wheel_;
      } else {
        result.wheel_ = wheelBuilder_.build();
      }
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
      if (other instanceof protobuf_unittest.Vehicle) {
        return mergeFrom((protobuf_unittest.Vehicle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(protobuf_unittest.Vehicle other) {
      if (other == protobuf_unittest.Vehicle.getDefaultInstance()) return this;
      if (other.hasEngine()) {
        mergeEngine(other.getEngine());
      }
      if (wheelBuilder_ == null) {
        if (!other.wheel_.isEmpty()) {
          if (wheel_.isEmpty()) {
            wheel_ = other.wheel_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureWheelIsMutable();
            wheel_.addAll(other.wheel_);
          }
          onChanged();
        }
      } else {
        if (!other.wheel_.isEmpty()) {
          if (wheelBuilder_.isEmpty()) {
            wheelBuilder_.dispose();
            wheelBuilder_ = null;
            wheel_ = other.wheel_;
            bitField0_ = (bitField0_ & ~0x00000002);
            wheelBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getWheelFieldBuilder() : null;
          } else {
            wheelBuilder_.addAllMessages(other.wheel_);
          }
        }
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
      protobuf_unittest.Vehicle parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (protobuf_unittest.Vehicle) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private protobuf_unittest.Engine engine_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        protobuf_unittest.Engine, protobuf_unittest.Engine.Builder, protobuf_unittest.EngineOrBuilder> engineBuilder_;
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public boolean hasEngine() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public protobuf_unittest.Engine getEngine() {
      if (engineBuilder_ == null) {
        return engine_ == null ? protobuf_unittest.Engine.getDefaultInstance() : engine_;
      } else {
        return engineBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public Builder setEngine(protobuf_unittest.Engine value) {
      if (engineBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        engine_ = value;
        onChanged();
      } else {
        engineBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public Builder setEngine(
        protobuf_unittest.Engine.Builder builderForValue) {
      if (engineBuilder_ == null) {
        engine_ = builderForValue.build();
        onChanged();
      } else {
        engineBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public Builder mergeEngine(protobuf_unittest.Engine value) {
      if (engineBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001) &&
            engine_ != null &&
            engine_ != protobuf_unittest.Engine.getDefaultInstance()) {
          engine_ =
            protobuf_unittest.Engine.newBuilder(engine_).mergeFrom(value).buildPartial();
        } else {
          engine_ = value;
        }
        onChanged();
      } else {
        engineBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public Builder clearEngine() {
      if (engineBuilder_ == null) {
        engine_ = null;
        onChanged();
      } else {
        engineBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public protobuf_unittest.Engine.Builder getEngineBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEngineFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    public protobuf_unittest.EngineOrBuilder getEngineOrBuilder() {
      if (engineBuilder_ != null) {
        return engineBuilder_.getMessageOrBuilder();
      } else {
        return engine_ == null ?
            protobuf_unittest.Engine.getDefaultInstance() : engine_;
      }
    }
    /**
     * <code>optional .protobuf_unittest.Engine engine = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        protobuf_unittest.Engine, protobuf_unittest.Engine.Builder, protobuf_unittest.EngineOrBuilder> 
        getEngineFieldBuilder() {
      if (engineBuilder_ == null) {
        engineBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            protobuf_unittest.Engine, protobuf_unittest.Engine.Builder, protobuf_unittest.EngineOrBuilder>(
                getEngine(),
                getParentForChildren(),
                isClean());
        engine_ = null;
      }
      return engineBuilder_;
    }

    private java.util.List<protobuf_unittest.Wheel> wheel_ =
      java.util.Collections.emptyList();
    private void ensureWheelIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>(wheel_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        protobuf_unittest.Wheel, protobuf_unittest.Wheel.Builder, protobuf_unittest.WheelOrBuilder> wheelBuilder_;

    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public java.util.List<protobuf_unittest.Wheel> getWheelList() {
      if (wheelBuilder_ == null) {
        return java.util.Collections.unmodifiableList(wheel_);
      } else {
        return wheelBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public int getWheelCount() {
      if (wheelBuilder_ == null) {
        return wheel_.size();
      } else {
        return wheelBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public protobuf_unittest.Wheel getWheel(int index) {
      if (wheelBuilder_ == null) {
        return wheel_.get(index);
      } else {
        return wheelBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder setWheel(
        int index, protobuf_unittest.Wheel value) {
      if (wheelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWheelIsMutable();
        wheel_.set(index, value);
        onChanged();
      } else {
        wheelBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder setWheel(
        int index, protobuf_unittest.Wheel.Builder builderForValue) {
      if (wheelBuilder_ == null) {
        ensureWheelIsMutable();
        wheel_.set(index, builderForValue.build());
        onChanged();
      } else {
        wheelBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder addWheel(protobuf_unittest.Wheel value) {
      if (wheelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWheelIsMutable();
        wheel_.add(value);
        onChanged();
      } else {
        wheelBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder addWheel(
        int index, protobuf_unittest.Wheel value) {
      if (wheelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureWheelIsMutable();
        wheel_.add(index, value);
        onChanged();
      } else {
        wheelBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder addWheel(
        protobuf_unittest.Wheel.Builder builderForValue) {
      if (wheelBuilder_ == null) {
        ensureWheelIsMutable();
        wheel_.add(builderForValue.build());
        onChanged();
      } else {
        wheelBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder addWheel(
        int index, protobuf_unittest.Wheel.Builder builderForValue) {
      if (wheelBuilder_ == null) {
        ensureWheelIsMutable();
        wheel_.add(index, builderForValue.build());
        onChanged();
      } else {
        wheelBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder addAllWheel(
        java.lang.Iterable<? extends protobuf_unittest.Wheel> values) {
      if (wheelBuilder_ == null) {
        ensureWheelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, wheel_);
        onChanged();
      } else {
        wheelBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder clearWheel() {
      if (wheelBuilder_ == null) {
        wheel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        wheelBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public Builder removeWheel(int index) {
      if (wheelBuilder_ == null) {
        ensureWheelIsMutable();
        wheel_.remove(index);
        onChanged();
      } else {
        wheelBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public protobuf_unittest.Wheel.Builder getWheelBuilder(
        int index) {
      return getWheelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public protobuf_unittest.WheelOrBuilder getWheelOrBuilder(
        int index) {
      if (wheelBuilder_ == null) {
        return wheel_.get(index);  } else {
        return wheelBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public java.util.List<? extends protobuf_unittest.WheelOrBuilder> 
         getWheelOrBuilderList() {
      if (wheelBuilder_ != null) {
        return wheelBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(wheel_);
      }
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public protobuf_unittest.Wheel.Builder addWheelBuilder() {
      return getWheelFieldBuilder().addBuilder(
          protobuf_unittest.Wheel.getDefaultInstance());
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public protobuf_unittest.Wheel.Builder addWheelBuilder(
        int index) {
      return getWheelFieldBuilder().addBuilder(
          index, protobuf_unittest.Wheel.getDefaultInstance());
    }
    /**
     * <code>repeated .protobuf_unittest.Wheel wheel = 2;</code>
     */
    public java.util.List<protobuf_unittest.Wheel.Builder> 
         getWheelBuilderList() {
      return getWheelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        protobuf_unittest.Wheel, protobuf_unittest.Wheel.Builder, protobuf_unittest.WheelOrBuilder> 
        getWheelFieldBuilder() {
      if (wheelBuilder_ == null) {
        wheelBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            protobuf_unittest.Wheel, protobuf_unittest.Wheel.Builder, protobuf_unittest.WheelOrBuilder>(
                wheel_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        wheel_ = null;
      }
      return wheelBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:protobuf_unittest.Vehicle)
  }

  // @@protoc_insertion_point(class_scope:protobuf_unittest.Vehicle)
  private static final protobuf_unittest.Vehicle DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new protobuf_unittest.Vehicle();
  }

  public static protobuf_unittest.Vehicle getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Vehicle>
      PARSER = new com.google.protobuf.AbstractParser<Vehicle>() {
    public Vehicle parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Vehicle(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Vehicle> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Vehicle> getParserForType() {
    return PARSER;
  }

  public protobuf_unittest.Vehicle getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

