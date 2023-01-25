package javasession;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		
		System.out.println(10==20); //false bcz == is represent the boolean
		int i = 10;
		int j = 20;
		
		if(i==j) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		  
		boolean nidhi = true; //right now it print Hello but if we
		if(nidhi) {                   //put false over true then it will print Bye  
			System.out.println("Hello");
		}                                                            
		else {
			System.out.println("bye!");
		}
		
		int marks = 100;
		if (marks >= 90) {
			    if(marks>=95) {
			    	System.out.println("Grade A++");
			    	   if(marks == 100) {
			    		   System.out.println("eligible for schlorship");
			    	   }
			    	   else {
			    		   System.out.println("not eligible for schlorship");
			    	   }
			    }
			    else {
			         System.out.println("Grade A");
		             }
			   }
		else {
			System.out.println("Grade B");
		}
		
		String s1 = "Selenium";  //String is non primitive it is a class
		String s2 = "selenium";
		if(s1.equals(s2)) {             // == can't use with string so .equals
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		//browser -- chrome firefox Edge IE
		
		String browser = "firefox";
		 if(browser.equals("chrome")) {
			 System.out.println("launch chrome");
		 }
		 if(browser.equals("firefox")) {
			 System.out.println("launch firefox");
		 }
		 if(browser.equals("edge")) {
			 System.out.println("launch edge");
		 }
		 if(browser.equals("ie")) {
			 System.out.println("launch ie");
		 }
		 else {
			 System.out.println("please pass the right browser.." + browser);
		 }
		// in above methode there are so many 'if' so if we satisfied the one if he will go on others too or
		 //they are not satisfied then it go to the else parts too and execute that also and one more if we
		 //need ie it check all the step then it come 4th row so to overcome this we use else if condition
		 System.out.println("--------------"); 
		 String br = "chrome";
		 if(br.equals("chrome")) {
			 System.out.println("launch chrome");
		 }
		 else if(br.equals("firefox")) {
			 System.out.println("launch firefox");
		 }
		 else if(br.equals("edge")) {
			 System.out.println("launch edge");
		 }
		 else if(br.equals("ie")) {
			 System.out.println("launch ie");
		 }
		 else {
			 System.out.println("please pass the right browser..," + br);
		 }

		//in the above logic if first condition is satisfied it will come out didn't go on any other steps but if put other browser then it will check all 
		 // and go to the else part... so to overcome this we use switch case now
		
		 
		 //Find out the greatest number out of three different given numbers:
		int x = 25;
		int y = 78;
		int z = 87;
		if(x>=y && x>=z) {
			System.out.println("the gratest number " +x);
		}
		else if(y>=x && y>=z) {
			System.out.println("the gratest number " +y);
		}
		else {
			System.out.println("the gratest number " +z);
		}
		
		 
		 //Write a Java program to test a number is positive or negative.
		
		int a = 35;
		//int b = -11;
		if(a>0) {
			System.out.println("the number is positive");
		}
		else if(a<0) {
			System.out.println("the number is negative");
		}	
		else {
			System.out.println("number is zero");
		}
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
