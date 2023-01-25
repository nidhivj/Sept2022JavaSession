package exceptionHandling;

public class MyException extends RuntimeException {

	public MyException(String msg) {
		super(msg);    //to call runtime exception constructor
	}
}
