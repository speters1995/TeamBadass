


 
 
 import java.io.File; 
 
 
 import javax.swing.filechooser.FileSystemView; 
 
 
 public class Danielle { 
 
 
	public static void danielle() { 
		Scott.Format();
 		FileSystemView fsv = FileSystemView.getFileSystemView(); 

 //Here is the input for drive size and format//
	File[] drives = File.listRoots(); 
		if (drives != null && drives.length > 0) { 
			for (File aDrive : drives) { 
				System.out.println("Drive Letter: " + aDrive); 
 				System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive)); 
 				System.out.println("\tTotal space: " + aDrive.getTotalSpace());
 				//We use the byte number 1024 to find our megabyte and gigabyte space//
 				System.out.println("\tFree space: " + aDrive.getFreeSpace()/(1024*1024*1024) + "\t\t\tGB"); 
 				System.out.println("\tFree space: " + aDrive.getFreeSpace()/(1024*1024) + "\tMB"); 
 				System.out.println("\tFree space: " + aDrive.getFreeSpace()/(1024) + "\tBytes"); 
 				
 				System.out.println(); 
 			} 
 		} 
}} 
 	 
	

