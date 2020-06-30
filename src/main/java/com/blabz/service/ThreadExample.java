package com.blabz.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ThreadExample {
	
	public void threadCreator(MultipartFile multipartFile) {
		System.out.println("I am calling method");
		CSVOps ops = new CSVOps(multipartFile);
		System.out.println("Called to the method");
		Thread t1 = new Thread(ops);
		t1.setName("Thread1 is");
		t1.start();
		
//		ExecutorService executorService = Executors.newFixedThreadPool(5);
//			Runnable r = new CSVOps(multipartFile);
//			executorService.execute(r);
//			executorService.shutdown();
//		while(!executorService.isTerminated()) {
//			System.out.println("finished task");
//		}
	}	
}
