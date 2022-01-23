package com.sqlpy.demo;

import com.sqlpy.demo.rpcs.SequenceRequest;
import com.sqlpy.demo.rpcs.SequenceResponse;
import com.sqlpy.demo.rpcs.SequenceServerGrpc.SequenceServerBlockingStub;
import com.sqlpy.demo.rpcs.SequenceServerGrpc;
import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

@Slf4j
public class SequenceClient {
    //private static final Logger logger = Logger.getLogger("sequence-client-java");

    private final SequenceServerBlockingStub blockingStub;
    private final int increment = 1;

    public SequenceClient(Channel channel) {
        this.blockingStub = com.sqlpy.demo.rpcs.SequenceServerGrpc.newBlockingStub(channel);
    }

    public void getSequenceNumber() {
        SequenceRequest request = SequenceRequest.newBuilder().setOffset(increment).build();
        SequenceResponse response ;
        try {
            response = blockingStub.get(request);
        } catch (StatusRuntimeException e) {
            return ;
        }
        log.debug("get sequence number {} .",response.getSequence());
        log.info("get sequence number {} .",response.getSequence());
    }

    @Override
    public String toString() {
        return "SequenceClient{" +
            "incre=" + increment +
            '}';
    }
}
