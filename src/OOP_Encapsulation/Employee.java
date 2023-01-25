package OOP_Encapsulation;

public class Employee {
 
	// if we assign variables private that mean no one cann't access them outside Employee  class
	private String name;
	private int age;
	private double salary;
	
	// so these private variables we can assign anywhere with the help of getter and setter and this concept is called encapsulation.
	//public methods: getter and setter:
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name ;
	}
	
	
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.name = "Tom";
		e.age = 20;
		e.salary = 12.33;
		

	}

}
