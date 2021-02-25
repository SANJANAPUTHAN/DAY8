package day8exercises;

public class Inheritance15 {
	public static void main(String[] args) {
	House h=new House();
	h.costcalculateDoor();
	h.costcalculateWindow();

}
}
class House
{
	int dmaterialcost=90;
	int wmaterialcost=100;
	Door d=new Door(10,20);
	Window w=new Window(30,40);
	int total=0;
	public void costcalculateDoor()
	{
		total=total+(d.getLength()*90)+(d.getBreadth()*90);
		System.out.println("door cost"+total);
	}
	public void costcalculateWindow()
	{
		total+=(w.getBreadth()*wmaterialcost)+(w.getLength()*wmaterialcost);
		System.out.println(total);
	}
}
class Door
{
	
	private int length;
	private int breadth;
	Door(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public final int getLength() {
		return length;
	}
	public final void setLength(int length) {
		this.length = length;
	}
	public final int getBreadth() {
		return breadth;
	}
	public final void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}
class Window
{
	private int length;
	private int breadth;
	Window(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public final int getLength() {
		return length;
	}
	public final void setLength(int length) {
		this.length = length;
	}
	public final int getBreadth() {
		return breadth;
	}
	public final void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}