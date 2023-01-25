package OOp_inheritance;

//BMW IS-a-relationship with car
public class BMW extends Car{  //extend keyword is use to inherit 
	
	int speed = 200;
	//Method Override:  Poly(many) + morphism (forms) --- Runtime/dynamic biding
	//when we have a method in parent class and same method in the child class
	//with the same name
	//with the same number of parameters
	//with the same sequence of parameters too
	//with the same return type
	
	@Override
	public void start() {
		System.out.println("BMW--- start");
	}
	
	public void autoParking() {
		System.out.println("BMW ---- auto parking");
	}
	
	//@Override  static method cann't be override........ we can only overload static method
	//this method is called method hiding that mean static method in parent class is same static method in child class
	public static void billing() {
		System.out.println("bmw---billing");
	} 
	
	//HAS - A - relationship --- this relation is called composition in java
	public void getBMWEngineInfo() {
		Engine eg = new Engine();   //create object of engine class
		eg.engine();
	}
	
	

}
