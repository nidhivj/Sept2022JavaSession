package javasession;

public class Employee {

	
	//class variables
	String name;
	int age;
	double salary;
	boolean isPerm;
	
	
	public static void main(String[] args) {
	   
		//create the object: new keyword
		Employee e = new Employee();
		e.name = "Vijay";
		e.age = 25;
		e.salary = 12.33;
		e.isPerm = true;
		
		System.out.println(e);
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.salary);
		System.out.println(e.isPerm);
		
		//create one more object
		Employee e1 = new Employee();
		//if i m not printing anything then
		System.out.println(e1.name); //its Null
		System.out.println(e1.age);   //0
		System.out.println(e1.salary); //0.0
		System.out.println(e1.isPerm);  //false
		
		//without any referance object name
		new Employee().name = "Tom";
		new Employee().age = 30;
		
		//null ref object:
		Employee e3 = new Employee();
		e3 = null;
		//e3.name = "Naveen"; //null pointer exception NPE
  		//System.out.println(e3.name);
		
		//Employee e4 = null;
		//System.out.println(e4.name);
		
		
		
		
		
		
		
		
		

	}

}
