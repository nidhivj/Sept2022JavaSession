package OOP_Encapsulation;

public class Application {
	
	private Application() {
	        //when you have private constructor in class you can not call in other class by direct object ref	
	}
 
	public static void getInfo() {
		System.out.println("app info");
	}
}
