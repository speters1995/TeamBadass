package javaFinal;



public class Matt {
	
	public static String matt() {
		Scott.Format();
	System.out.println("CPU Name/Model:" + (System.getenv("PROCESSOR_IDENTIFIER")));
	System.out.println("CPU Architecture:" + (System.getenv("PROCESSOR_ARCHITECTURE")));
	System.out.println("CPU Bit:" + (System.getenv("PROCESSOR_ARCHITEW6432")));
	System.out.println("Processors:" + (System.getenv("NUMBER_OF_PROCESSORS")));
	return null;
	
}
}

//http://forums.devshed.com/java-help-9/cpu-specs-processor-name-speed-ram-name-size-etc-635566.html