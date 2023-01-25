package oop_Abstract;

//child of page class so class to class inheritance we use extends keywords
//child class responsibility to override methods
public class LoginPage extends Page{
	
	
	//before we don't have any constructor of this login page but still we can create the object of loginPage class that is bcz
	//bcz it has a hidden default constructor in java at runtime...

	public LoginPage() {
		System.out.println("login page constructor");
	}
	
	@Override
	public void title() {
	System.out.println("login--- title");
		
	}

	@Override
	public void url() {
		System.out.println("LP--- url");
		
	}
	
	public void doLogin(){
		System.out.println("user is logged in");
	}

	
	 
}
