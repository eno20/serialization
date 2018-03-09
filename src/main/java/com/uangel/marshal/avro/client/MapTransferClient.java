package com.uangel.marshal.avro.client;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;

import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uangel.marshal.avro.service.MapTransferService;
import com.uangel.marshal.avro.service.Parameter;

public class MapTransferClient {
	private static final Logger logger = LoggerFactory.getLogger(MapTransferClient.class);
    private static final int port = 5123;

    public static void invoke() {
    	logger.info("start bocking client...");
    	try {
	    	NettyTransceiver client = new NettyTransceiver(new InetSocketAddress(port));
	    	MapTransferService proxy = (MapTransferService) SpecificRequestor.getClient(MapTransferService.class, client);
	    	
	    	Instant start = Instant.now();
			Path sampleImg = Paths.get("src/main/resources/SampleImg2mb.jpg");
			Parameter param = null;
			for (int i = 0; i < 100; i++) {
				// 서버에 보낼 요청 메시지를 생성
				param = Parameter.newBuilder()
						.setId(i)
						.setImageName(System.currentTimeMillis() + ".jpg")
						.setImageMap(ByteBuffer.wrap(Files.readAllBytes(sampleImg))).build();
				proxy.transfer(param);
				System.out.println("complete to send image file" + i);
			}
			
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.println("Elapsed(millis): " + elapsed.toMillis());
	    	
	    	client.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    public static void main(String[] args) {
    	invoke();
    }
}
