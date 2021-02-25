package day8exercises;

public class Inheritance8 {

	public static void main(String[] args) {
		int a=20;
		Singleton s=Singleton.getNumber(20);
		System.out.println(s.a);
	}
}
class Singleton
{
	public static int a;
	private Singleton(int value)
	{
		a=value;
	}
	public static Singleton getNumber(int number)
	{
		return new Singleton(number);
	}
}