package com.uangel.marshal.proto.server;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uangel.marshal.proto.service.MapTransferServiceImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class MapTransferServer {
	private static final Logger logger = LoggerFactory.getLogger(MapTransferServer.class);

	private Server server;

	private void start() throws IOException {
		/* The port on which the server should run */
		int port = 50051;
		server = ServerBuilder.forPort(port).addService(new MapTransferServiceImpl()).build().start();
		logger.info("GRPC Server started, listening on " + port);
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				// Use stderr here since the logger may have been reset by its
				// JVM shutdown hook.
				logger.error("*** shutting down gRPC server since JVM is shutting down");
				MapTransferServer.this.stop();
				logger.error("*** server shut down");
			}
		});
	}

	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}

	/**
	 * Await termination on the main thread since the grpc library uses daemon
	 * threads.
	 */
	private void blockUntilShutdown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		final MapTransferServer server = new MapTransferServer();
		server.start();
		server.blockUntilShutdown();
	}

}