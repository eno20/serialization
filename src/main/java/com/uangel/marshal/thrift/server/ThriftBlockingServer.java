package com.uangel.marshal.thrift.server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uangel.marshal.thrift.client.ThriftBlockingClient;
import com.uangel.marshal.thrift.service.MapTransferService;
import com.uangel.marshal.thrift.service.MapTransferServiceImpl;

public class ThriftBlockingServer {
	private static final Logger logger = LoggerFactory.getLogger(ThriftBlockingClient.class);
    private static final int port = 8081;
    
	private static void start() throws TTransportException {
		TServerSocket serverTransport = new TServerSocket(port);
		MapTransferService.Processor processor = new MapTransferService.Processor(new MapTransferServiceImpl());

		TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
		logger.info("Starting thrift blocking server on port 8080 ...");
		server.serve();
	}

	public static void main(String[] args) throws TTransportException {
		start();
	}
}
