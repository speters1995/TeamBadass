package javaFinal;
import java.io.BufferedReader; 
import java.io.FileReader; 
import java.io.IOException; 
public class Steven {


	 
	 
	 
	 
	
	 	
	 public static void Ram(){ 
	 	int mb = 1024 * 1024; 
	 	int gb = 1024 * 1024 * 1024; 
	 		  
	 		// Runtime instancing command 
			Runtime instance = Runtime.getRuntime(); 
			System.out.println("------------------"); 
	 	System.out.println("Application Memory"); 
	 	System.out.println("------------------"); 
	 	System.out.println(); 
	 
	 
	 		// Total available memory 
	 		System.out.println("Total Memory: " + instance.totalMemory() / mb + " MB"); 
	
	 
			// Free Memory 
			System.out.println("Free Memory: " + instance.freeMemory() / mb + " MB"); 
	 
	 
	 		// In use memory 
 		System.out.println("Used Memory: " 
	 				+ (instance.totalMemory() - instance.freeMemory()) / mb + " MB"); 
	 
	 
	 		// Maximum Memory Usage 
	 		System.out.println("Max Memory: " + instance.maxMemory() / gb + " GB"); 
	 		System.out.println(); 
	 	} 
	 	 
	 		public static void GPU(){ 
	 			try { 
	 
	 
	 		        String filePath = "./foo.txt"; 
	 		        // Used "dxdiag /t" to redirect output to a file 
	 		        ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","dxdiag","/t",filePath); 
	 		        System.out.println("-- Executing dxdiag command --"); 
			        Process p = pb.start(); 
	 		        p.waitFor(); 
	 		        //Reads from buffer input stream for more efficient output 
	 		        BufferedReader br = new BufferedReader(new FileReader(filePath)); 
	 		        String line; 
	 		        System.out.println(String.format("-- Printing %1$1s info --",filePath)); 
	 		        System.out.println(); 
	 		        while((line = br.readLine()) != null){ 
	 		        	 
	 		            if(line.trim().startsWith("Card name:") || line.trim().startsWith("Current Mode:")){ 
 		                System.out.println(line.trim()); 
	 		            } 
			        } 
	 		    } catch (IOException | InterruptedException ex) { 
	 		        ex.printStackTrace(); 
	 		    } 
	 
	 
	 		} 
	 	} 

