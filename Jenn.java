package javaFinal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;


public class Jenn {
	
	public static void jenn() {
		Scott.Format();
		URL url = null;
	        BufferedReader in = null;
	        String ipAddress = "";
	        try {
	            url = new URL("http://bot.whatismyipaddress.com");
	            in = new BufferedReader(new InputStreamReader(url.openStream()));
	            ipAddress = in.readLine().trim();
	            if (!(ipAddress.length() > 0)) {
	                try {
	                    InetAddress ip = InetAddress.getLocalHost();
	                    System.out.println((ip.getHostAddress()).trim());
	                    ipAddress = (ip.getHostAddress()).trim();
	                } catch(Exception exp) {
	                    ipAddress = "ERROR";
	                }
	            }
	        } catch (Exception ex) {
	            // This try will give the Private IP of the Host.
	            try {
	                InetAddress ip = InetAddress.getLocalHost();
	                System.out.println((ip.getHostAddress()).trim());
	                ipAddress = (ip.getHostAddress()).trim();
	            } catch(Exception exp) {
	                ipAddress = "ERROR";
	            }
	            //ex.printStackTrace();
	        }
	        System.out.println("IP Address: " + ipAddress);
	    }

public static void InternalIp(){

	Scott.Format();
	try {
	  InetAddress addr = InetAddress.getLocalHost();            
	  System.out.println("Internal Address: " + addr.getHostAddress());
	} catch (UnknownHostException e) {
	
}	
}
}

