package day8exercises;

public class Inheritance13 {
public static void main(String[] args) {
	//AbstractDemo ad=new AbstractDemo();//throws an error that abstract methods cannot be instantiaited..
	//hence the methods cannot be accessed from the abstract method
	AbstractDemo.methodStatic();// if the method is static it can be accessed...
}
}
abstract class AbstractDemo
{
	AbstractDemo()
	{
		
	}
	public void methodDemo()
	{
		System.out.println("Method from Abstract Method....");
	}
	public static void methodStatic()
	{
		System.out.println("Method from static method...");
	}
}