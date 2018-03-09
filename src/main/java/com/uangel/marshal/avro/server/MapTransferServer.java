package com.uangel.marshal.avro.server;

import java.io.IOException;
import java.net.InetSocketAddress;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uangel.marshal.avro.service.MapTransferService;
import com.uangel.marshal.avro.service.MapTransferServiceImpl;

public class MapTransferServer {
	private static final Logger logger = LoggerFactory.getLogger(MapTransferServer.class);
	private static Server server;
    private static final int port = 5123;

    private static void startServer() throws IOException {
    	server = new NettyServer(new SpecificResponder(MapTransferService.class, new MapTransferServiceImpl()),
                                     new InetSocketAddress(port));
    }

    public static void main(String[] args) throws Exception {
        logger.info("Starting server...");
        startServer();
        logger.info("Server started");
    }
}
