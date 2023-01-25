package javasession;

public class LoginPageConstructor {

	
	String username;
	String password;
	
	// create constructor
	public LoginPageConstructor(String username, String password) {
		this.username = username;
		this.password = password;
	}

    // create method
	public void doLogin() {
		System.out.println("enter username: " +username);
		System.out.println("enter password: " +password);
		System.out.println("click on login button");
		System.out.println("user is logged in");
		
	}



	public static void main(String[] args) {
		
		LoginPageConstructor lp1 = new LoginPageConstructor("nidhivj27@gmail.com", "nidhi27");  //calling constructor
		lp1.doLogin();  //calling method
		
		LoginPageConstructor lp2 = new LoginPageConstructor("naveen@gmail.com", "naveen123");
		lp2.doLogin();
		
		

	}

}
