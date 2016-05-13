package javaFinal;


import java.io.IOException;


public class Output{
	public static void main(String[] args){
		
	}
	public Output() {
		
		
		//Opens notepad with out put of the buttons.
		ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "C:\\Users\\hinoj\\Documents\\output.txt");
		try {
			pb.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
	
	

