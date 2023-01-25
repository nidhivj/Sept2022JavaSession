package WebDriver_Arch;

public interface WebDriver extends Searchcontext {
	
	//here i have to implement search context method not automatically
	
	@Override
    public void findElement();
	
	@Override
	public void findElements();
	
	public void get(String url);
	
	public void click(String element);
	
	public void sendKeys(String element, String value);
	
	public String getText(String ele);
	
	public boolean isDiplayed(String ele);
	
	public void quit();
	

}
