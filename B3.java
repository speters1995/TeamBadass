

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class B3 {
	
	    public static void main(String[] args) throws FileNotFoundException {
	    	//JFrame parameters
	        JFrame choice = new JFrame();
	        choice.setSize(700, 500);
	        choice.setLocationRelativeTo(null);
	        choice.setTitle("System Info");
	        choice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //Hardware button
	        JPanel panel = new JPanel();                                                        
	        panel.setLayout(new GridLayout(0, 1));
	        JButton Hardware = new JButton();
	        Hardware.setText("Hardware");
	        Hardware.addActionListener(new ActionListener() {
	                
	                public void actionPerformed(ActionEvent ev) {
	                	System.out.println("Hardware");
	                	//Call classes for Hardware
	                	Steven.GPU();
	                	Steven.Ram();
	                	Matt.matt();
	                    Danielle.danielle();
        				  new Output();
	            			
        				
	            			}

	                
	        });
	    //Create Software button
	        JButton Software = new JButton();
	        Software.setText("Software");
	        Software.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent ev) {
	            	System.out.println("Software");
	            	//Call Software classes
	            	Scott.OSInfo();
	        		Scott.UserInfo();
	        		Scott.JavaInfo();
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
	        PrintStream out = new PrintStream(new File("C:\\Users\\hinoj\\Documents\\output.txt"));
	        System.setOut(out);
	    }
	}
