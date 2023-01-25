package javasession;

public class A {

	public static void main(String[] args) {
		System.out.println("A--- main");
		B.main(args);                       //static should be called by class name

	}

}


// if we call A class in B and run it will give you stack over flow
// last in first out (LIFO)