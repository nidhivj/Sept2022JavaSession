package BuilderPattern;

public class Employee extends Company {
	
	String name;
	int id;
	double salary;
	
	public Employee() {
		super();
		System.out.println("emp cons...");
		
	}
	
	public Employee(String name, int id , double salary) {
		super(name, salary);
		this.name = name;
		this.id = id;
		this.salary = salary;
		
	}
	
	public static void main(String a[]) {
		
		Employee e = new Employee("tom", 101, 12.33);
		System.out.println(e.name + " " + e.id + " " + e.salary);
	}

}
