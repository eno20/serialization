package com.uangel.marshal.proto.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.10.0)",
    comments = "Source: imgTransfer.proto")
public final class MapTransferGrpc {

  private MapTransferGrpc() {}

  public static final String SERVICE_NAME = "imgtransfer.MapTransfer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTransferMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.uangel.marshal.proto.service.Parameter,
      com.uangel.marshal.proto.service.Parameter> METHOD_TRANSFER = getTransferMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.uangel.marshal.proto.service.Parameter,
      com.uangel.marshal.proto.service.Parameter> getTransferMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.uangel.marshal.proto.service.Parameter,
      com.uangel.marshal.proto.service.Parameter> getTransferMethod() {
    return getTransferMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.uangel.marshal.proto.service.Parameter,
      com.uangel.marshal.proto.service.Parameter> getTransferMethodHelper() {
    io.grpc.MethodDescriptor<com.uangel.marshal.proto.service.Parameter, com.uangel.marshal.proto.service.Parameter> getTransferMethod;
    if ((getTransferMethod = MapTransferGrpc.getTransferMethod) == null) {
      synchronized (MapTransferGrpc.class) {
        if ((getTransferMethod = MapTransferGrpc.getTransferMethod) == null) {
          MapTransferGrpc.getTransferMethod = getTransferMethod = 
              io.grpc.MethodDescriptor.<com.uangel.marshal.proto.service.Parameter, com.uangel.marshal.proto.service.Parameter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "imgtransfer.MapTransfer", "transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uangel.marshal.proto.service.Parameter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uangel.marshal.proto.service.Parameter.getDefaultInstance()))
                  .setSchemaDescriptor(new MapTransferMethodDescriptorSupplier("transfer"))
                  .build();
          }
        }
     }
     return getTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MapTransferStub newStub(io.grpc.Channel channel) {
    return new MapTransferStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MapTransferBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MapTransferBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MapTransferFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MapTransferFutureStub(channel);
  }

  /**
   */
  public static abstract class MapTransferImplBase implements io.grpc.BindableService {

    /**
     */
    public void transfer(com.uangel.marshal.proto.service.Parameter request,
        io.grpc.stub.StreamObserver<com.uangel.marshal.proto.service.Parameter> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTransferMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uangel.marshal.proto.service.Parameter,
                com.uangel.marshal.proto.service.Parameter>(
                  this, METHODID_TRANSFER)))
          .build();
    }
  }

  /**
   */
  public static final class MapTransferStub extends io.grpc.stub.AbstractStub<MapTransferStub> {
    private MapTransferStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTransferStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTransferStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTransferStub(channel, callOptions);
    }

    /**
     */
    public void transfer(com.uangel.marshal.proto.service.Parameter request,
        io.grpc.stub.StreamObserver<com.uangel.marshal.proto.service.Parameter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MapTransferBlockingStub extends io.grpc.stub.AbstractStub<MapTransferBlockingStub> {
    private MapTransferBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTransferBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTransferBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTransferBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uangel.marshal.proto.service.Parameter transfer(com.uangel.marshal.proto.service.Parameter request) {
      return blockingUnaryCall(
          getChannel(), getTransferMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MapTransferFutureStub extends io.grpc.stub.AbstractStub<MapTransferFutureStub> {
    private MapTransferFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MapTransferFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MapTransferFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MapTransferFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uangel.marshal.proto.service.Parameter> transfer(
        com.uangel.marshal.proto.service.Parameter request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TRANSFER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MapTransferImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MapTransferImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TRANSFER:
          serviceImpl.transfer((com.uangel.marshal.proto.service.Parameter) request,
              (io.grpc.stub.StreamObserver<com.uangel.marshal.proto.service.Parameter>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MapTransferBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MapTransferBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uangel.marshal.proto.service.MapTransferService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MapTransfer");
    }
  }

  private static final class MapTransferFileDescriptorSupplier
      extends MapTransferBaseDescriptorSupplier {
    MapTransferFileDescriptorSupplier() {}
  }

  private static final class MapTransferMethodDescriptorSupplier
      extends MapTransferBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MapTransferMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MapTransferGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MapTransferFileDescriptorSupplier())
              .addMethod(getTransferMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
