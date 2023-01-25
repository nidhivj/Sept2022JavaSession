package oop_interface;

//class to class you have to use extends keyword
//interface to interface you have to use extends keyword
// class to interface use implements keyword
   
//interface uses implements to define
// IS - a relationship
public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {     // after writing this it gives error and said to add unimplemented method of
//fortis hospital extending medical and fortis hospital implements us, uk, indian medical	                                                   // us medical so these are override

	int bill_amount = 10;
	//US
	@Override
	public void physioservices() {
		System.out.println("FH--- physioServices");
		
	}

	@Override
	public void physioservices(int a) {
		System.out.println(" physio services with parameters");
		
	}
	
	@Override
	public int physioservices(int a, int b) {
		System.out.println(" two parameters ");
		return 0;
	}
	
	@Override
	public void cardioservices() {
		System.out.println("FH--- cardioServices");
		
	}

	@Override
	public void neuroservices() {
		System.out.println("FH--- neuroServices");
		
	}

	//UK
	@Override
	public void ENTSerivces() {
		System.out.println("FH--- ENTServices");
		
	}

	@Override
	public void PediaServices() {
		System.out.println("FH--- pediaServices");
		
	}

	//indian
	@Override
	public void dentalSerivces() {
		System.out.println("FH--- dentalServices");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("FH--- orthoServices");
		
	}

	@Override
	public void emargencySerivices() {
		// TODO Auto-generated method stub
		
	}
	
	
	//individual method of fortis
	
	public void medicalTraining() {
		System.out.println("FH--- medical training");
	}

	
	//WHO
	@Override
	public void covidVaccicnation() {
		System.out.println("FH----- covidVaccicnation");
		
	}

	@Override
	public void releaseFunds() {
	     System.out.println("F------ release funds");
		
	}

	//method hiding
	public static void USMedicalHistory() {
		System.out.println("US -- USMedicalHistory");
	}

	
//	default void medicalRD() {              //giving error
//		System.out.println("R&D --- US");
//	}
	
	//put with public
	
	@Override
	public void medicalRD() {
		System.out.println("R&D --- US");
	}

	

	
	
	
	
	
}
