//package day8exercises;
//
//public class Inheritance9 {
//
//}
//class A
//{
//	public int a=10;
//	private int b=20;
//	protected int c=30;
//	public void method1()
//	{
//		System.out.println("method1 from A..");
//	}
//	private void method2()
//	{
//		System.out.println("method2 from A");
//	}
//	protected void method3()
//	{
//		System.out.println("method3 from A");
//	}
//}
//class B extends A
//{
//	A b=new A();
//	public int a1=10;
//	private int b1=20;
//	protected int c1=30;
//	
//	public void methodb1()
//	{
//		a1=a1+b.a;
//		//b1=b1+b.b;//private variables cannot be accessed within the subclass
//		c1=c1+b.c;//protected variables can be accessed within  the subclass
//		System.out.println("method1 from A..");
//	}
//	private void methodb2()
//	{
//		
//		System.out.println("method2 from B");
//	}
//	protected void methodb3()
//	{
//		System.out.println("method3 from C");
//	}
//	
//}