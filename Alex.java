package FinalProject;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Alex {

	public static void Test() {
		System.out.println("Online: " + (testInet("ebay.com") || testInet("amazon.com") || testInet("google.com")));
	}

	public static boolean testInet(String site) {
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
