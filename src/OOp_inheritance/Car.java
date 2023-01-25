package OOp_inheritance;

public class Car extends Vehicle {              //final keyword is use here thn no one cann't inherit this class 
	
	int speed = 100;
	
	//final:
	//1. to prevent method override
	//2. to prevent inheritance
	//3. to provide the constant values
	 
	//private class/method can not be overridden
	//static method also cannot be overridden but can method hiding
	//now vehicle is the super class/grand class for bmw and parent class for car
	//no need of main class bcz we are not going to print anything
	//lets take method over hear
	public void start() {                 //we can use final keyword over here if we want that no one cann't override this method
		System.out.println("car---start");
		}
	
	public void stop() {
		System.out.println("car----stop");
	}
	
	public void refuel() {
		System.out.println("car----refuel");
	}
	
	//static method
	
	public static void billing() {
		System.out.println("car---billing");
	} 
	
	
	
	
	

}
