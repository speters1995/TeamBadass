package FinalProject;

public class Stephen {import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

	public static void GPU() {        
	    try {

	        String filePath = "./foo.txt";
	        ProcessBuilder pb = new ProcessBuilder("cmd.exe","/c","dxdiag","/t",filePath);
	        System.out.println("-- Executing dxdiag command --");
	        Process p = pb.start();
	        p.waitFor();

	        BufferedReader br = new BufferedReader(new FileReader(filePath));
	        String line;
	        System.out.println(String.format("-- Printing %1$1s info --",filePath));
	        while((line = br.readLine()) != null){
	            if(line.trim().startsWith("Card name:") || line.trim().startsWith("Current Mode:")){
	                System.out.println(line.trim());
	            }
	        }
	    } catch (IOException | InterruptedException ex) {
	        ex.printStackTrace();
	    }
	}


public static void Ram(){
	int mb = 1024 * 1024; 
	 
	// get Runtime instance
	Runtime instance = Runtime.getRuntime();

	System.out.println("***** Heap utilization statistics [MB] *****\n");

	// available memory
	System.out.println("Total Memory: " + instance.totalMemory() / mb);

	// free memory
	System.out.println("Free Memory: " + instance.freeMemory() / mb);

	// used memory
	System.out.println("Used Memory: "
			+ (instance.totalMemory() - instance.freeMemory()) / mb);

	// Maximum available memory
	System.out.println("Max Memory: " + instance.maxMemory() / mb);
}
}


Status API Training Shop Blog About
© 2016 GitHub, Inc. Terms Privacy Security Contact Help

}
