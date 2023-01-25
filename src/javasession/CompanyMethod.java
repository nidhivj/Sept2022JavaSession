package javasession;

import java.util.Arrays;

public class CompanyMethod {

	//AC:
	//WAF:
	//getEmployeeDevices(laptop,mpbile,mouse,keyboard)
	//input param: employeeName(String)
	//return: all the devices----for single unit we use ARRAY
	
	public String[] getEmployeeDevices(String empName) {
		System.out.println("getting employee devices for employee name: "+ empName);
		
		//String devices[] = null;
		                   
		// instead of writing this we have to give the value direct in curly brackets
		
		if(empName.equals("Naveen")) {
		 
			String devices[] = {"macbook", "mouse", "iphone", "keybord"};
			return devices;
		}
		
		else if(empName.equals("swathi")) {
			
			String devices[] = {"hp", "samsung", "keypad"};
			return devices;
		}	
		
		else if(empName.equals("aman")) {
			
			String devices[] = {"lenovo", "vivo"};
			return devices;
		}
		
		else {
			System.out.println("emp name is not found..." + empName);
			String devices[] = {};
			return devices;
		}
		
		}
	
	
	
	public static void main(String[] args) {
		CompanyMethod co = new CompanyMethod();
		String d1[] = co.getEmployeeDevices("Nav");
		System.out.println("employee's devices count: "+d1.length);
		System.out.println(Arrays.toString(d1));
		

	}

}
     //this program has bug to fix this use string literals