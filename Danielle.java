 import java.io.File; 
 
 
 import javax.swing.filechooser.FileSystemView; 
 
 
 public class Danielle { 
 
 
	public static void danielle() { 
		Scott.Format();
 		FileSystemView fsv = FileSystemView.getFileSystemView(); 

 
	File[] drives = File.listRoots(); 
		if (drives != null && drives.length > 0) { 
			for (File aDrive : drives) { 
				System.out.println("Drive Letter: " + aDrive); 
 				System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive)); 
 				System.out.println("\tTotal space: " + aDrive.getTotalSpace()); 
 				System.out.println("\tFree space: " + aDrive.getFreeSpace()); 
 				System.out.println(); 
 			} 
 		} 
} 
 	 
	public static void DiskSpace() { 

 		File diskPartition = new File("C:"); 
		 
 
 
 		long totalCapacity = diskPartition.getTotalSpace(); 

 
 		long freePartitionSpace = diskPartition.getFreeSpace(); 
 

 		long usablePatitionSpace = diskPartition.getUsableSpace(); 
 
 
 		System.out.println("**** Sizes in Mega Bytes ****\n"); 
 
 
 		System.out.println("Total C partition size : " + totalCapacity / (1024 * 1024) + " MB"); 

 
		System.out.println("Usable Space : " + usablePatitionSpace / (1024 * 1024) + " MB"); 
 
 
 		System.out.println("Free Space : " + freePartitionSpace / (1024 * 1024) + " MB"); 

 
		System.out.println("\n**** Sizes in Giga Bytes ****\n"); 

 
		System.out.println("Total C partition size : " + totalCapacity / (1024 * 1024 * 1024) + " GB"); 
 
 
 		System.out.println("Usable Space : " + usablePatitionSpace / (1024 * 1024 * 1024) + " GB"); 
 
 
 		System.out.println("Free Space : " + freePartitionSpace / (1024 * 1024 * 1024) + " GB"); 
 	} 
 } 

