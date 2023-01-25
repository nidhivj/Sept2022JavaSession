package javasession;

public class StudentMethod {

	//AC: 0-100
	//WAF(write a function): pass the student name(String) as input parameter
	//return student marks (int)
	//else print a msg --> student not found... return 
	//do this with switch case 
	
	 public int getStudentMarks(String studentName) {
		int marks = -1;
		 
		 System.out.println("getting student marks: " +studentName);
//		
//		  if(studentName.equals("sameer")) {
//			// return 90;
//			  marks = 90;
//		  }
//		  
//		  else if(studentName.equals("aman")) {
//			 //return 95;
//			 marks = 95;
//		  }
//		  
//		  else {
//			  System.out.println("student name is not found..");
//			 //return -1; //null can't we here bcz null is only for non primitive data type
//		  }
//		  return marks;  //return is best to write hear instead of marks after every condition 
//	 }
//	     studentName = "jhony";
		 switch (studentName) {
		case "jhony":
			marks = 90;
			break;
		case "jack":
			marks = 95;
			break;
		case "jerry":
			marks = 80;
			break;
			
			

		default:
			System.out.println("student name is not found.." +studentName);
			
			break;
		}
		 return marks;
	 }
	
	public static void main(String[] args) {
		
		StudentMethod st = new StudentMethod();
	    int m1 = st.getStudentMarks("jhony");
		System.out.println(m1);
		
		int m2 = st.getStudentMarks("nidhi");
		System.out.println(m2);
		    if(m2==-1) {
		    	System.out.println("no need to print the marks sheet");
		    }
		
		//print it in switch case
		   
		

	}

}
