package InterfaceDemo;

public class InterfaceDemo {
public static void main(String[] args) {
	subclass sc=new subclass();
//	sc.function();
//	sc.function1();sc.function2();
//	sc.method();
//	sc.method1();
//	sc.method2();sc.newmethod();
	sc.subclassmethod1(sc);
	sc.subclassmethod2(sc);
	sc.subclassmethod3(sc);
	sc.subclassmethod4(sc);
}
}
interface interface1
{
	public void method1();
	public void method2();
}
interface interface2
{
	public void function1();
	public void function2();
	
}
interface interface3
{
	public void method();
	public void function();	
}
interface interface4 extends interface1,interface2,interface3
{
	public void newmethod();
}
class superclass
{
	public void superclassmethod() {
		System.out.println("i am super class method...");
	}
}
class subclass extends superclass implements interface4
{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(" i am method1...");
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println(" i am method2...");
	}

	@Override
	public void function1() {
		// TODO Auto-generated method stub
		System.out.println(" i am function1...");
		
	}

	@Override
	public void function2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println(" i am function2...");
	}

	@Override
	public void function() {
		// TODO Auto-generated method stub
		System.out.println(" i am function...");
		
	}

	@Override
	public void newmethod() {
		// TODO Auto-generated method stub
		System.out.println(" i am newmethod...");
		
	}
	public void subclassmethod1(interface1 i1)
	{
		System.out.println("i am interface object 1"+i1);
	}
	public void subclassmethod2(interface1 i2)
	{
		System.out.println("i am interface object 1"+i2);
	}
	public void subclassmethod3(interface1 i3)
	{
		System.out.println("i am interface object 1"+i3);
	}
	public void subclassmethod4(interface1 i4)
	{
		System.out.println("i am interface object 1"+i4);
	}
	
}