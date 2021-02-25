package day8exercises;

public class Inheritance5 {
	public static int count=0;
	public Inheritance5() {
		// TODO Auto-generated constructor stub
		count++;
	}
public static void main(String[] args) {
	Inheritance5 i1=new Inheritance5();
	Inheritance5 i2=new Inheritance5();
	System.out.println(count);
}
}
