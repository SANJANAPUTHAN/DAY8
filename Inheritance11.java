package day8exercises;

public class Inheritance11 {
public static void main(String[] args) {
	Haaris h[]=new Haaris[5];
	for(int i=0;i<5;i++)
	{
		h[i]=new HaarisNothing();
	}
	h[1]=new HaarisInfoTech();
	h[2]=new HaarisTechnologies();
	h[3]=new HaarisPharma();
	for(int i=0;i<5;i++)
	{
	h[i].usecase();
	}
}
	
}
abstract class Haaris
{
	public abstract void usecase();
}
class HaarisNothing extends Haaris
{

	@Override
	public void usecase() {
		// TODO Auto-generated method stub
		System.out.println("i do nothing...");
	}
	
}
class HaarisInfoTech extends Haaris
{

	@Override
	public void usecase() {
		// TODO Auto-generated method stub
		System.out.println("i am HaarisInfoTech");
	}
	
}
class HaarisTechnologies extends Haaris
{

	@Override
	public void usecase() {
		// TODO Auto-generated method stub
		System.out.println("I am HaarisTechnologies...");
		
	}
	
}
class HaarisPharma extends Haaris
{

	@Override
	public void usecase() {
		// TODO Auto-generated method stub
		System.out.println("I am HaarisPharma...");
		
	}
	
}