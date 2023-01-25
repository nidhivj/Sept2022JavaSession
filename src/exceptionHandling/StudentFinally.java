package exceptionHandling;

public class StudentFinally {

	
	public static int getMarks(String name) {
		System.out.println("marks for : " +name);
		
		if(name.equals("aman")) {
			try {
				int i = 9/0;
				return 55;
			}
			catch(ArithmeticException e) {
				return 65;                       //when there is no return in finally block then this catch block return will print
			}
			
			finally {                                     // finally block will always be excuted
				System.out.println("print mark sheet");   // only 75 return not 65, 55... finally block override all return
				return 75;
			}                                             //we can only write one finally block
			//return 90;
		}
		
		else if(name.equals("ravi")) {
			return 95;
		}
		
		else if(name.equals("swathi")) {
			return 85;
		}
		
		else {
			System.out.println("student is not found..");
			return -1;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		int m1 = getMarks("aman");  //this is static method no need to create the object can call directly
		System.out.println(m1);
		
		
		//finally ex:
		
		//connection with database
		//steps:
		    //make the connection with DB: SQL, oracle
		    //pass username/password/ip:8080
		 //try{
		//   hit the SQL query --- SQLException is coming
		//}
		//catch(SQLException e){
		//}
		//finally{
		//      close the DB connection
		//}
		
		//results from the DB
		//print the results on the UI
		
		
		
		
		
		
		

	}

}
