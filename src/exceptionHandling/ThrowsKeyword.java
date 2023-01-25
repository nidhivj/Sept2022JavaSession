package exceptionHandling;

public class ThrowsKeyword {   //throws keyword is just passing the exception from one to another... exception handle by try-catch block
	
	
	//create a method over 
	//public void m1() throws ArithmeticException {       // 3.it also throws the exception to main method bcz it is called by main method.... read on main method
	
	public void m1() {	
	System.out.println("m1 method");
		m2();     //calling m2 method
	}
	
	//public void m2() throws ArithmeticException {      //2.after calling m3 exception coming it also will not handle and throws to m1 bcz m1 is calling m2.... read above
	
	public void m2() { 	                             //now m2 handle the exception
		System.out.println("m2 method");
		try {
		    m3();
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public void m3() throws ArithmeticException{        //1.error is coming from hear so it throws the exception but this method called by m2 so m2 has to handle....but..read above
		System.out.println("m3 method");
		int i = 9/0;
	}
	
	

	public static void main(String[] args) throws ArithmeticException{        //4.it also throws the exception.... now we use the try catch block to handle the exception
		                                             
		 ThrowsKeyword obj = new  ThrowsKeyword();                                    
		//try {                                                                //5.handling in main method is not good way so we have to remove it here and put in m2 
		     obj.m1();
		//}
		//catch(ArithmeticException e) {
			//System.out.println("AE is coming..");
			//e.printStackTrace();    //to know the exception details
		//}
		 System.out.println("Bye!!");

		 
	}

}
