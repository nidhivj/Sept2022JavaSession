package OOP_Encapsulation;

public class LoginPage {
	
	private String userName;
	private String password;
	public String role;
	
	
	//clcik on right button and select source then select constructor using fields
	public LoginPage(String userName, String password, String role) {

		this.userName = userName;
		this.password = password;
		this.role = role;
		
	}

     // click on right button and select source and then generate getter and setter
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
