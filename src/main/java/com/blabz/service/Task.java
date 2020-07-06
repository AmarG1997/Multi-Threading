package com.blabz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.blabz.model.LMSModel;
import com.blabz.repository.LMSRepo;

public class Task implements Runnable{
	
	@Autowired
	LMSRepo lmsRepo;
	
	List<LMSModel> result = new ArrayList<>();
	
	public Task(LMSModel lmsModel) {
		this.result=(List<LMSModel>) lmsModel;
	}
	
	public synchronized void writeCsvData() {
		System.out.println("Insert Data Successfully"+Thread.currentThread().getName());
		lmsRepo.saveAll(result);
		System.out.println("Insert Data Successfully"+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		writeCsvData();
	}

}
