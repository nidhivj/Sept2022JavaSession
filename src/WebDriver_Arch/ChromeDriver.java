package WebDriver_Arch;


// after create new class implements web driver class and then it implement all methods automatically otherwise give error on chrome driver
public class ChromeDriver implements WebDriver{
	
	//we can create a constructor of chrome driver class
	public ChromeDriver() {
		System.out.println("Launch chrome browser....");
	}

	@Override
	public void findElement() {
		System.out.println("find element"); 
		
	}

	@Override
	public void findElements() {
		System.out.println("find elements"); 
		
	}

	@Override
	public void get(String url) {
		System.out.println(" get url :" + url); 
		
	}

	@Override
	public void click(String element) {
		System.out.println(" click on element :" + element); 
		
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println(" enter value in element :" + element + " "+ value); 
		
	}

	@Override
	public String getText(String ele) {
		System.out.println(" getting text of :" + ele); 
         String str = "Amazon Header";
		return str;
	}

	@Override
	public boolean isDiplayed(String ele) {
		System.out.println(" element displayed :" + ele); 
		return true;
	}

	@Override
	public void quit() {
		System.out.println("close browser"); 
		
	}

}
