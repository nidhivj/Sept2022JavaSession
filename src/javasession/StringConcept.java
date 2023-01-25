package javasession;

public class StringConcept {

	public static void main(String[] args) {
	
		
      String s = "hello world";
      System.out.println(s);
      String s1 = "this is my first java class";
      System.out.println(s1);
      String s2 = "100";
      System.out.println(s2+20);
      String x = "Hello";
      String y = "Selenium";
      System.out.println(x+y);//HelloSelenium
      int a = 100;
      int b = 200;
      
      double d1 = 12.33;
      double d2 = 22.33;
    	  
      System.out.println(a+b);//300
      System.out.println(a+b+x+y);//300HelloSelenium
      System.out.println(x+y+a+b); //HelloSelenium100200
      System.out.println(x+y+(a+b));//HelloSelenium300
      
      System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
      System.out.println(x+y+d1+d2);  //HelloSelenium12.3322.33
      System.out.println(a+b+x+y+a+b+d1+d2); //300HelloSelenium10020012.3322.33
      
      
      char c1 = 't'; //as a homework you can try it in byte short long.... also
      System.out.println(x+c1); //Hellot
      System.out.println("Hello selenium");
      System.out.println("the value of a is :" + a);
      System.out.println("the value of b is :" + b);
      System.out.println("the sum is :" +a +b ); //100200
      System.out.println("the sum is :" +(a+b)); //300
      System.out.println(x + y); //HelloSelenium
      System.out.println(x+" "+y);//Hello Selenium
      
       byte b1 = 27;
       System.out.println(a+b+b1); //327
       System.out.println(a+b+b1+d1+d2); //361.65999...
       
       float f1 = 10.5f;
       System.out.println(d1+d2+f1); //45.16
        double sum = d1+d2 ;
        System.out.println(sum);
       
      
      //(short long char int) n = null; can't store in premitive data type
      String n = null;
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
