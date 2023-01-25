package BuilderPattern;

public class EcommApplication {
	
	
	public EcommApplication login(String un, String pwd) {
		System.out.println("login with :" +un+":"+pwd);
		return this;
		//return new EcommApplication();                    //either you write return this or EcommApplication both are correct  but return this is best to use
	}                                                        //after writing return this in public void should be replace by EcommApplication in every method
	
	public EcommApplication search(String productName) {
		System.out.println("search product :" +productName);
		return this;
	}
	
	public EcommApplication search(String productName, String color) {
		System.out.println("search product :" +productName + ":" +color);
		return this;
	}
	
	public EcommApplication addToCart(String productName) {
		System.out.println("add to cart :" +productName);
		return this;
	}
	
	public EcommApplication payment(String upi) {
		System.out.println("making payment via upi :" +upi);
		return this;
	}
	
	public EcommApplication payment(String cc, int cvv) {
		System.out.println("making payment via CC :" +cc +":" + cvv);
		return this;
	}
	
	public EcommApplication getOrderId() {
		System.out.println("get order id :" +1234);
		return this;
	}
	
	public EcommApplication logOut() {
		System.out.println("log out");
		return this;
	}
	
	//this keyword uses
	//1. use to method return
	//2. use inencapsulation with help of getter and setter
	//3. use in constructor to assign the class variables with my local variables
	//4. always pointing to the current class object
	
	//super keyword uses
	//1. use in child class constructor it should be the first statement
	//2. use in methods to call parent class variables in child class
	//3. always pointing to the parent class constructor/ object/variables/methods
	
	
	
	
	
	
	
	

}
