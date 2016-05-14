
// Alex
import java.io.IOException;  
import java.net.InetSocketAddress;  
import java.net.Socket;  
  
    public class Alex {  
      
	public static void alex() { 
		Scott.Format();
		//This will send a ping to these listed websites, if one won't to one it will pipe to another//
		System.out.println("Online: " + (testInet("ebay.com") || testInet("amazon.com") || testInet("google.com") || testInet("bing.com")));  
	}  

	public static boolean testInet(String site) {
		Scott.Format();
		//this boolean tests if the blueprints are true or false//
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
    }
//http://stackoverflow.com/questions/17007450/how-to-check-internet-connectivity-in-java
