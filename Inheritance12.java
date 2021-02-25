package day8exercises;

public class Inheritance12 {
public static void main(String[] args) {
	C c=new C();
}
}
class A
{
	int a;
	public A(int a)
	{
		this.a=a;
		System.out.println(a);
	}
	
}
class B
{
	int b;
	B(int b)
	{
		this.b=b;
		System.out.println(b);
	}
}
class C extends A
{
	public C()
	{
		super(10);
		new B(20);
		
	}

	
}