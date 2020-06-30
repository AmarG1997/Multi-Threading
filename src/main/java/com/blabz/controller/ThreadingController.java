package com.blabz.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.blabz.service.ReadWriteFile;
import com.blabz.service.ThreadExample;

@RestController
public class ThreadingController {

@Autowired
	ThreadExample thredExample;
	
	@Autowired
	ReadWriteFile readWrite;
	
	@GetMapping(value="/data")
	public void async1(@RequestParam("file") MultipartFile multipartFile) throws IOException {
		thredExample.threadCreator(multipartFile);
//		readWrite.readCsv(multipartFile);
	}
}
