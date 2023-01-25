package javasession;

public class TestMethod {

	//1. Method/function is peace of code written inside a body and thn you call that particular method n number of time
	//whenever it requires
	//2. in frist two types of method you can not create a method inside a method and also can not create inside
	//a "main" method(public static void main is a main method)
	//3. method create inside the class body no into main body
	
	//three types of method:
	//1. no input and no return: will not take any input and will not give any return  
	// in test() we havn't pass anything that means no input
	//and no return means the function is void in nature means can not return anything
	//return type: void
	
	
    public void test() {          //create a method
	 System.out.println("test method");	//it will not print bcz java runs in only main method or body... to print this we have to call
	                                    //  this method inside the main method
	 int z = 10+20+30;
	 System.out.println(z);
	
	}
	
	//2.no input and some return
	// void and return keyword cannot be written together
	// so that we erase void and put int over there bcz it has c of integar
    //return type : int
    
   public int printValue() {
		System.out.println("print value");
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Naveen";
		return name;
	}
	
	public double getToatalBill() {
		System.out.println("getting total bill");
		int foodBill = 100;
		float drinks = 30.5f;
		int dessert = 40;
		double totalAmount = foodBill + drinks + dessert ;
		return totalAmount;
	}
	
	//3.some input and some return
	public int add(int x, int y) {
		System.out.println("adding two numbers ");
		int sum = x+y;
		return sum;
	}
		
	public double bill(int foodBill, float drinks, int dessert) {
		double totalAmount = foodBill + drinks + dessert ;
		return totalAmount;
		
	}	
	
	
	public boolean isActive() {
	    System.out.println("user is active");
	    return true;
	}
	
	public void click() {
		System.out.println("clcik on element");
		//return;
	}
	
	public void sendKeys(String value) {
		System.out.println("entering the value : " + value);
		}
	public int generateBill(int totalProducts, int discount) {
		System.out.println("generate bill");
		int finalBill = totalProducts * 10;
		return finalBill;
	}
	
	public static void main(String[] args) {
		
		//call the method
		//for this have to create the object of the class
		
		TestMethod t = new TestMethod();
		t.test();  //immediatly goto the test method and print whatever is written
	    
		int p = t.printValue(); //to print c and int written bcz this function give a integar value
	    System.out.println(p);
		
		System.out.println(t.printValue());
		System.out.println(p+5);
		
		String n = t.getTrainerName(); //to print name string is written
		System.out.println(n);
		
		if(n.equals("Naveen")) {
			System.out.println("India");
		}
		
		double bill = t.getToatalBill();
		System.out.println(bill);
		System.out.println("final bill: " + (bill - 50));
		
		int s1 = t.add(10, 20);  //arguments/value--- call by value
		System.out.println(s1);
		
		s1 = t.add(40, 50);   
		System.out.println(s1);
		
		//t.isActive();
		if(t.isActive()) {
			System.out.println("credit the salary");
			
		}
		
	  double recipt = t.bill(1100, 2334.4f, 2311);
	 
	  System.out.println(recipt);
		
		

	}

}
