package com.uangel.marshal.proto.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

import io.grpc.stub.StreamObserver;

public class MapTransferServiceImpl extends MapTransferGrpc.MapTransferImplBase {
	public AtomicLong elapsedTime = new AtomicLong(0);
	
	@Override
	public void transfer(Parameter request, StreamObserver<Parameter> responseObserver) {
		Instant start = Instant.now();
		String filename;
		
		try {
			filename = "src/main/resources/received/" + request.getImageName();
		
			FileChannel channnel = new FileOutputStream(filename).getChannel();
			channnel.write(request.getImageMap().asReadOnlyByteBuffer());
			channnel.close();
			
			System.out.println(request.getImageName() + " is saved");
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.println("Elapsed(millis): " + elapsedTime.getAndAdd(elapsed.toMillis()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		responseObserver.onNext(request);
		responseObserver.onCompleted();
	}

}
