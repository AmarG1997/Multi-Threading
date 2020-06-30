package com.blabz.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.multipart.MultipartFile;

import com.blabz.model.LMSModel;
import com.blabz.repository.LMSRepo;

@EnableAsync
public class CSVOps implements Runnable{
	
	static int limit = 2000;
	static int lineCount = 1;
	MultipartFile multipartFile;
	
	public CSVOps(MultipartFile multipartFile) {
		this.multipartFile=multipartFile;
	}
	
	@Autowired
	LMSRepo lmsRepo;
	
	int count=0;

	@Async
	private synchronized List<LMSModel> readCsv() throws IOException {
		BufferedReader br;
		List<LMSModel> result = new ArrayList<>();		
		String line;
		InputStream is = multipartFile.getInputStream();
		br=new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			if(line.length()>0) {
				count++;
			System.out.println("data is ---->"+line);
			String[] data = line.split(",");
			LMSModel lmsModel = new LMSModel();
			lmsModel.setDateTime(data[0]);
			lmsModel.setCpuCount(data[1]);
			lmsModel.setCpuWorkingTime(data[2]);
			lmsModel.setCpuIdleTime(data[3]);
			lmsModel.setCpu_percent(data[4]);
			lmsModel.setUsage_Cpu_Count(data[5]);
			lmsModel.setNumberOfSoftwareInterruptsSinceBoot(data[6]);
			lmsModel.setNumberOfSystemCallsSinceBoot(data[7]);
			lmsModel.setNumberOfInterruptsSinceBoot(data[8]);
			lmsModel.setCpuAverageLoadOver1min(data[9]);
			lmsModel.setCpuAverageLoadOver5min(data[10]);
			lmsModel.setCpuAverageLoadOver15min(data[11]);
			lmsModel.setSystemTotalMemory(data[12]);
			lmsModel.setSystemUSedMemory(data[13]);
			lmsModel.setSystemFreeMemory(data[14]);
			lmsModel.setSystemActiveMemory(data[15]);
			lmsModel.setSystemInActiveMemory(data[16]);
			lmsModel.setSystemBufferMemory(data[17]);
			lmsModel.setSystemCachedMemory(data[18]);
			lmsModel.setSystemSharedMemory(data[19]);
			lmsModel.setSystemAvailableMemory(data[20]);
			lmsModel.setDiskTotalMemory(data[21]);
			lmsModel.setDiskUsedMemory(data[22]);
			lmsModel.setDiskFreeMemory(data[23]);
			lmsModel.setDiskReadCount(data[24]);
			lmsModel.setDiskWriteCount(data[25]);
			lmsModel.setDiskReadBytes(data[26]);
			lmsModel.setDiskWriteBytes(data[27]);
			lmsModel.setTimeSpentReadingFromDisk(data[28]);
			lmsModel.setTimeSpentWritingToDisk(data[29]);
			lmsModel.setTimeSpentDoingActualIO(data[30]);
			lmsModel.setNumberOfBytesSent(data[31]);
			lmsModel.setNumberOfBytesReceived(data[32]);
			lmsModel.setNumberOfPacketsSent(data[33]);
			lmsModel.setNumberOfPacketReceived(data[34]);
			lmsModel.setTotalNumberOfErrorsWhileReceiving(data[35]);
			lmsModel.setTotalNumberOfErrorWhileSending(data[36]);
			lmsModel.setTotalNumberOfIncomingPacketsWhichWereDropped(data[37]);
			lmsModel.setTotalNumberOfOutgoingPacketsWhichWereDropped(data[38]);
			lmsModel.setBootTime(data[39]);
			lmsModel.setUserName(data[40]);
			lmsModel.setKeyboard(data[41]);
			lmsModel.setMouse(data[42]);
			lmsModel.setTechnology(data[43]);
			lmsModel.setFileChanged(data[44]);
			result.add(lmsModel);
			System.out.println("Curremy thread is -->"+Thread.currentThread().getName());
//			lmsRepo.saveAll(result);
		}
	}
		System.out.println("resuly "+ result.size()+"count is-->"+count);
//		lmsRepo.saveAll(result);
//		System.out.println("write data suuce");
		return result;
}

	@Override
	public void run() {
		try {
			List<LMSModel> result = readCsv();
//			Task t1 = new Task(result);
//			Thread thread = new Thread(t1);
//			thread.start();
				ExecutorService executorService = Executors.newFixedThreadPool(5);
//				for(int i=0;i<1;i++) {
					Runnable r = new Task(result);
					executorService.submit(r);
//				}
//				System.out.println("before shutdown");
//				executorService.shutdown();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		try {
//			List<LMSModel> result = readCsv();
//			Runnable r2= new Task(result,"Thread2");
//			Runnable r3= new Task(result,"Thread3");
//			Runnable r4= new Task(result,"Thread4");
//			Runnable r5= new Task(result,"Thread5");
//			ExecutorService executorService = Executors.newFixedThreadPool(5);
//			
//			executorService.execute(r5);
//			executorService.execute(r2);
//			executorService.execute(r3);
//			executorService.execute(r4);
//			System.out.println("ready to executr"+Thread.currentThread().getName());
			
//			for(int i=2;i<5;i++) {
//				executorService.execute(writeData(result));
//				executorService.execute(()->{
//					System.out.println("in executor service"+result.size()+"Thread is -->"+Thread.currentThread().getName());
//					lmsRepo.saveAll(result);
//					System.out.println("Data loaded");
//				});
//			}
//			executorService.shutdown();
//			while(!executorService.isTerminated()) {
//				System.out.println("finished task");
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
//	@Async
//	public synchronized Runnable writeData(List<LMSModel> result) {
//		System.out.println("in executor service"+result.size()+"Thread is -->"+Thread.currentThread().getName());
//		lmsRepo.saveAll(result);
//		return null;
//	}

	

}

