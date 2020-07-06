package com.blabz.controller;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.blabz.dto.ResponseDto;
import com.blabz.service.CSVOps;
import com.blabz.service.ReadWriteFile;
import com.blabz.service.TestThreadPool;

@RestController
public class ThreadingController {

	@Autowired
	CSVOps csvOps;

	@Autowired
	ReadWriteFile readWriteFile;
	
	@Autowired
	TestThreadPool testThreadPool;

	@GetMapping(value = "/csvReadWrite")
	public ResponseEntity<ResponseDto> multithreadingExample(@RequestParam("file") MultipartFile multipartFile) throws IOException {
		double start = System.currentTimeMillis();
		csvOps.readCsv(multipartFile);
		double end = System.currentTimeMillis();
		System.out.println("Total Execution Time Is---->"+(end-start));
		ResponseDto response = new ResponseDto("Import Csv File Successfully");
		return new ResponseEntity<ResponseDto>(response,HttpStatus.OK);
	}

	@GetMapping(value = "/csvReadWrite1")
	public ResponseEntity<ResponseDto> readAndWriteFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
		double start = System.currentTimeMillis();
		readWriteFile.readCsv(multipartFile);
		double end = System.currentTimeMillis();
		System.out.println("Total Execution Time Is---->"+(end-start));
		ResponseDto response = new ResponseDto("Import Csv File Successfully");
		return new ResponseEntity<ResponseDto>(response,HttpStatus.OK);
	}
	
	@GetMapping(value = "/csvReadWrite2")
	public ResponseEntity<ResponseDto> readAndWriteFile2(@RequestParam("file") MultipartFile multipartFile) throws IOException, InterruptedException, ExecutionException {
		double start = System.currentTimeMillis();
		testThreadPool.saveData(multipartFile);
		double end = System.currentTimeMillis();
		System.out.println("Total Execution Time Is---->"+(end-start));
		ResponseDto response = new ResponseDto("Import Csv File Successfully");
		return new ResponseEntity<ResponseDto>(response,HttpStatus.OK);
	}
}
