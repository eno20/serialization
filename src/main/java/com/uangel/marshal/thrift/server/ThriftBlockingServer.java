package com.uangel.marshal.thrift.server;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

import com.uangel.marshal.thrift.service.MapTransferService;
import com.uangel.marshal.thrift.service.MapTransferServiceImpl;

public class ThriftBlockingServer {
	private void start() {
		try {
			TServerSocket serverTransport = new TServerSocket(8080);
			MapTransferService.Processor processor = new MapTransferService.Processor(new MapTransferServiceImpl());

			TServer bks = new TThreadPoolServer(new TThreadPoolServer.Args(serverTransport).processor(processor));
			System.out.println("Starting thrift blocking server on port 8080 ...");
			bks.serve();
		} catch (TTransportException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ThriftBlockingServer server = new ThriftBlockingServer();
		server.start();
	}
}
