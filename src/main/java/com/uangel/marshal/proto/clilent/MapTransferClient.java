package com.uangel.marshal.proto.clilent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.protobuf.ByteString;
import com.uangel.marshal.proto.service.MapTransferGrpc;
import com.uangel.marshal.proto.service.Parameter;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class MapTransferClient {
	private static final Logger logger = LoggerFactory.getLogger(MapTransferClient.class);

	private final ManagedChannel channel;
	private final MapTransferGrpc.MapTransferBlockingStub blockingStub;

	/**
	 * Construct client connecting to HelloWorld server at {@code host:port}.
	 */
	public MapTransferClient(String host, int port) {
		this(ManagedChannelBuilder.forAddress(host, port)
				// Channels are secure by default (via SSL/TLS). For the example
				// we disable TLS to avoid
				// needing certificates.
				.usePlaintext(true).build());
	}

	/**
	 * Construct client for accessing RouteGuide server using the existing
	 * channel.
	 */
	MapTransferClient(ManagedChannel channel) {
		this.channel = channel;
		blockingStub = MapTransferGrpc.newBlockingStub(channel);
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}

	public void invoke() {
		logger.info("start bocking client...");
		try {
			Instant start = Instant.now();
			Path sampleImg = Paths.get("src/main/resources/SampleImg2mb.jpg");
			Parameter param = null;
			for (int i = 0; i < 100; i++) {
				// 서버에 보낼 요청 메시지를 생성
				param = Parameter.newBuilder()
						.setId(i)
						.setImageName(System.currentTimeMillis() + ".jpg")
						.setImageMap(ByteString.copyFrom(Files.readAllBytes(sampleImg))).build();
				blockingStub.transfer(param);
				System.out.println("complete to send image file" + i);
			}
			
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.println("Elapsed(millis): " + elapsed.toMillis());
		} catch (StatusRuntimeException e) {
	      logger.warn("RPC failed: {0}", e.getStatus());
	      return;
	    } catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Greet server. If provided, the first element of {@code args} is the name
	 * to use in the greeting.
	 */
	public static void main(String[] args) throws Exception {
		MapTransferClient client = new MapTransferClient("localhost", 50051);
		try {
			client.invoke();
		} finally {
			client.shutdown();
		}
	}

}
