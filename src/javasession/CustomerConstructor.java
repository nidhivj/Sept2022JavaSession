package javasession;

public class CustomerConstructor {

	String name;
	int id;
	String city;
	boolean isActive;
	
	//constructor: its name should be on class name and we can create multiple const and we can overload them
	//             constructor call when we create the object.. we can't call it by object reference
	//       it depends on which parameters we passing that constructor should be called
	// main purpose to call the constructor to initialize the class variables
	//1. 0 param const... or default const...
	public CustomerConstructor() {
		System.out.println("0 param");
	}
	
	//2. 1 param const...
	public CustomerConstructor(int i) {
		System.out.println("1 param " +i);
	}
	
	
	//3. 2 Param const.....
	public CustomerConstructor(int i , int j) {
		System.out.println("2 param " +i+j);
	}
	
	public CustomerConstructor(int i , String p) {
		System.out.println("2 param " +i+p);
	}
	
	public CustomerConstructor(String p , int i) {
		System.out.println("2 param " +i+p);
	}
	// in this concept constructor name is same but having different parameters this is calles constructor overloading
	
	
	
	
	public static void main(String[] args) {
		
		CustomerConstructor c1 = new CustomerConstructor(); //constructor call when we create the object.. we can't call it by object reference 
		CustomerConstructor c2 = new CustomerConstructor(10);           //function/method call by obj reference
		CustomerConstructor c3 = new CustomerConstructor(10,20);
		CustomerConstructor c4 = new CustomerConstructor (10, "testing");
		CustomerConstructor c5 = new CustomerConstructor("testing" ,10);
		
		
		
		
		
		

	}

}
