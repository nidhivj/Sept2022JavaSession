package OOP_Encapsulation;

public class Browser {
	
	//some private data methods also part of encapsulation we can also call them like this
	
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkBrowserVersion();
		checkBrowserOSCompatibility();
		checkRAMSpace();
		checkOSBrowserServices();
		System.out.println("browser is launched...");
		
	}
	
	private void checkBrowserVersion() {
		System.out.println("checking browser version");
	}
	
	private void checkBrowserOSCompatibility() {
		System.out.println("checking browser os compatibility");
	}
	
	private void checkRAMSpace() {
		System.out.println("checking RAM Space");
	}
	
	private void checkOSBrowserServices() {
		System.out.println("checking os browser services");
	}

}
