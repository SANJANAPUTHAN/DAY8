package day8exercises;

public class Inheritance6 {
public static void main(String[] args) {
	StaticBlockDemo demo=new StaticBlockDemo();
	demo.method1();demo.method2();
}
}
class StaticBlockDemo
{
	public void method1()
	{
		System.out.println("method1 called...");
	}
	public void method2()
	{
		System.out.println("method2 called...");
	}
	static
	{
		System.out.println("static block executed first...");
	}
}