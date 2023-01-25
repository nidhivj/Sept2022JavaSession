package WebDriver_Arch;

public class AmazonTest {
	
	static WebDriver driver;   // in if-else to assign driver make it static so that we can use it directly

	public static void main(String[] args) {
	
		
		//we can not create the object of web driver and search context bcz both are interfaces
		// we can create the object of chrome, firefox, safari bcz these are classes
		
		//ChromeDriver driver = new ChromeDriver();
		//FireFox driver = new FireFox();
		//SafariDriver driver = new SafariDriver();
		
		//at a time we can use only one browser  so to solve this problem use top casting
		//real time use case of top casting
		
		String browser = "firefox ";                  //give null pointer exception 
		if(browser.trim().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();          // this is call the constructor of particular class 
		}
		else if(browser.trim().equalsIgnoreCase("firefox")) {
			driver = new FireFox();
		}
		else if(browser.trim().equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("please pass the right browser...");
		}
		
		// practice it with switch case statement

		driver.get("https://www.amazon.com");
		
		driver.findElement();
		driver.findElements();
		
		driver.sendKeys("emailId", "nidhivj27@gmail.com");
		driver.click("login button");
		driver.getText("welcome nidhi");
		driver.quit();
		
		
		
		
		

	}

}
