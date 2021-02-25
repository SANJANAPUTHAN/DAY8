package protectedmethoddemo2;

import protectedmethoddemo.ProtectedMethodDemo;

public class ProtectedMethodDemo2 {
public static void main(String[] args) {
	ProtectedMethodDemo p1=new ProtectedMethodDemo();
	//p1.method();//cannot access protected method from differennt package
}
}
