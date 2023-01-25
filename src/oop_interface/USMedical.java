package oop_interface;

public interface USMedical extends WHO, UNHG {

	//vars are static and final by default:
	int bill_amount = 100;
	// a method with no body ---  method declaration
	//method prototype
	//abstract method also
	
	//public void test() {}   interface give error in this it takes without body method
	public void physioservices();
	//interface says you just define a method without method body
	
	public void physioservices(int a);
	
    public int physioservices(int a, int b) ;  // these three methods are overloaded and this is the example of method overloading 
                                              //and overriding together
	
	public void cardioservices();
	
	public void neuroservices();
	
	public void emargencySerivices();  // same methode in uk and india
	


	
	
	//why java doesn't have static body without any method body or why static interface without any method body?
     // bcz we can not override static method only method hiding

	//after jdk 1.8 there is major chng now 
		//1. you can have static method with method body
		
	public static void USMedicalHistory() {
		System.out.println("US -- USMedicalHistory");
	}

	//2. default method with method body
	// we can override default method but chng in public instead default
	
	default void medicalRD() {
		System.out.println("R&D --- US");
	}
	
	//we can have more default method
	
	//try private

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
