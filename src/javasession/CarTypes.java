package javasession;

public class CarTypes {
 
	//Static keyword concept
	String name;
	int price;
	String color;
	//int wheels;
	// static int wheels = 4;
	static final int wheels = 4;
	//when we have comman thing in every condition we have to convert in static and it is calles static in nature
	
	
	public static void main(String[] args) {
	
		//how to access static vars:
		//1. use it by the class name:
		System.out.println(CarTypes.wheels);
		
		//2.access it directly:
		System.out.println(wheels);
		
		//static int p = 10; //local variables illegal modifier static can not be use in local variables final we can use 
		
	 CarTypes c1 = new CarTypes();
	 c1.name = "BMW";
	 c1.price = 50;
	 c1.color = "Black";
	 //c1.wheels = 4;
	 
	 //CarType.wheels = 10;   we can chang anytime static value to overcome this we can fix the value by using final keyword 
	 //System.out.println(c1.name + " " + c1.price + " " + c1.color + " " + CarTypes.wheels);
	//final int days = 7;   when we define final it fix the value 
	 //System.out.println(days*10);
	 
	 CarTypes c2 = new CarTypes();
	 c2.name = "Audi";
	 c2.price = 60;
	 c2.color = "Blue";
	 //c2.wheels = 4;
	 
	 CarTypes c3 = new CarTypes();
	 c3.name = "Honda";
	 c3.price = 20;
	 c3.color = "White";
	 //c3.wheels = 4;
		
	    System.out.println(c1.name + " " + c1.price + " " + c1.color );
	    System.out.println(c2.name + " " + c2.price + " " + c2.color );
	    System.out.println(c3.name + " " + c3.price + " " + c3.color );
		

	}

}
