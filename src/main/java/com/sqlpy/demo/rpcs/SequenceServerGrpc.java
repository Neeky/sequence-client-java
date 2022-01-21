package com.sqlpy.demo.rpcs;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: sequence.proto")
public final class SequenceServerGrpc {

  private SequenceServerGrpc() {}

  public static final String SERVICE_NAME = "SequenceServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sqlpy.demo.rpcs.SequenceRequest,
      com.sqlpy.demo.rpcs.SequenceResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.sqlpy.demo.rpcs.SequenceRequest.class,
      responseType = com.sqlpy.demo.rpcs.SequenceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sqlpy.demo.rpcs.SequenceRequest,
      com.sqlpy.demo.rpcs.SequenceResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.sqlpy.demo.rpcs.SequenceRequest, com.sqlpy.demo.rpcs.SequenceResponse> getGetMethod;
    if ((getGetMethod = SequenceServerGrpc.getGetMethod) == null) {
      synchronized (SequenceServerGrpc.class) {
        if ((getGetMethod = SequenceServerGrpc.getGetMethod) == null) {
          SequenceServerGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.sqlpy.demo.rpcs.SequenceRequest, com.sqlpy.demo.rpcs.SequenceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sqlpy.demo.rpcs.SequenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sqlpy.demo.rpcs.SequenceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SequenceServerMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SequenceServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequenceServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequenceServerStub>() {
        @java.lang.Override
        public SequenceServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequenceServerStub(channel, callOptions);
        }
      };
    return SequenceServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SequenceServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequenceServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequenceServerBlockingStub>() {
        @java.lang.Override
        public SequenceServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequenceServerBlockingStub(channel, callOptions);
        }
      };
    return SequenceServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SequenceServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SequenceServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SequenceServerFutureStub>() {
        @java.lang.Override
        public SequenceServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SequenceServerFutureStub(channel, callOptions);
        }
      };
    return SequenceServerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SequenceServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void get(com.sqlpy.demo.rpcs.SequenceRequest request,
        io.grpc.stub.StreamObserver<com.sqlpy.demo.rpcs.SequenceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.sqlpy.demo.rpcs.SequenceRequest,
                com.sqlpy.demo.rpcs.SequenceResponse>(
                  this, METHODID_GET)))
          .build();
    }
  }

  /**
   */
  public static final class SequenceServerStub extends io.grpc.stub.AbstractAsyncStub<SequenceServerStub> {
    private SequenceServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequenceServerStub(channel, callOptions);
    }

    /**
     */
    public void get(com.sqlpy.demo.rpcs.SequenceRequest request,
        io.grpc.stub.StreamObserver<com.sqlpy.demo.rpcs.SequenceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SequenceServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SequenceServerBlockingStub> {
    private SequenceServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequenceServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sqlpy.demo.rpcs.SequenceResponse get(com.sqlpy.demo.rpcs.SequenceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SequenceServerFutureStub extends io.grpc.stub.AbstractFutureStub<SequenceServerFutureStub> {
    private SequenceServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SequenceServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SequenceServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sqlpy.demo.rpcs.SequenceResponse> get(
        com.sqlpy.demo.rpcs.SequenceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SequenceServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SequenceServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.sqlpy.demo.rpcs.SequenceRequest) request,
              (io.grpc.stub.StreamObserver<com.sqlpy.demo.rpcs.SequenceResponse>) responseObserver);
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

  private static abstract class SequenceServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SequenceServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sqlpy.demo.rpcs.Sequence.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SequenceServer");
    }
  }

  private static final class SequenceServerFileDescriptorSupplier
      extends SequenceServerBaseDescriptorSupplier {
    SequenceServerFileDescriptorSupplier() {}
  }

  private static final class SequenceServerMethodDescriptorSupplier
      extends SequenceServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SequenceServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SequenceServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SequenceServerFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
