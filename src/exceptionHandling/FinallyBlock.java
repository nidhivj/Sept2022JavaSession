package exceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("A");
		
		try {
			int i = 9/0;
		}
		catch(ArithmeticException e) {                //once commented out catch block and then uncomment it
			System.out.println("AE is coming...");
			e.printStackTrace();
		}
		
		finally {
			System.out.println("logout");
		}
		
		int p = 100;
		int r = 200;
		System.out.println(p+r);   //it will not print if we don't write catch block
		                           //bcz exception handle by catch block.... finally block is only print whatever written in it
		                           //outside the finally block whatever is written.. it will only print when we write catch block

	}

}
