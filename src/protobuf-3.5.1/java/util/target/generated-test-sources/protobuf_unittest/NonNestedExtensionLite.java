// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/google/protobuf/non_nested_extension_lite.proto

package protobuf_unittest;

public final class NonNestedExtensionLite {
  private NonNestedExtensionLite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(protobuf_unittest.NonNestedExtensionLite.nonNestedExtensionLite);
  }
  public interface MessageLiteToBeExtendedOrBuilder extends 
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.MessageLiteToBeExtended)
       com.google.protobuf.GeneratedMessageLite.
            ExtendableMessageOrBuilder<
                MessageLiteToBeExtended, MessageLiteToBeExtended.Builder> {
  }
  /**
   * Protobuf type {@code protobuf_unittest.MessageLiteToBeExtended}
   */
  public  static final class MessageLiteToBeExtended extends
      com.google.protobuf.GeneratedMessageLite.ExtendableMessage<
        MessageLiteToBeExtended, MessageLiteToBeExtended.Builder> implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.MessageLiteToBeExtended)
      MessageLiteToBeExtendedOrBuilder {
    private MessageLiteToBeExtended() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      com.google.protobuf.GeneratedMessageLite
        .ExtendableMessage<protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended, protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.Builder>
          .ExtensionWriter extensionWriter =
            newExtensionWriter();
      extensionWriter.writeUntil(536870912, output);
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += extensionsSerializedSize();
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code protobuf_unittest.MessageLiteToBeExtended}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.ExtendableBuilder<
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended, Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.MessageLiteToBeExtended)
        protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtendedOrBuilder {
      // Construct using protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:protobuf_unittest.MessageLiteToBeExtended)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (!extensionsAreInitialized()) {
            return null;
          }
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended other = (protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended) arg1;
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                default: {
                  if (!parseUnknownField(getDefaultInstanceForType(),
                      input, extensionRegistry, tag)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:protobuf_unittest.MessageLiteToBeExtended)
    private static final protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageLiteToBeExtended();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MessageLiteToBeExtended> PARSER;

    public static com.google.protobuf.Parser<MessageLiteToBeExtended> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface MyNonNestedExtensionLiteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:protobuf_unittest.MyNonNestedExtensionLite)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code protobuf_unittest.MyNonNestedExtensionLite}
   */
  public  static final class MyNonNestedExtensionLite extends
      com.google.protobuf.GeneratedMessageLite<
          MyNonNestedExtensionLite, MyNonNestedExtensionLite.Builder> implements
      // @@protoc_insertion_point(message_implements:protobuf_unittest.MyNonNestedExtensionLite)
      MyNonNestedExtensionLiteOrBuilder {
    private MyNonNestedExtensionLite() {
    }
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code protobuf_unittest.MyNonNestedExtensionLite}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite, Builder> implements
        // @@protoc_insertion_point(builder_implements:protobuf_unittest.MyNonNestedExtensionLite)
        protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLiteOrBuilder {
      // Construct using protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:protobuf_unittest.MyNonNestedExtensionLite)
    }
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite other = (protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite) arg1;
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:protobuf_unittest.MyNonNestedExtensionLite)
    private static final protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MyNonNestedExtensionLite();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MyNonNestedExtensionLite> PARSER;

    public static com.google.protobuf.Parser<MyNonNestedExtensionLite> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public static final int NONNESTEDEXTENSIONLITE_FIELD_NUMBER = 1;
  /**
   * <code>extend .protobuf_unittest.MessageLiteToBeExtended { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
      protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended,
      protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite> nonNestedExtensionLite = com.google.protobuf.GeneratedMessageLite
          .newSingularGeneratedExtension(
        protobuf_unittest.NonNestedExtensionLite.MessageLiteToBeExtended.getDefaultInstance(),
        protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite.getDefaultInstance(),
        protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite.getDefaultInstance(),
        null,
        1,
        com.google.protobuf.WireFormat.FieldType.MESSAGE,
        protobuf_unittest.NonNestedExtensionLite.MyNonNestedExtensionLite.class);

  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
