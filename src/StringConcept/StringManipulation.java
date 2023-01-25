package StringConcept;

import java.util.Arrays;

public class StringManipulation {
	
	

	public static void main(String[] args) {
		
		
		String str = "hi this is my java code and i am so happy";
		String s = "testing";
		String st = "100";
		
		System.out.println(str.length());
		System.out.println(s.length());
		
		int len = str.length();
		int li = 0;
		int hi = len-1;
		System.out.println("LI = " + li);
		System.out.println("HI = " + hi);
		System.out.println("length = " +len);
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(40));
		//System.out.println(str.charAt(41)); //SIOB String indax out of bound exception
		
		System.out.println(str.indexOf('h'));
		System.out.println(str.indexOf('i'));   //1st occurrence of i
		
		System.out.println(str.indexOf('i' ,str.indexOf('i')+1));
		System.out.println(str.indexOf('i',str.indexOf('i' ,str.indexOf('i')+1)+1));
		System.out.println(str.indexOf('i', str.indexOf('i',str.indexOf('i' ,str.indexOf('i')+1)+1)+1));
		
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("python"));   //-1
		
		String msg = "welcome Nidhi";
		if(msg.indexOf("Nidhi") != -1) {
			System.out.println("user name is present");
		}
		
		else {
			System.out.println("not present");
		}
		
		
		//comparison
		String t1 = "hello world";
		String t2 = "hello World";
		
		System.out.println(t1.equals(t2));     //true 
		System.out.println(t1.equalsIgnoreCase(t2));  //for ignoring extra space.. upper case.. lower case...
		
		String l1 = "selenium";
		System.out.println(l1.toUpperCase());  //SELENIUM
		System.out.println(l1.toLowerCase());
		 l1 = l1.toUpperCase();
		System.out.println(l1);
		
		//contains:
		String pop = "hello amazon application";
		System.out.println(pop.contains("amazon"));  //true for containing any word
		
		//trim
		String h1 = " hello world   ";
		System.out.println(h1.trim());
		
		//replace:
		String h2 = "hello world";
		System.out.println(h2.replace(" ", ""));
		
		String dob = "01-01-1990"; 
		String newDOB = dob.replace("-", "/");
		System.out.println(newDOB);
		
		String st1 = "hello hi this is my java code";
		System.out.println(st1.replace("java", "selenium"));
		
		
		//String builder
		
		StringBuilder sb1 = new StringBuilder("Naveen");
		StringBuilder sb2 = new StringBuilder("Naveen");
		
		System.out.println(sb1.equals(sb2));   //false   bcz .equals not compair actual value it compair references
		System.out.println(sb1==sb2);          //false just like above and also both are store in heap memory
		
		System.out.println(sb1.toString().equals(sb2.toString()));  //to compaire both
		
		
		sb1.append("Automation");      //to concatenate the words 
		System.out.println(sb1);       //NaveenAutomation

		String p1 = "selenium";
		StringBuilder sp1 = new StringBuilder(p1);
		sp1.append("testing");
		System.out.println(sp1);
		
		
		//split:
		String sl = "java_python_ruby_dotnet";
		String sp[] = sl.split("_");         //split it will always store in string array
		System.out.println(sp[0]);
		System.out.println(sp[3]);
		//System.out.println(sp[4]);   // AIOB exception
		
		String pool = "xXtestingxXseleniumXxXJavaXXxXAutomationX"; 
		String arr[] = pool.split("xX");
		
		System.out.println(arr[0]);   //blank    we don't anything before xX thats it is blank
		System.out.println(arr[0].length());  //0
		System.out.println(arr[1]);    //testing
		System.out.println(arr[2]);    //seleniumX
		System.out.println(arr[3]);    //javaXX 
		
		String data = "tom;peter;30;pune;india;SDET1";
		String d[] = data.split(";");
		System.out.println(Arrays.toString(d));
		
		//1: String Builder 
		String test = "Selenium"; //muineleS         we can't reverse it directly by test.reverse
		StringBuilder stb = new StringBuilder(test);    //with the help of string builder we can reverse it
		stb.reverse();
		System.out.println(stb);
		
		
		//2:
		int length = test.length();   //8
		String rev = "";
		for(int i=length-1;i>=0;i--) {
			rev = rev + test.charAt(i);  //
			//System.out.println(rev);
		}
		System.out.println(rev);
	
		//subString:
		String msg1 = "your username is nidhivijay";
		String newStr = msg1.substring(7);         //to give the starting range
		System.out.println(newStr);
		String newStr1 = msg1.substring(7,20);     //to cut start and end both side
		System.out.println(newStr1);
		
		String newStr2 = msg1.substring(msg1.indexOf("is")+3,msg1.length());
		System.out.println(newStr2);              //nidhivijay
		
		
		
		
		
		
		
		
		

	}

}
