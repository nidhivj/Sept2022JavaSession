package javasession;

public class MainMethodOverloading {
	
	// we can overload main method
	
	

	public static void main(String[] args) {     // string[] args is a string array can written string args[]/string p[]
		System.out.println("hi");            //jvm calling main method
		                                      
	//to call other method by using class name 	                                     // only execute this main method don't bother other methods
		MainMethodOverloading.main(10);
		MainMethodOverloading.main(10, "nidhi");
	
	}
	
	
	public static void main(int i) {              //java doesn't execute the other methods 
		System.out.println(i);
		System.out.println("bye");
	}
	
	public static void main(int i, String p) {
		System.out.println( "hello");
		System.out.println(i+p);
	}
	
	

}
