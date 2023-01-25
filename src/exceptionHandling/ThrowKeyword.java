package exceptionHandling;

public class ThrowKeyword {

	
	public static void main(String[] args) {
	
		String data = null; //data is coming some reading from excel/prop
		
  if(data == null) {		
	try {	
	  throw new Exception("DATANOTFOUNDEXCEPTION");   //hear we generate our own exception 	
	}	
	catch(Exception e) {
		System.out.println("data exception is coming...");
		e.printStackTrace();
	}	
  }
	System.out.println("logout....");
		

	}

}
