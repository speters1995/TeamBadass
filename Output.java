import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Output {
	public Output() {
		
		JFrame f = new JFrame("Output");
		Scanner fileStream = new Scanner("file"); 
		 String file = "C:\\Users\\hinoj\\Documents\\output.txt"; 
		 while(fileStream.hasNextLine())file += fileStream.nextLine(); 


		 //Create GUI 

		
		 JPanel pan = new JPanel(); 
		 JTextArea area = new JTextArea(); 
		 area.setText(file); 
		 pan.add(area); 
		f.add(pan); 
		f.setLayout(new FlowLayout());
		f.setSize(700,500);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}		    
	}
	

