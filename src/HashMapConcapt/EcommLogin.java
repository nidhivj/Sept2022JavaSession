package HashMapConcapt;

import java.util.HashMap;
import java.util.Map;

public class EcommLogin {

	//practical exAMPLE
	//role of the user like seller , partner, dist.., customer, vendor, admin, cat manager
	//assignment  product <String, doubleD> product name and price 
	public static String getUserCreds(String role) {
		
		Map<String, String> rolemap = new HashMap<String, String>();
		rolemap.put("seller", "seller@gmail.com;seller123");
		rolemap.put("partner", "partner@gmai.com;partner123");
		rolemap.put("customer", "customer@gmail.com;customer123");
		rolemap.put("admin", "admin@gmail.com;admin123");
		rolemap.put("catmanager", "catmanager@gmail.com;catmanager123");
		
		return rolemap.get(role);
	}
	
	//method
	public static String getUserName(String role) {
		String creds = getUserCreds(role); //seller@gamil.com;seller123
		return creds.split(";")[0];
	}
	
    public static String getPassword(String role) {
	
    	String creds = getUserCreds(role);  //seller@gamil.com;seller123
    	return creds.split(";")[1];
	}
	
	
	
	
	
	public static void main(String[] args) {
		
//		String creds = getUserCreds("seller");
//		System.out.println(creds);
		
		String un = getUserName("seller");
		String pwd = getPassword("seller");
		
		System.out.println(un + ":" + pwd);
		
		
		
		
		

	}

}
