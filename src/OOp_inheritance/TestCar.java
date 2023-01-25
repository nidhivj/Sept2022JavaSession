package OOp_inheritance;

public class TestCar {

	public static void main(String[] args) {
		//we are creating other class object
		//child class object
		BMW b = new BMW();
		b.start();        //overridden //this start method call from BMW bcz preference will always give overridden method
		b.stop();         //inherited from car class by bmw
		b.refuel();       //inherited
		b.autoParking();  //individual from bmw class
		BMW.billing();    //static method call by class name not by object ref.
		//b.billing();
		
		b.engine();     //can inherit the grand parent property
		System.out.println(b.speed);
		b.getBMWEngineInfo();
		
		//parent class object
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		Car.billing();
		c.engine();
		System.out.println(c.speed);
		//another object of bmw only object
		//new BMW();
		
		//child class object can be refered by parent class ref variable
		//this is called top/up casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		c1.engine();    //engine is somewhere related to car
		System.out.println(c1.speed);   //interview question  why it call car class speed insted of bmw?? ans : reference type check fail over here in case of variable we cann't access bmw speed thats why it access the car class speed
		//child class object can be refered by grand parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine(); //can access only engine
		
		//c1.autoparking(); can't access this method bcz autoparking is separate method of child class
		
		//reverse of top casting is
		//down casting:   parent class object can be referred by child class ref variable??? NO

		//BMW b1 = new Car();   error
		//BMW b1 = (BMW)new Car();   //error at runtime class car exception
		//compile time means when we written here AND RUNTIME means after writing and then run it  
		
	}

}
