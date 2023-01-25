package oop_Abstract;

public class AmazonApp {

	public static void main(String[] args) {
		
		
		//create object of login class
		
		LoginPage lp =new LoginPage();    //bcz of this line it goes on loginPage that extends the page class and there we have a page constructor that call by this and
		                                 //it print the msg of page constructor but if have in both class constructor then it print both constructor but first print the parent 
		                                 //class constructor then print child class constructor  //so the sequence is...
		                               //parent constructor  ,  child constructor
		                               // Runtime--> parent constructor ----- child constructor ----- child cons......
		lp.title();
		lp.url();
		lp.displayLogo();  //can call of page class method also bcz you can call parent/child class method
		lp.doLogin();

		Page.pageStyle();   //static method
		//LoginPage.pageStyle();   //you can call either parent class or child class method
		
		
		//can not create object of abstract class
		//Page p = new Page(); 
		
		//so we have to do top casting
		//top casting is child class object can be referred by parent abstract class ref variable
		Page p = new LoginPage();   //here i can call only those methods that are coming from page class
		p.title();
		p.url();
		p.displayLogo();    //can call method from parent class
		//p.doLogin();      //individual method of login class
		
		System.out.println("");
		
		//try this with car and bmw
	}

}
