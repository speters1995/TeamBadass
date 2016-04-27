package FinalProject;

public class Scott {
	/*
	 * Scott Peters
	 * CS-187 Final Project
	 * 
	 */
	
	public static void Format() {
		System.out.println("*****************************");
	}

	public static void OSInfo() {
		String nameOS = "os.name";
		String versionOS = "os.version";
		String architectureOS = "os.arch";

		System.out.println("\n  The Information About The OS");
		System.out.println("\nName of the OS: " + System.getProperty(nameOS));
		System.out.println("Version of the OS: " + System.getProperty(versionOS));
		System.out.println("Architecture of The OS: " + System.getProperty(architectureOS));
	}

	public static void JavaInfo() {
		String javaVer = "java.vm.specification.version";
		String javaRunVer = "java.specification.version";

		System.out.println("\n The Information About Java");
		System.out.println("Java VM Version:" + System.getProperty(javaVer));
		System.out.println("Java Runtime Version:" + System.getProperty(javaRunVer));
	}

	public static void UserInfo() {
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
 */
