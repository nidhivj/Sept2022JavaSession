package javasession;

public class DepartmentStatic {

	public void sendMail() {
		System.out.println("send mail");
	}
	
	public static void getInfo() {
		System.out.println("get info");
	}
	
	
	
	
	
	public static void main(String[] args) {
		DepartmentStatic d = new DepartmentStatic();
				d.sendMail();
				
			//	d.getInfo();  it is static can't call by class object

			// 1.using class name to call static var:
				
				DepartmentStatic.getInfo();
				
			// 2. calling directly
				
				getInfo();
				
			// how to call non static var and methods:
				
			// 1. create the object and using object ref name
				
			// how to call static var and methods:
				
			// 1. using the class name	
				
			System.out.println(CarTypes.wheels);	
			
				
				
				
	}

}
