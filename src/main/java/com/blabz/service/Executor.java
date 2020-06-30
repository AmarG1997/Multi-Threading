package com.blabz.service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Executor {
	
//	public static ExecutorService newFixedThreadPool(int nThreads) {
//		new ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
//		Runnable runnableTask = ()->{
//			try {
//				TimeUnit.MILLISECONDS.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		};
//		List<Runnable> a = new ArrayList<>();
//		a.add(runnableTask);
//		a.add(runnableTask);
//		a.add(runnableTask);
//		a.add(runnableTask);
//		a.add(runnableTask);
//		System.out.println("Inside : " + Thread.currentThread().getName());
//		return null;
//	}
	
}
