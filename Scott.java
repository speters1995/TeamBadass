

/*
 * Scott Peters
 * CS-187 Final Project
 * OS, User, Java Information.
 */

public class Scott {

	 
// Created a simple format to seperate information.
	public static void Format() {
		System.out.println("*****************************");
	}
// Created getters to get Information on the OS by using the System,getProperty
	public static void OSInfo() {
		Scott.Format();
		String nameOS = "os.name";
		String versionOS = "os.version";
		String architectureOS = "os.arch";

		System.out.println("\n  The Information About The OS");
		System.out.println("\nName of the OS: " + System.getProperty(nameOS));
		System.out.println("Version of the OS: " + System.getProperty(versionOS));
		System.out.println("Architecture of The OS: " + System.getProperty(architectureOS));
	}
// Used getProperty to display what java version is installed for both VM, and actual java.
	public static void JavaInfo() {
		Scott.Format();
		String javaVer = "java.vm.specification.version";
		String javaRunVer = "java.specification.version";

		System.out.println("\n The Information About Java");
		System.out.println("Java VM Version:" + System.getProperty(javaVer));
		System.out.println("Java Runtime Version:" + System.getProperty(javaRunVer));
	}
// Lastly by using the getProperty i then get the User information.
	public static void UserInfo() {
		Scott.Format();
		String userName = "user.name";
		String userHome = "user.home";
		String userDir = "user.dir";

		System.out.println("\n The Information About The User");
		System.out.println("Users Name:" + System.getProperty(userName));
		System.out.println("Users Home Directory:" + System.getProperty(userHome));
		System.out.println("Users Current Working Directory:" + System.getProperty(userDir));
	}
	}
	
	



/*
 * http://www.roseindia.net/java/beginners/OSInformation.shtml
 * 
 * http://www.codejava.net/java-se/file-io/listing-all-drives-with-type-total-space-and-free-space-in-java
 */

