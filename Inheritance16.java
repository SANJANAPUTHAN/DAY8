package day8exercises;

public class Inheritance16 {
	public static void main(String [] args) { 
		X x1 = new X(); 
		X x2 = new Y(); 
		Y y1 = new Y(); 
		
		//(Y)x2.do2(); //cannot typecast from parent class to child class
		} 
}
class X { void do1() { } } 
class Y extends X { void do2() { } } 



