package HashMapConcapt;

import java.util.HashMap;
import java.util.Map;

public class Assignment {

	
	
	
	
	public static void main(String[] args) {
		
		//Map<String, double> rolemap = new HashMap<String, double>();
		Map<String, Double> productmap = new HashMap<String, Double>();
		productmap.put("laptop", 12.33);
		productmap.put("mobile", 10.33);
		productmap.put("tablet", 8.33);
		productmap.put("mac", 6.33);
		
		
		System.out.println(productmap.get("laptop"));
		System.out.println(productmap);
		
		

	}

}



//  selenium is not test automation tool selenium is automation tool we can not write test cases can not perform any testing
// what is visible on page selenium tells this is visible on page.. click on button, dropdown, maximize, minimize.... will selenium do...but it can't verify anything
// for that we use third part things like testng and some other testing tool.. for testing
//selenium can not read any excel file or emails or etc... for that we use java
//

//support operating system : windows, mac, linux
//support browser/platform : firefox, safari, opera, chrome, edge

// source code available :  Github repository    //selenium downloads--> github---> java--->src--->org/openqa/selenium--->webdriver.java/remote
// find element/find elements is in search context


















