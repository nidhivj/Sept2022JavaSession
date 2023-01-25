package OOP_Encapsulation;

public class User {

	
	public static void main(String[] args) {
		
		//employee class call
		Employee e1 = new Employee();
		e1.setName("Tom");
		e1.setAge(20);
		e1.setSalary(12.33);
		
		System.out.println(e1.getName() + " " + e1.getAge() + " " + e1.getSalary());
		
		//browser class call
	    Browser br = new Browser();
	    br.launchBrowser();
	    
	    //customer class call
	    Customer c1 = new Customer("nidhi", 10234, "nidhivj27@gmail.com");
        System.out.println(c1.getUserId());
        System.out.println(c1.getEmailId());
        System.out.println(c1.getName());
        
        c1.setEmailId("nidhivj2712@gmail.com");  //setter is use to update anything if you want to make chang
        
        System.out.println(c1.getUserId());
        System.out.println(c1.getEmailId());
        System.out.println(c1.getName());
        
	}

}