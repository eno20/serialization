package com.uangel.marshal.thrift.server;

import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TNonblockingServerTransport;
import org.apache.thrift.transport.TTransportException;

import com.uangel.marshal.thrift.service.MapTransferService;
import com.uangel.marshal.thrift.service.MapTransferServiceImpl;

public class ThriftNonBlockingServer {
	private void start() {
        try {
        	TNonblockingServerTransport serverTransport = new TNonblockingServerSocket(8081);
        	
        	MapTransferService.Processor processor = new MapTransferService.Processor(new MapTransferServiceImpl());
        	
            TServer server = new TNonblockingServer(new TNonblockingServer.Args(serverTransport).processor(processor));
            System.out.println("Starting thrift non-blocking server on port 8080 ...");
            server.serve();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
    	ThriftNonBlockingServer server = new ThriftNonBlockingServer();
        server.start();
    }
}
