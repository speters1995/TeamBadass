package FinalProject;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.filechooser.FileSystemView;

/*
 * Scott Peters
 * CS-187 Final Project
 * 
 */

public class Scott {

	public static void Test() {
		System.out.println("Online: " + (testInet("ebay.com") || testInet("amazon.com") || testInet("google.com")));
	}

	public static boolean testInet(String site) {
		Socket sock = new Socket();
		InetSocketAddress addr = new InetSocketAddress(site, 80);
		try {
			sock.connect(addr, 3000);
			return true;
		} catch (IOException e) {
			return false;
		} finally {
			try {
				sock.close();
			} catch (IOException e) {
			}
		}
	}

	public static void Format() {
		System.out.println("*****************************");
	}

	public static void OSInfo() {
		String nameOS = "os.name";
		String versionOS = "os.version";
		String architectureOS = "os.arch";

		System.out.println("\n  The Information About The OS");
		System.out.println("\nName of the OS: " + System.getProperty(nameOS));
		System.out.println("Version of the OS: " + System.getProperty(versionOS));
		System.out.println("Architecture of The OS: " + System.getProperty(architectureOS));
	}

	public static void JavaInfo() {
		String javaVer = "java.vm.specification.version";
		String javaRunVer = "java.specification.version";

		System.out.println("\n The Information About Java");
		System.out.println("Java VM Version:" + System.getProperty(javaVer));
		System.out.println("Java Runtime Version:" + System.getProperty(javaRunVer));
	}

	public static void UserInfo() {
		String userName = "user.name";
		String userHome = "user.home";
		String userDir = "user.dir";

		System.out.println("\n The Information About The User");
		System.out.println("Users Name:" + System.getProperty(userName));
		System.out.println("Users Home Directory:" + System.getProperty(userHome));
		System.out.println("Users Current Working Directory:" + System.getProperty(userDir));
	}

	public static void MemInfo() {
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

/*
 * http://www.roseindia.net/java/beginners/OSInformation.shtml
 * 
 * CPU Info---
 * http://forums.devshed.com/java-help-9/cpu-specs-processor-name-speed-ram-name
 * -size-etc-635566.html
 * 
 * Internet Info---
 * http://stackoverflow.com/questions/17007450/how-to-check-internet-
 * connectivity-in-java
 * 
 * Disk --- http://www.javabeat.net/java-check-hard-disk-removable-disk/
 * 
 * http://www.codejava.net/java-se/file-io/listing-all-drives-with-type-total-
 * space-and-free-space-in-java
 */
