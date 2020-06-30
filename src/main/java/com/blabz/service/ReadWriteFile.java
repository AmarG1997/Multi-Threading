package com.blabz.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.blabz.model.LMSModel;
import com.blabz.repository.LMSRepo;

@Service
public class ReadWriteFile {

	@Autowired
	LMSRepo lmsRepo;
	
	public void readCsv(MultipartFile multipartFile) throws IOException {
		BufferedReader br;
		List<LMSModel> result = new ArrayList<>();		
		String line;
		InputStream is = multipartFile.getInputStream();
		br=new BufferedReader(new InputStreamReader(is));
		while ((line = br.readLine()) != null) {
			if(line.length()>0) {
//			System.out.println("data is ---->"+line);
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
		}
			lmsRepo.saveAll(result);
	}
		System.out.println("Data inserted successfully");
	}	
}
