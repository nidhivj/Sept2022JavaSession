package OOP_Encapsulation;

public class UserLogin {

	public static void main(String[] args) {
		
		
		//create the object of login page
		
		LoginPage lp1 = new LoginPage("admin", "admin123", "superadmin");
		System.out.println(lp1.getUserName());
		System.out.println(lp1.getPassword());
		System.out.println(lp1.role);
		
		//for password reset
		
		lp1.setPassword("admin345");
		System.out.println(lp1.getPassword());
		
		LoginPage lp2 = new LoginPage("seller", "seller123", "selleradmin");
		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassword());
		System.out.println(lp2.role);

		//for role change or reset
		lp2.role = "sellersuperadmin" ; //role is public we can change it directly

		System.out.println(lp2.getUserName());
		System.out.println(lp2.getPassword());
		System.out.println(lp2.role);		
	
	
		//Application a1 = new Application();
	    //method is static in nature
		Application.getInfo();
	
	
	
	
	}

}
