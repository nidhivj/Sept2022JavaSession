package javasession;

public class LoopConcept {

	public static void main(String[] args) {
		
		//1to10
		 int i = 1;  //short long
		 while(i<=10) {
			 System.out.println(i); // 1 infinity
             
           // i++;
           //++i;
             i=i+2;
           //break;
		 }
		float f = 1.1f;  //double
		while(f<=10.0) {
			System.out.println(f);
			f++;
		}
		System.out.println(f);
		
	//boolean	
	 while(true) {
		 System.out.println("hi");
		 break;
	 }
		
	 int p = 1;
	 while(p<=10) {
		 System.out.println(p);
		 if(p==5) {
			 System.out.println("bye");
			// break;   //break the entire while loop
		    }
		p++;
	}
	 System.out.println("---------");  
	  int k = 10;
	  while (k>=1) {
		  System.out.println(k);
		  k=k-2;
	  }
	  
	  //use cases for while loop:
	  //1. total images/links on the page
	  //2. linkedin/facebook/swiggy---->infinite scrolling
	  //3. search for an element is coming after x seconds
	  //4. email in inbox
	  //5. page load timeout:
	  
	  
	 
	 //for even no. k = 10 k=k-2
	  //for odd no. k = 9 k=k-2
	  System.out.println("--------");
	  
	  //for loop
	  //1 to 10
	  for(int n=1; n<=10; n++){
	      System.out.println(n);
	  }
	  //
//	 for(;;) {
//		 System.out.println("bye");
//
//	 }
	//for loop with break;
	  for(int e=1; e<=10; e++) {
		  if(e % 2 == 0) {
		  System.out.println(e);
		  break;
		  }
	  }
	 
	  //chAR in loop
	  //a-z 97 - 122
	  //A-Z
	 for(char c='0';c<='9';c++) {
		// System.out.println(c); //horizontal a to z
		// System.out.print(c); //vertical a to z
		// System.out.print(c+" "); //for space
		// System.out.println((int)c); //for ascii value
		// System.out.println(c+0);
		 System.out.println(c+"="+(int)c);
	 }
	  
	  //use cases for for-loop
	  //1.number of iteration/cycles are fixed:
	  //2.dropdown- month 1-12
	  //3.footer links:20
	  //4. calender : for loop
	  
	  
	  
	  
	  //do-while
	 // atleast check the element(logo) first time the moment you 
	 // land on the page.
	 // if element is present ---- break the loop.
	 //int v = 1;
	 //do {
	//	// v++;  //forth
	//	 System.out.println(v);
	//	 v++; //third
	// }
	// v++;  fifth
	  //while(v>=10); //1 first
	  //while(v<=10); //infinite second
	  //v++;  //infinite six
	  //  while(true);  //infinite
	 
		
	 
	 
	  int v1 = 1;
	  do {
		  System.out.println(v1);
		  v1++;
		      if(v1==5) {
		    	  break;
		      }
	 }
	  while(true);
	  
	 
	 
	  
	  
	  
	  
	 int a = 10;
	 while(a<=9) {
		 System.out.println("I am a Superwoman" +" "+a);
		 a++;
	 while(a>=1) {
		 System.out.println(a);
		 a--;
	 }}
//	 for(int a = 10; a>=1; a--) {
//		 System.out.println(a);
//	 do {
//		 System.out.println(a);
//		 a--;
//	 }
//	  while(a>=1);
	 
	 //WAP to find out the max number from the given positive numbers
	 
	 
	 
	// int a = 2040;
//	 int x = 45985;
//	 int z = 8784;
//	 
//	 if(a>x && a>z) {
//		 System.out.println("the largest value is " +a); 
//	 }
//	 else if(x>a && x>z) {
//		 System.out.println("the largest value is " +x);
//	 }
//	 else {
//		 System.out.println(z+ " is the largest value");
//	 }
//	 
//	 //print all odd and even numbers from 1 to 100
//	 int y = 0;  // 1;
//	 while(y<=100) {
//		 System.out.println(y);
//		 y=y+2;
//	 }
	  
	 //print ascii no. of A-Z,a-z 0-9
	 
	 for(char c1 = 'a'; c1<='z'; c1++) {
		 System.out.println(c1+0);
		 
	 }
	 
	 //print the series 1.0 2.0 3.0....
	 
	 //float g1 = 1.0f;
	 for(float g1 = 1.0f; g1<=10.0; g1++) {
		 System.out.println(g1); 
	 }
	 
	 //Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow
	 for(int q = 1; q <=10; q++ ) {
		 System.out.println(q); 
		 if(q%7 == 0) {
			 System.out.println("bye! see you tomorrow");
			 break;
		 }
	 }
	
	 
	 // 7 divisible
	 
	 for(int e = 1; e<=100; e++) {
		 if(e % 7 == 0) {
			 System.out.println(e); 
		 }
	 }
	 
//	 Write a cricket score card system using for and while loops:
//
//		 if(score == 0) -- print - "Zero - duck"
//
//		 if(score == 25) -- print - "good job"
//
//		 if(score == 50) -- print - "good job - half century"
//
//		 if(score == 100) -- print - "good job - century"
	 
	 for(int score = 0; score<=100; score++) {
		 if(score==0) {
			 System.out.println("Zero - Duck"); 
		 }
		 else if(score==25) {
			 System.out.println("Good Job"); 
		 }
		 else if(score==50) {
			 System.out.println("Good Job - Half Century"); 
		 }
		 else if(score==100) {
			 System.out.println("Good Job - Century"); 
		 }
	 }
	 
	 
	 //while loop
	 int score1= 0;
	 while(score1<=100) {
		 if(score1==0) {
			 System.out.println("Zero - Duck"); 
		 }
		 else if(score1==25) {
			 System.out.println("Good Job"); 
		 }
		 else if(score1==50) {
			 System.out.println("Good Job - Half Century"); 
		 }
		 else if(score1==100) {
			 System.out.println("Good Job - Century"); 
		 }
		 score1++;
	 }
	 
	 
	 
	 }}

	 
