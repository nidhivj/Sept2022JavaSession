package javasession;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		//++ --
		//1. post increment:
		int a = 1;
		int b = a++;
		System.out.println(a);  // 2 
		System.out.println(b); // 1  in post increment first what is the a's original value it give it to 'b' then it will increse the value of a
		
		int g  = -98;
		int h = g++;
		System.out.println(g); //-97
		System.out.println(h); //-98
		
		//2. pre increment
		int c = 1;
		int d = ++c;
		System.out.println(c); //2  in this first increse the value of 'c' it will give it to 'd'
		System.out.println(d); //2 
		
		int t = -99;
		int p = ++t;
		System.out.println(t);  //-98
		System.out.println(p); //-98
		
		//3.post decrement
		int k = 2;
		int m = k--;
		System.out.println(k); //1
		System.out.println(m); //2
		 
		//pre decrement
		int e = 2;
		int f = --e;
		System.out.println(e); //1
		System.out.println(f); //1
		
		int u = 2; 
		System.out.println(u++); //2 after next line u will become 3
		System.out.println(u); //3
		
		
		int w = 2;
		System.out.println(++w); //3 pre increse the value frist
		System.out.println(w); //3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
