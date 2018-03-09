package com.uangel.marshal.avro.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.avro.AvroRemoteException;

public class MapTransferServiceImpl implements MapTransferService {
	public AtomicLong elapsedTime = new AtomicLong(0);
	
	@Override
	public Parameter transfer(Parameter image) throws AvroRemoteException {
		Instant start = Instant.now();
		String filename;
		
		try {
			filename = "src/main/resources/received/" + image.getImageName();
		
			FileChannel channnel = new FileOutputStream(filename).getChannel();
			channnel.write(image.getImageMap());
			channnel.close();
			
			System.out.println(image.getImageName() + " is saved");
			Duration elapsed = Duration.between(start, Instant.now());
			
			System.out.println("Elapsed(millis): " + elapsedTime.getAndAdd(elapsed.toMillis()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

}
