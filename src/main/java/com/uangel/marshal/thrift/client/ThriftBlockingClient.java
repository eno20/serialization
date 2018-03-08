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

import com.uangel.marshal.thrift.service.MapTransferService;
import com.uangel.marshal.thrift.service.Parameter;

public class ThriftBlockingClient {
	private void invoke() {
        try {
        	System.out.println("start bocking client...");
			Instant start = Instant.now();
			
			TTransport transport = new TSocket("localhost", 8080);
 
            TProtocol protocol = new TBinaryProtocol(transport);
//          TProtocol protocol = new TCompactProtocol(transport);
 
            MapTransferService.Client bkc = new MapTransferService.Client(protocol);
            transport.open();
            
			Path sampleImg = Paths.get("src/main/resources/SampleImg2mb.jpg");
			Parameter param = null;
			for (int i = 0; i < 100; i++) {
				// 서버에 보낼 요청 메시지를 생성
				param = new Parameter(i, System.currentTimeMillis() + ".jpg", ByteBuffer.wrap(Files.readAllBytes(sampleImg)));
				bkc.transfer(param);
				System.out.println("complete to send image file" + i);
				transport.close();
			}
			
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.println("Elapsed(millis): " + elapsed.toMillis());
            
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
 
    public static void main(String[] args) {
    	ThriftBlockingClient client = new ThriftBlockingClient();
        client.invoke();
 
    }
}
