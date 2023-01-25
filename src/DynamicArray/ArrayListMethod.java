package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<Integer>marksList = new ArrayList<Integer>();
		
		marksList.add(100);
		marksList.add(300);
		marksList.add(450);
		marksList.add(10);
		marksList.add(600);
		marksList.add(98);
		
		System.out.println(marksList.get(5));  //tp get the particular value 
		
		marksList.add(101);
		//marksList.add(null);
		
		System.out.println(marksList.get(6)); 
		
		System.out.println(marksList);  //to get the entire values
		
		System.out.println(marksList.size());  //8
		
		marksList.remove(3);            //to remove the indax
		
		System.out.println(marksList.size());   //7
		System.out.println(marksList.get(3));  //after removing 3 600 become on 3rd postion
		System.out.println(marksList);
		
		marksList.add(3, 1100);             //for adding index and value
		System.out.println(marksList.get(3));
		System.out.println(marksList);
		
		marksList.add(0, 1500);
		System.out.println(marksList.get(0));
		System.out.println(marksList); 
		
		System.out.println("-------");
		
		System.out.println(marksList);
		Collections.sort(marksList);   //arranging value or sort the values in order
		System.out.println(marksList);
		
		Collections.swap(marksList, 3, 5);    //swaping the vales with eachother
		System.out.println(marksList);
		
		//
		
		ArrayList<String>stName = new ArrayList<String>();
		stName.add("tom");
		stName.add("peter");
		stName.add("ravi");
		stName.add("naveen");
		stName.add("mukta");
		
		Collections.sort(stName);   //
		System.out.println(stName);
		
		ArrayList<String>subjectName = new ArrayList<String>();
		subjectName.add("java");
		subjectName.add("py");
		subjectName.add("ruby");
		subjectName.add("c#");
		subjectName.add("GO");
		
		stName.addAll(subjectName);
		System.out.println(stName);  //adding both 
		
		//top casting:
		List<String>currList = Arrays.asList("USD","INR", "JPY", "EUR");
		System.out.println(currList);
		System.out.println(currList.size());
		
		String lang[] = {"JAva", "Rub", "Python", "Go"};   //whenever you declare in square bracket it is static array
		//static array to dynamic array:
		//array to arrayList
		List<String>langList = Arrays.asList(lang);
		System.out.println(langList.size());
		System.out.println(langList);
		
		
		
      //default virtual capacity of arraylist is 10(0 to 9)
		//the moment you try to add values the physical capacity(pc) is increase and virtual capacity is decrease 
		//actual size when you calculate is zero (pc)  ArrayList<integer>();
		//vc = pc/2 after 10th segment and for 11th segment
		
		

	
		
	}

}
