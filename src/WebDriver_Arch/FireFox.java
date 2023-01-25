package WebDriver_Arch;

public class FireFox implements WebDriver{

	public FireFox() {
		System.out.println("Launch firefox browser....");
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
