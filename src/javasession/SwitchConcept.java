package javasession;

public class SwitchConcept {

	public static void main(String[] args) {
		
		
		String browser = "chrome";
		
		switch (browser.toLowerCase()) {
		case "chrome" :
			System.out.println("launch chrome");
			break;
		case "firefox" :
			System.out.println("launch firefox");
			break;
		case "edge" :
			System.out.println("launch edge");
			break;
		case "ie" :
			System.out.println("launch ie");
			break;

		default:
			
			System.out.println("please pass the right browser.." +browser);
			break;
		
		case "brave" :
			System.out.println("launch brave");
			break;
		}
		//now in this it will directly go to command what we need and then break it
		//capital or small whatever we pass to resolve this we use .toLowerCase
		
		int marks = 95;
		switch (marks) {
		case 90:
		System.out.println("Grade A");
			break;
		case 80 :
			System.out.println("Grade B");
			break;
		case 100:
			System.out.println("Grade A++");
			break;
			

		default:
			System.out.println("Fail");
			break;
		}
		 
		String day = "Monday";
		switch (day.toLowerCase()) {
		case "monday","tuesday","wednesday","thursday","friday":
			System.out.println("its working day");
			break;
		case "saturday","sunday":
			System.out.println("its weekend");
			break;
		
			
		default:
		System.out.println("please pass the right day..." +day);
			break;
		}
		 
	  /* boolean num = true;
		switch (num) {
		case 12.33:
          System.out.println();
			break;*/

		//switch case with float double boolean long won't work
		
		char c = 'a';
		switch (c) {
		case 'a':
			System.out.println("a is vowel");
			break;
		case 'e':
			System.out.println("e is vowel");
			break;
		case 'i':
			System.out.println("i is vowel");
			break;
		case 'o':
			System.out.println("o is vowel");
			break;
		case 'u':
			System.out.println("u is vowel");
			break;

		default:
			System.out.println("not a vowel");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
