package BuilderPattern;

public class Browser {
	
	//you don't need to create the object again n again you just pass the referance and 
	// then attach the same refrance to the same object and then start passing the values

	String name;
	double version;
	
	public void getBrowserInfo(Browser br1) {    //br1 is referance
		//br1.name = "firefox";
		//br1.version = 109.34;
		System.out.println(br1.name);
		System.out.println(br1.version);
	}
	
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.name = "chrome";
		br.version = 102.44;
		 
		//System.out.println(br.name);   //print chrome
		//System.out.println(br.version);
		
		br.getBrowserInfo(br);           //br becomes br1
		
		//System.out.println(br.name);   //now this print the firefox bcz br indicate to br1
		//System.out.println(br.version);
		

	}

}
