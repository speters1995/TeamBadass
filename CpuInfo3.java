	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	 
	public class CpuInfo3 {
	 
	 public static void matt2() {
	 Scott.Format();
	  try {
	 
	   String[][] commands = new String[][]{
	     {"CMD", "/C", "WMIC OS GET Installdate,SerialNumber"}, //OS Installation date & Time, OS Serial Number
	     {"CMD", "/C", "WMIC BASEBOARD GET SerialNumber"}, // Motherboadrd Serial Number
	     {"CMD", "/C", "WMIC CPU GET ProcessorId"}, // Processor ID
	     {"CMD", "/C", "WMIC COMPUTERSYSTEM GET Name"}}; // Computer Name
	 
	   for (int i = 0; i < commands.length; i++) {
	 
	    String[] com = commands[i];
	 
	    Process process = Runtime.getRuntime().exec(com);
	 
	    process.getOutputStream().close(); //Closing output stream of the process
	 
	    System.out.println();
	    String s = null;
	    //Reading sucessful output of the command
	    BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	    while ((s = reader.readLine()) != null) {
	     System.out.print(s);
	    }
	 
	    // Reading error if any
	    reader = new BufferedReader(new InputStreamReader(process.getErrorStream()));
	    while ((s = reader.readLine()) != null) {
	     System.out.print(s);
	    }
	 
	   }
	 
	  } catch (IOException e) {
	   e.printStackTrace(); //TODO: necessary exception handling
	  }
	 }

	
	}
//http://tech-annex.blogspot.com/2011/04/computer-software-and-hardware.html

