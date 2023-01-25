package javasession;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//two major limitation
		//1.fixed size: static array: to overcome this issue, we have to use dynamic array : Arraylist
		//2. it only stores similar types of data : to overcome this issue, we can use static object aray.
		
		int i[] = new int[4];
		i[0] = 100;
		i[1] = 200;
		i[2] = 300;
		i[3] = 400;
		
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3] + i[2]);
		
		//System.out.println(i);
		System.out.println(Arrays.toString(i)); //100 200 300 400
		
		//length of array
		System.out.println(i.length);
		
		//to print all the values from array : for loop:
		//traverse the array  // iterate the array
		//for(int k=0; k<=3; k++)
		for(int k=0; k<=i.length-1; k++){
			System.out.println(i[k]); //100 200 300 400
		}
		
		System.out.println("--------------");
		//while loop
		int j = 0;
		while(j<=i.length-1) {
			System.out.println(i[j]);
			j++;
		}
		
		System.out.println("--------------");
		
		for(int k=0; k<=i.length-1; k++) {
			System.out.println(i[k]);
			if(i[k]==200) {
				System.out.println("bye");
				break;
			}
		}
		System.out.println("--------------");
    	//byte, short, int, long
		//double array:
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 23.44;
		d[2] = 34.55;
		for(int p=0; p<=d.length-1; p++) {
			System.out.println(d[p]);
		}
		
		System.out.println("--------------");
		//char array
		
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '1';
		c[2] = '$';
		
		//string array
		
		String emp[] = new String[4];
		emp[0] = "Tom";
		emp[1] = "Ravi";
		emp[2] = "Lisa";
		emp[3] = "Tom";
		
		System.out.println("total employees: " + emp.length);
		
		System.out.println(Arrays.toString(emp));
		
		for(int s=0; s<=emp.length-1; s++) {
			//System.out.println(emp[s]);
			if(emp[s].equals("Lisa")) {
				System.out.print("The manager is ");
			}
			System.out.println(emp[s]);
		}

		//for-each loop:
		
		int num[] = new int[4];
		num[0] = 10;
		num[1] = 32;
		num[2] = 42;
		num[3] = 54;
		
		for(int e : num) {
			System.out.println(e);
		}
		
		for(String e : emp) {
			System.out.println(e);
		}
		
		//Array literals:
		
		int pop[] = {1,2,3,4,11,10};
		System.out.println(pop.length);
		System.out.println("lowest index = " + 0);
		System.out.println("highest index = " +(pop.length-1));
		
		
		//emp data: String, int, double, boolean, char
		
		//Object Array: static array:
		
		Object empData[] = new Object[5];
		
		empData[0] = "vani";
		empData[1] = 25;
		empData[2] = 25.66;
		empData[3] = 'f';
		empData[4] = true;
		
		System.out.println(empData.length);  //5
		
		System.out.println(Arrays.toString(empData));
		
		//for each loop
		for(Object e : empData) {
			System.out.println(e);
		}
		
		//for loop
		for(int k=0; k<=empData.length-1; k++) {
			System.out.println(empData[k]);
		}
		
		
	    //Object literals:
		Object userInfo[] = {"punit", 27, 34.55, 'm', false};
		System.out.println(userInfo.length);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       		

	}

}
