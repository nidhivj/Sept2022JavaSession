package javasession;

public class UserConstructor {

	
	String name;
	int id;
	String dob;
	String city;
	boolean isActive;
//	public UserConstructor() {
//		System.out.println("default const..");
//	}
	
	public UserConstructor(String name, int id) {
		System.out.println("2 param");
		this.name = name ;
		this.id = id ;
	}
	
	public UserConstructor(String name, String dob, String city ) {
		System.out.println("3 param");
		this.name = name;
		this.dob = dob;
		this.city = city;
	}
	
	public UserConstructor(String name, int id, String dob, String city, boolean isActive) {
		this.name = name;
		this.id = id;
		this.dob = dob;
		this.city = city;
		this.isActive = isActive;
	}
	
	
	public UserConstructor(int id, String city, boolean isActive) {
		this.id = id;
		this.city = city;
		this.isActive = isActive;
	}

	public static void main(String[] args) {
		
		UserConstructor u1 = new UserConstructor("testing", 10);
		System.out.println(u1.name);
		System.out.println(u1.id);
		
		UserConstructor u2 = new UserConstructor("peter", "27dec", "LA");
		System.out.println(u2.name + " " + u2.dob + " " + u2.city);

		UserConstructor u3 = new UserConstructor("herry", 678, "16aug", "indor", true);
		System.out.println(u3.name + " " + u3.id + " " + u3.dob + " " + u3.city + " " +u3.isActive);
		
		UserConstructor u4 = new UserConstructor(103, "kota", false);
		System.out.println( );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
