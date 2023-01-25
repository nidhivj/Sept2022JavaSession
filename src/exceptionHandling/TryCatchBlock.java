package exceptionHandling;

public class TryCatchBlock {
	
	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		obj = null;
		
		
		                                //if we put int i = 9/3; the code is write so it will not come into catch block.. it goes direct on "bye" and print "hello" also
		try {
		    obj.name = "tom";
			int i = 9/0;                //unwanted code has written then the program will be terminated it will not reach at to the next line // so to overcome this use try catch
		    System.out.println("hello");    //it will not print 
		                                   //whatever you want to print write after catch block
		}                                              
		 // error with using ref variables
		 //exception have so many types like arithmetic exception , null pointer...... so if you don't know what is the exception you can simple put only Exception too
		
		//catch(Exception e) {}
		
		//the parent of the exception class or exception is extending is "Throwable" we can put also it
		
		//catch(Throwable e){}
		
		catch(ArithmeticException e) {                  //in catch block we have to write the error what is coming when we put only int i... that is arithmetic exception
			System.out.println("AE is coming...");
			e.printStackTrace();                        // it gives you all information about the exception coming from where , which, and why....
		} 
		
		catch(Error e) {                               //error is different from exception
			System.out.println("Error is coming...");
			e.printStackTrace();                       
		}   
		
		//this exception is coming from obj = null
		catch(NullPointerException e) {                               //we can put only exception for any exception coming but for good practice or readable 
			System.out.println("NP is coming...");                    //put multiple catch block with different exception
			e.printStackTrace();                       
		}   
		
		
        // so we can put so mant catch with one try block
		//at a time only one exception will be thrown bcz when it goes obj = "tom", it comes on the np exception and coming out from try block.. so it will print only one exception that returns first in the try block 
		
		System.out.println("bye");
		System.out.println("landing on home page...");
		
		int a[] = new int[2];  //0 ,1
		//a[4] = 10;    arrayIndaxOutOfBoundException
		try {
			a[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming...");
		}

		System.out.println("logout");
	}

}
