package javasession;

public class BrowserMethod {

	//AC:
	//WAF:
	//name: launchBrowser
	//input param: browsername(string)--> chrome, firefox, ie, safari
    //return: boolean
	
	public boolean launchBrowser(String browserName) {
		System.out.println("trying to launch browser: " +browserName);
		boolean flag = false;
				
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("chrome is launch");
			flag = true;
			break;
		case "firefox":
			System.out.println("firefox is launch");
			flag = true;
			break;
			
		case "ie":
			System.out.println("ie is launch");
			flag = true;
			break;  
		case "safari":
			System.out.println("safari is launch");
			flag = true;
			break;

		default:
			System.out.println("please pass the right browser..."+browserName);
			break;
		}
		
		return flag;
	}
	public static void main(String[] args) {
		BrowserMethod br = new BrowserMethod();
		boolean f1 = br.launchBrowser("chrome");
		System.out.println(f1);
		
// homework every case have return 
		
	}

}
