package oop_Abstract;

public abstract class Page {   //for declare abstract class we need to define by keyword "abstract"
	
	//just like interface we can not create object of abstract class
	
	//we can create the constructor of abstract class/page class    // but we can not create the constructor of interface
	//when all methods are abstract call 100% abstraction
	// and when all method without abstract called 0% abstraction
	//few methods are abstract or few methods or non abstract called x% partial abstraction
	// and interfaces are always 100% abstraction without default and static method
	
	public Page() {
		System.out.println("page constructor");
	}
	
	//public void title();    //it gives error.. need to define abstract for abstract method or with method body
	public abstract void title();
    public abstract void url();
    
    public void pageTimeOut() {
    	System.out.println("page time out -- 20 secs");
    }
    
    public final void displayLogo() {         //to prevent override use final or make it static too
    	System.out.println("page -- logo");
    }
    
    public static void pageStyle() {            //static method
    	System.out.println("page style");
    	getPageTheme();                       //public method is call another private method
    }
    
      //the below method is not access by end user... through the above method user get to know this method
    
    private static void getPageTheme() {       //private method
    	System.out.println("get page theme");   //private methode also can not be override
    }
}
