package SuperKeyword;

public class Car extends Vehicle {
	
	int maxspeed = 100;
	
	int price = 500;
	
	public Car() {
		System.out.println("Car-- default constructor...");
	}
	
	public Car(int i) {
		System.out.println("Car-- default constructor..." +i);
	}
	
	public Car(int i, int j) {
		System.out.println("Car-- default constructor..." +i+j);
	}
	
	public void racing() {
		System.out.println("car--- racing");
		test();     //the public method call private method within the same class is called encapsulation
	}
	
	public static void refuel() {
		System.out.println("car-- refuel");
	}

	private void test() {
		System.out.println("private car--- test");
	}
}
