package day8exercises;

public class Inheritance2 {
public static void main(String[] args) {
	ComplexNumbers number1=new ComplexNumbers(5, 10);
	ComplexNumbers number2=new ComplexNumbers(3,2);
	ComplexNumbers result=ComplexNumbers.sum(number1,number2);
	System.out.println("The result is : "+result.real+"+ "+result.img+"i");
}
}
class ComplexNumbers
{
	int real;
	int img;
	ComplexNumbers(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	static ComplexNumbers sum(ComplexNumbers num1,ComplexNumbers num2)
	{
		ComplexNumbers temp=new ComplexNumbers(0, 0);
		temp.real=num1.real+num2.real;
		temp.img=num1.img+num2.img;
		return temp;
	}
}
