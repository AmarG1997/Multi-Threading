package com.blabz.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LMSModel {
	
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Id
		private int id;
		
		public String dateTime;
		public String cpuCount;
		public String cpuWorkingTime;
		public String cpuIdleTime;
		public String cpu_percent;
		public String usage_Cpu_Count;
		public String numberOfSoftwareInterruptsSinceBoot;
		public String numberOfSystemCallsSinceBoot;
		public String numberOfInterruptsSinceBoot;
		public String cpuAverageLoadOver1min;
		public String cpuAverageLoadOver5min;
		public String cpuAverageLoadOver15min;
		public String systemTotalMemory;
		public String systemUSedMemory;
		public String systemFreeMemory;
		public String systemActiveMemory;
		public String systemInActiveMemory;
		public String systemBufferMemory;
		public String systemCachedMemory;
		public String systemSharedMemory;
		public String systemAvailableMemory;
		public String diskTotalMemory;
		public String diskUsedMemory;
		public String diskFreeMemory;
		public String diskReadCount;
		public String diskWriteCount;
		public String diskReadBytes;
		public String diskWriteBytes;
		public String timeSpentReadingFromDisk;
		public String timeSpentWritingToDisk;
		public String timeSpentDoingActualIO;
		public String numberOfBytesSent;
		public String numberOfBytesReceived;
		public String numberOfPacketsSent;
		public String numberOfPacketReceived;
		public String totalNumberOfErrorsWhileReceiving;
		public String totalNumberOfErrorWhileSending;
		public String totalNumberOfIncomingPacketsWhichWereDropped;
		public String totalNumberOfOutgoingPacketsWhichWereDropped;
		public String bootTime;
		public String userName;
		public String keyboard;
		public String mouse; 
		public String technology;
		public String fileChanged;
		
		public String getDateTime() {
			return dateTime;
		}
		public void setDateTime(String dateTime) {
			this.dateTime = dateTime;
		}
		public String getCpuCount() {
			return cpuCount;
		}
		public void setCpuCount(String cpuCount) {
			this.cpuCount = cpuCount;
		}
		public String getCpuWorkingTime() {
			return cpuWorkingTime;
		}
		public void setCpuWorkingTime(String cpuWorkingTime) {
			this.cpuWorkingTime = cpuWorkingTime;
		}
		public String getCpuIdleTime() {
			return cpuIdleTime;
		}
		public void setCpuIdleTime(String cpuIdleTime) {
			this.cpuIdleTime = cpuIdleTime;
		}
		public String getCpu_percent() {
			return cpu_percent;
		}
		public void setCpu_percent(String cpu_percent) {
			this.cpu_percent = cpu_percent;
		}
		public String getUsage_Cpu_Count() {
			return usage_Cpu_Count;
		}
		public void setUsage_Cpu_Count(String usage_Cpu_Count) {
			this.usage_Cpu_Count = usage_Cpu_Count;
		}
		public String getNumberOfSoftwareInterruptsSinceBoot() {
			return numberOfSoftwareInterruptsSinceBoot;
		}
		public void setNumberOfSoftwareInterruptsSinceBoot(String numberOfSoftwareInterruptsSinceBoot) {
			this.numberOfSoftwareInterruptsSinceBoot = numberOfSoftwareInterruptsSinceBoot;
		}
		public String getNumberOfSystemCallsSinceBoot() {
			return numberOfSystemCallsSinceBoot;
		}
		public void setNumberOfSystemCallsSinceBoot(String numberOfSystemCallsSinceBoot) {
			this.numberOfSystemCallsSinceBoot = numberOfSystemCallsSinceBoot;
		}
		public String getNumberOfInterruptsSinceBoot() {
			return numberOfInterruptsSinceBoot;
		}
		public void setNumberOfInterruptsSinceBoot(String numberOfInterruptsSinceBoot) {
			this.numberOfInterruptsSinceBoot = numberOfInterruptsSinceBoot;
		}
		public String getCpuAverageLoadOver1min() {
			return cpuAverageLoadOver1min;
		}
		public void setCpuAverageLoadOver1min(String cpuAverageLoadOver1min) {
			this.cpuAverageLoadOver1min = cpuAverageLoadOver1min;
		}
		public String getCpuAverageLoadOver5min() {
			return cpuAverageLoadOver5min;
		}
		public void setCpuAverageLoadOver5min(String cpuAverageLoadOver5min) {
			this.cpuAverageLoadOver5min = cpuAverageLoadOver5min;
		}
		public String getCpuAverageLoadOver15min() {
			return cpuAverageLoadOver15min;
		}
		public void setCpuAverageLoadOver15min(String cpuAverageLoadOver15min) {
			this.cpuAverageLoadOver15min = cpuAverageLoadOver15min;
		}
		public String getSystemTotalMemory() {
			return systemTotalMemory;
		}
		public void setSystemTotalMemory(String systemTotalMemory) {
			this.systemTotalMemory = systemTotalMemory;
		}
		public String getSystemUSedMemory() {
			return systemUSedMemory;
		}
		public void setSystemUSedMemory(String systemUSedMemory) {
			this.systemUSedMemory = systemUSedMemory;
		}
		public String getSystemFreeMemory() {
			return systemFreeMemory;
		}
		public void setSystemFreeMemory(String systemFreeMemory) {
			this.systemFreeMemory = systemFreeMemory;
		}
		public String getSystemActiveMemory() {
			return systemActiveMemory;
		}
		public void setSystemActiveMemory(String systemActiveMemory) {
			this.systemActiveMemory = systemActiveMemory;
		}
		public String getSystemInActiveMemory() {
			return systemInActiveMemory;
		}
		public void setSystemInActiveMemory(String systemInActiveMemory) {
			this.systemInActiveMemory = systemInActiveMemory;
		}
		public String getSystemBufferMemory() {
			return systemBufferMemory;
		}
		public void setSystemBufferMemory(String systemBufferMemory) {
			this.systemBufferMemory = systemBufferMemory;
		}
		public String getSystemCachedMemory() {
			return systemCachedMemory;
		}
		public void setSystemCachedMemory(String systemCachedMemory) {
			this.systemCachedMemory = systemCachedMemory;
		}
		public String getSystemSharedMemory() {
			return systemSharedMemory;
		}
		public void setSystemSharedMemory(String systemSharedMemory) {
			this.systemSharedMemory = systemSharedMemory;
		}
		public String getSystemAvailableMemory() {
			return systemAvailableMemory;
		}
		public void setSystemAvailableMemory(String systemAvailableMemory) {
			this.systemAvailableMemory = systemAvailableMemory;
		}
		public String getDiskTotalMemory() {
			return diskTotalMemory;
		}
		public void setDiskTotalMemory(String diskTotalMemory) {
			this.diskTotalMemory = diskTotalMemory;
		}
		public String getDiskUsedMemory() {
			return diskUsedMemory;
		}
		public void setDiskUsedMemory(String diskUsedMemory) {
			this.diskUsedMemory = diskUsedMemory;
		}
		public String getDiskFreeMemory() {
			return diskFreeMemory;
		}
		public void setDiskFreeMemory(String diskFreeMemory) {
			this.diskFreeMemory = diskFreeMemory;
		}
		public String getDiskReadCount() {
			return diskReadCount;
		}
		public void setDiskReadCount(String diskReadCount) {
			this.diskReadCount = diskReadCount;
		}
		public String getDiskWriteCount() {
			return diskWriteCount;
		}
		public void setDiskWriteCount(String diskWriteCount) {
			this.diskWriteCount = diskWriteCount;
		}
		public String getDiskReadBytes() {
			return diskReadBytes;
		}
		public void setDiskReadBytes(String diskReadBytes) {
			this.diskReadBytes = diskReadBytes;
		}
		public String getDiskWriteBytes() {
			return diskWriteBytes;
		}
		public void setDiskWriteBytes(String diskWriteBytes) {
			this.diskWriteBytes = diskWriteBytes;
		}
		public String getTimeSpentReadingFromDisk() {
			return timeSpentReadingFromDisk;
		}
		public void setTimeSpentReadingFromDisk(String timeSpentReadingFromDisk) {
			this.timeSpentReadingFromDisk = timeSpentReadingFromDisk;
		}
		public String getTimeSpentWritingToDisk() {
			return timeSpentWritingToDisk;
		}
		public void setTimeSpentWritingToDisk(String timeSpentWritingToDisk) {
			this.timeSpentWritingToDisk = timeSpentWritingToDisk;
		}
		public String getTimeSpentDoingActualIO() {
			return timeSpentDoingActualIO;
		}
		public void setTimeSpentDoingActualIO(String timeSpentDoingActualIO) {
			this.timeSpentDoingActualIO = timeSpentDoingActualIO;
		}
		public String getNumberOfBytesSent() {
			return numberOfBytesSent;
		}
		public void setNumberOfBytesSent(String numberOfBytesSent) {
			this.numberOfBytesSent = numberOfBytesSent;
		}
		public String getNumberOfBytesReceived() {
			return numberOfBytesReceived;
		}
		public void setNumberOfBytesReceived(String numberOfBytesReceived) {
			this.numberOfBytesReceived = numberOfBytesReceived;
		}
		public String getNumberOfPacketsSent() {
			return numberOfPacketsSent;
		}
		public void setNumberOfPacketsSent(String numberOfPacketsSent) {
			this.numberOfPacketsSent = numberOfPacketsSent;
		}
		public String getNumberOfPacketReceived() {
			return numberOfPacketReceived;
		}
		public void setNumberOfPacketReceived(String numberOfPacketReceived) {
			this.numberOfPacketReceived = numberOfPacketReceived;
		}
		public String getTotalNumberOfErrorsWhileReceiving() {
			return totalNumberOfErrorsWhileReceiving;
		}
		public void setTotalNumberOfErrorsWhileReceiving(String totalNumberOfErrorsWhileReceiving) {
			this.totalNumberOfErrorsWhileReceiving = totalNumberOfErrorsWhileReceiving;
		}
		public String getTotalNumberOfErrorWhileSending() {
			return totalNumberOfErrorWhileSending;
		}
		public void setTotalNumberOfErrorWhileSending(String totalNumberOfErrorWhileSending) {
			this.totalNumberOfErrorWhileSending = totalNumberOfErrorWhileSending;
		}
		public String getTotalNumberOfIncomingPacketsWhichWereDropped() {
			return totalNumberOfIncomingPacketsWhichWereDropped;
		}
		public void setTotalNumberOfIncomingPacketsWhichWereDropped(String totalNumberOfIncomingPacketsWhichWereDropped) {
			this.totalNumberOfIncomingPacketsWhichWereDropped = totalNumberOfIncomingPacketsWhichWereDropped;
		}
		public String getTotalNumberOfOutgoingPacketsWhichWereDropped() {
			return totalNumberOfOutgoingPacketsWhichWereDropped;
		}
		public void setTotalNumberOfOutgoingPacketsWhichWereDropped(String totalNumberOfOutgoingPacketsWhichWereDropped) {
			this.totalNumberOfOutgoingPacketsWhichWereDropped = totalNumberOfOutgoingPacketsWhichWereDropped;
		}
		public String getBootTime() {
			return bootTime;
		}
		public void setBootTime(String bootTime) {
			this.bootTime = bootTime;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getKeyboard() {
			return keyboard;
		}
		public void setKeyboard(String keyboard) {
			this.keyboard = keyboard;
		}
		public String getMouse() {
			return mouse;
		}
		public void setMouse(String mouse) {
			this.mouse = mouse;
		}
		public String getTechnology() {
			return technology;
		}
		public void setTechnology(String technology) {
			this.technology = technology;
		}
		public String getFileChanged() {
			return fileChanged;
		}
		public void setFileChanged(String fileChanged) {
			this.fileChanged = fileChanged;
		}
		@Override
		public String toString() {
			return "LMSModel [id=" + id + ", dateTime=" + dateTime + ", cpuCount=" + cpuCount + ", cpuWorkingTime="
					+ cpuWorkingTime + ", cpuIdleTime=" + cpuIdleTime + ", cpu_percent=" + cpu_percent
					+ ", usage_Cpu_Count=" + usage_Cpu_Count + ", numberOfSoftwareInterruptsSinceBoot="
					+ numberOfSoftwareInterruptsSinceBoot + ", numberOfSystemCallsSinceBoot=" + numberOfSystemCallsSinceBoot
					+ ", numberOfInterruptsSinceBoot=" + numberOfInterruptsSinceBoot + ", cpuAverageLoadOver1min="
					+ cpuAverageLoadOver1min + ", cpuAverageLoadOver5min=" + cpuAverageLoadOver5min
					+ ", cpuAverageLoadOver15min=" + cpuAverageLoadOver15min + ", systemTotalMemory=" + systemTotalMemory
					+ ", systemUSedMemory=" + systemUSedMemory + ", systemFreeMemory=" + systemFreeMemory
					+ ", systemActiveMemory=" + systemActiveMemory + ", systemInActiveMemory=" + systemInActiveMemory
					+ ", systemBufferMemory=" + systemBufferMemory + ", systemCachedMemory=" + systemCachedMemory
					+ ", systemSharedMemory=" + systemSharedMemory + ", systemAvailableMemory=" + systemAvailableMemory
					+ ", diskTotalMemory=" + diskTotalMemory + ", diskUsedMemory=" + diskUsedMemory + ", diskFreeMemory="
					+ diskFreeMemory + ", diskReadCount=" + diskReadCount + ", diskWriteCount=" + diskWriteCount
					+ ", diskReadBytes=" + diskReadBytes + ", diskWriteBytes=" + diskWriteBytes
					+ ", timeSpentReadingFromDisk=" + timeSpentReadingFromDisk + ", timeSpentWritingToDisk="
					+ timeSpentWritingToDisk + ", timeSpentDoingActualIO=" + timeSpentDoingActualIO + ", numberOfBytesSent="
					+ numberOfBytesSent + ", numberOfBytesReceived=" + numberOfBytesReceived + ", numberOfPacketsSent="
					+ numberOfPacketsSent + ", numberOfPacketReceived=" + numberOfPacketReceived
					+ ", totalNumberOfErrorsWhileReceiving=" + totalNumberOfErrorsWhileReceiving
					+ ", totalNumberOfErrorWhileSending=" + totalNumberOfErrorWhileSending
					+ ", totalNumberOfIncomingPacketsWhichWereDropped=" + totalNumberOfIncomingPacketsWhichWereDropped
					+ ", totalNumberOfOutgoingPacketsWhichWereDropped=" + totalNumberOfOutgoingPacketsWhichWereDropped
					+ ", bootTime=" + bootTime + ", userName=" + userName + ", keyboard=" + keyboard + ", mouse=" + mouse
					+ ", technology=" + technology + ", fileChanged=" + fileChanged + "]";
		}
	
}
