package javaFinal;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class B3 {
	
	    public static void main(String[] args) throws FileNotFoundException {
	        JFrame choice = new JFrame();
	        choice.setSize(700, 500);
	        choice.setLocationRelativeTo(null);
	        choice.setTitle("System Info");
	        choice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        JPanel panel = new JPanel();                                                        
	        panel.setLayout(new GridLayout(0, 1));
	        JButton Hardware = new JButton();
	        Hardware.setText("Hardware");
	        Hardware.addActionListener(new ActionListener() {
	                
	                public void actionPerformed(ActionEvent ev) {
	                    Matt.matt();
	                    CpuInfo3.matt2();
	                   
	                    Danielle.danielle();
        				  new Output();
	            			
        				
	            			}

	                
	        });
	    
	        JButton Software = new JButton();
	        Software.setText("Software");
	        Software.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent ev) {
	            	Scott.OSInfo();
	        		Scott.Format();
	        		Scott.UserInfo();
	        		Scott.Format();
	        		Scott.JavaInfo();
	        		Scott.Format();
	            	Alex.alex();
	            	Jenn.jenn();
	            	Jenn.InternalIp();
    				new Output();
	            }
	        });

	        choice.getContentPane().add(panel);
	        ButtonGroup group = new ButtonGroup();                                              
	        group.add(Software);
	        group.add(Hardware);
	        panel.add(Software);
	        panel.add(Hardware);
	        choice.setVisible(true);
	        PrintStream out = new PrintStream(new FileOutputStream("C:\\Users\\hinoj\\Documents\\output.txt"));
	        System.setOut(out);
	    }
	



public static void Output() {
	
	
	JFrame f = new JFrame("Output");
	JTextArea jta = new JTextArea();
	f.getContentPane().add(jta);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setSize(700,500);
	f.setLocationRelativeTo(null);
	f.setVisible(true);

}
}