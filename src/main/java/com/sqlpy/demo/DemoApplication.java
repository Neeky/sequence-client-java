package com.sqlpy.demo;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(DemoApplication.class, args);
        ManagedChannel channel = ManagedChannelBuilder.forTarget("127.0.0.1:10352").usePlaintext().build();
        try {
            SequenceClient client = new SequenceClient(channel);
            client.getSequenceNumber();
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

}
