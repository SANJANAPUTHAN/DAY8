package day8exercises;

public class Inheritance1 {
public static void main(String[] args) {
	int a=10;
	method1(a);
	String str="sanjana";
	method2(str);
	int arr[]=new int[5];
	method3(arr);
	Inheritance1 i=new Inheritance1();
	method4(i);
}

private static void method4(Inheritance1 i) {
	// TODO Auto-generated method stub
	System.out.println(i);
}

private static void method3(int[] arr) {
	// TODO Auto-generated method stub
	System.out.println(arr);
}

private static void method2(String str) {
	// TODO Auto-generated method stub
	System.out.println(str);
}

private static void method1(int a) {
	// TODO Auto-generated method stub
	System.out.println(a);
}
}
//in the above example the primitive data types are initialized and only then we can pass the values...where in case ofobjects and arrays it is sent based of the reference 