package HashMapConcapt;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		//hashmap ---> key and value (where we can store the data in the form of key and value pair concept)
		//hashmap doesn't follow the order
		
		//HashMap<String, String> map = new HashMap<String,String>();       //print according to given hashcode that is inbuilt
		Map<String, String> map = new HashMap<String,String>();         
		//Map<String, String> map = new LinkedHashMap<String,String>();   //print map just like write
		//Map<String, String> map = new TreeMap<String,String>();       //sorting order on the basis of key
		
		map.put("tom", "IBM");
		map.put("tony", "MS");
		map.put("peter", "TCS");
		map.put("ravi", "GOOGLE");
		map.put("peter", "Infosys");
		
//		map.put("aman",null);
//		map.put(null, "jdc");
//		map.put(null, "abc");
//		map.put(null, null);
//		
//		
//		System.out.println(map.get("tony"));  //ms is print
//		System.out.println(map.get("test"));  //null no data for this
//		System.out.println(map.get("peter"));  //updated value from tcs to infosys
//		System.out.println(map.get("aman"));   //null is value
//		System.out.println(map.get(null));     //null print the key is null
//		//null key or null value gives null
		
		//to print all the values
		System.out.println(map);  //it print only updated value not duplicate
		                //bcz of hashcode it doesn't mantain oredr          //hashmap doesn't follow the order
		
		
		
		
		

	}

}
