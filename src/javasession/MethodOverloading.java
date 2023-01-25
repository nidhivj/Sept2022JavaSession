package javasession;

public class MethodOverloading {
	
	//Method overloading: Poly(many)+Morphism(forms) : compile time polymorphism/static polymorphism
	// within the same class when we have multiple methods:
	//1. with the same method name
	//2. with the different parameters
	//3. with the different sequence of the parameter
	//4. return type doesn't matter

	public void test() {
		System.out.println("0 param");
	}
	
//	public int test() {                    //it doesn't matter if your return type same or what but	
//		System.out.println("0 param");    //method type have to be different
//		return 100;
//	}
	
	public void test(int i) {
		System.out.println("1 param");
	}
	
	public void test(String i, int j) {
		System.out.println("2 param");
	}
	
	public void test(String i) {
		System.out.println("1 param");
	}
	
	//prctical time example for interview
	
	//ecomm: amazon:
	
	
	public void logIn() {
		System.out.println("log in with no creds");
	}
	
	public void logIn(String username, String password)  {
		System.out.println("log in with right creds");
	}
	
	public void lohIn(String username, String password, String role) {
		System.out.println("login with right creds");
	}
	
	public void logIn(String username, String paassword, int otp) {
		System.out.println("login with right creds");
	}
	
	//sesrch
	
	public void search() {
	
	}
	
	public void search(String productName, int price) {
		
	}
	
	public void search(String productName) {
	
	}
    
	public void search(String productName, int price, String color) {
		
	}
	
	
	//payment


	public void doPayment(String upi) {
		
	}
	
    public void doPayment(String cc, int cvv) {
		
	}
	
    public void doPayment(String cc, int cvv, int otp) {
		
	}
    
    public void doPayment(String bankName, String password, String userId) {
		
	}
	
    //uber: overloading in static
    
    public void booking() {
    	
    }
    
    public void booking(String carType, String stPoint, String endPoint) {
    	
    }
    
    public void booking(String carType, String stPoint, String endPoint, int passenger)  {
    	
    }
    
    //url:
    public void launchUrl(String url) {
    	 
    }
    
    public String launchUrl(String url, String queryParam, String browserName) {
    	String mainUrl = url + queryParam;
    	System.out.println("launch" + browserName);
    	return mainUrl;
    }
    
   //can we load static methods: Yes
    public static void getInfo(String name) {
    	
    }
    
    public static void getInfo(String name, String id ) {
    	
    }
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		mo.test();
	    mo.test("nidhi", 23);
	    mo.test(343);
	    
	    mo.booking(null, null, null);
	    mo.search(null, 0);
		mo.doPayment(null, null, null);
		mo.logIn(null, null, 0);
		
		MethodOverloading.getInfo("nidhi");

	}

}
