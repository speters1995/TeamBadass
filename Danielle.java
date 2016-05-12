/**
 * 
 */
package danielleFinal;

import java.io.File;
import java.io.*;
import javax.swing.filechooser.FileSystemView;
import java.io.IOException;



/**
 * @author daniellekelsey
 *
 */
@SuppressWarnings("unused")
public class Danielle {

	
	String userName = System.getProperty("user.name");
	
	 
	
	public static void main(String[] args) {

		FileSystemView fsv = FileSystemView.getFileSystemView();

		File[] drives = File.listRoots();
		if (drives != null && drives.length > 0) {
			for (File aDrive : drives) {
				System.out.println("Drive Letter: " + aDrive);
				System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
				System.out.println("\tTotal space: " + aDrive.getTotalSpace());
				System.out.println("\tFree space: " + aDrive.getFreeSpace()/(1024*1024*1024) + "\tGB");
				System.out.println("\tFree space:" + aDrive.getFreeSpace()/(1024*1024) + "\tMB");
				System.out.println("\tFree space;" + aDrive.getFreeSpace()/(1024) + "\tBytes");
			        }
			    }
			}
	
		
	}
