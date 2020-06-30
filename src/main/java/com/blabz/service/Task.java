package com.blabz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;

import com.blabz.model.LMSModel;
import com.blabz.repository.LMSRepo;

public class Task implements Runnable{
	
	@Autowired
	LMSRepo lmsRepo;
	
	List<LMSModel> result = new ArrayList<>();
	String threadname;
	
	public Task(List<LMSModel> result2) {
		this.result=result2;
	}
	
//	@Async
	public synchronized void writeCsvData() {
		System.out.println("I am in the write method"+result.size()+"Thread is-->"+Thread.currentThread().getName());
		for(LMSModel lmsModel : result) {
			System.out.println("in for lopp-->"+lmsModel);
		}
		lmsRepo.saveAll(result);
		System.out.println("Insert Data Successfully"+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		writeCsvData();
	}

}
