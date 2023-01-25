package javasession;

public class MethodCalling {

	
	public void m1() {
		System.out.println("m1");
		m2();
	}
	
    public void m2() {
		System.out.println("m2");
		m3();
	}

    public void m3() {
		System.out.println("m3");
		t2();  //non static can call static variables
		}
    
    public static void t1() {
		System.out.println("t1");
		t2();
	}
    public static void t2() {
		System.out.println("t2");
		t3();
	}
    public static void t3() {
		System.out.println("bye t3");
		//m1(); static can't call non static variables
	}
	public static void main(String[] args) {
		MethodCalling d = new MethodCalling();
		d.m1();
		//d.t1();
		MethodCalling.t1();

	}

}
