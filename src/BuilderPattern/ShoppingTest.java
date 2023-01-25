package BuilderPattern;

public class ShoppingTest {

	public static void main(String[] args) {
		
		EcommApplication obj = new EcommApplication();
		obj.login("nidhivj27@gmail.com", "123nidhi")
		     .search("imac")
		       .search("imac", "red")
		          .addToCart("imac")
		             .payment("1234 4432 3455 4544", 900)
		                .getOrderId()
		                   .logOut();
		
     //this pattern is called builder pattern
		//bcz of return this we don't need to put obj before every method we can write it like this
		// in single obj we refer all methods
		//we can create any type of chain by builder pattern
		//this keyword is not applicable for static method
		
		
		//
		
		obj.login("nidhivj27@gmail.com", "123nidhi")
		      .search("ipad", "silver")
		          .addToCart("ipad")
		              .logOut();
		
		//
		obj.login("nidhivj27@gmail.com", "123nidhi")
		     .search("BT")
		         .logOut();
	}

}
