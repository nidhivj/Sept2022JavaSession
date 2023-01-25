package SuperKeyword;

//super keyword is use to parent class method/variables if both are same in child as well as parent class 
//can call parent class constructor... from child class cons..... but it should be the first statement
//static vars or methods can be called by super keyword

public class BMW extends Car {
	
	int maxspeed = 200;
	
	public BMW() {           
		//super();                    //we can write only one super and only in first statement
		//super(10);                   //by this to call car class constructor but when having more than one constructor in car class like soome having parameters
		super(10,20);                                                          // when with the help of super we can call them
		System.out.println("BMW--- default constructor...");  
	}
	
	
	@Override
	public void racing() {
		System.out.println("BMW--- racing");
	}
	
	//copy from parent class but cann't override bcz of static so call method hiding 
	public static void refuel() {
		System.out.println("BMW-- refuel");
	}
	
	
	private void test() {
		System.out.println("private BMW--- test");
	}
	
	public void info() {
		
		int carspeed = super.maxspeed;
		System.out.println(carspeed);   //100    super use to call the parent class method
		System.out.println(maxspeed);  //200
		
		racing();
		super.racing();     //super keyword use to call the parent (car) class racing method
	    
		System.out.println(price);   //price is the parent class method and in child class there is no price method so we can call it directly no need to mention super keyword
	
		refuel();
		super.refuel();
		Car.refuel();
		
		test();
		//super.test();
		
		
	}
	
	
	public static void main(String ar[]) {
		
		BMW b = new BMW();
		b.info();
		
	} 

}
