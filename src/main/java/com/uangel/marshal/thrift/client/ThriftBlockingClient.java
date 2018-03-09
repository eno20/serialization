package com.uangel.marshal.thrift.client;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uangel.marshal.thrift.service.MapTransferService;
import com.uangel.marshal.thrift.service.Parameter;

public class ThriftBlockingClient {
	private static final Logger logger = LoggerFactory.getLogger(ThriftBlockingClient.class);
    private static final int port = 8081;
	
	private static void invoke() {
		TTransport transport;
        try {
        	logger.info("start bocking client...");
			Instant start = Instant.now();
			
			transport = new TSocket("localhost", port);
            TProtocol protocol = new TBinaryProtocol(transport);
 
            MapTransferService.Client client = new MapTransferService.Client(protocol);
            transport.open();
            
			Path sampleImg = Paths.get("src/main/resources/SampleImg2mb.jpg");
			Parameter param = null;
			for (int i = 0; i < 100; i++) {
				// 서버에 보낼 요청 메시지를 생성
				param = new Parameter(i, System.currentTimeMillis() + ".jpg", ByteBuffer.wrap(Files.readAllBytes(sampleImg)));
				client.transfer(param);
				logger.info("complete to send image file" + i);
			}
			
			transport.close();
			Duration elapsed = Duration.between(start, Instant.now());
			logger.info("Elapsed(millis): " + elapsed.toMillis());
            
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
			e.printStackTrace();
		}
    }
 
    public static void main(String[] args) {
        invoke();
    }
}
