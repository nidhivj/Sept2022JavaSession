package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//array list(c) ---> implements list interface
		//default class
		//dynamic array
		
		ArrayList ar = new ArrayList();   //arraylist already in java library
		System.out.println(ar.size());  //size is 0
		
		ar.add(100);
		ar.add(200);
		ar.add("java");
		System.out.println(ar.size());   //size is 3
		
		ar.add(12.33);
		ar.add(true);
		ar.add('a');
		
		System.out.println(ar.size());  //now size is 6
		
		//to print all the value from arraylist:
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//for each loop
		for(Object e : ar) {
			System.out.println(e);
		}
		
		//generics in arraylist:
		//student names: String
		ArrayList<String> stName = new ArrayList<String>();
		stName.add("tom");
		stName.add("peter");
		stName.add("ravi");
		
		//for each :
		for(String sn : stName) {
			System.out.println(sn);
		}
		
		System.out.println(stName.size());
		System.out.println(stName);
		
		//marks:int
		ArrayList<Integer> stmarks = new ArrayList<Integer>();
		stmarks.add(100);
		stmarks.add(200);
		
		//emp info:
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("nidhi");
		empData.add(25);
		empData.add(34.55);
		empData.add(true);
		empData.add('F');
		
		System.out.println(empData.size());
		System.out.println(empData);
		
		//for loop:
		for(int i= 0; i<empData.size(); i++) {
			System.out.println(empData.get(i));
			  if(empData.get(i).equals(true)) {
				  System.out.println("eligible for hike");
			  }
		}
		   
		//for each:
		for(Object e : empData) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
