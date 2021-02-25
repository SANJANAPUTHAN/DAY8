package day8exercises;

public class Inheritance4 {
public static void main(String[] args) {
	Stack stack=new Stack(10);
	stack.push(10);
	stack.push(80);
	System.out.println(stack.pop());
}
}
class Stack
{
	private int capacity;
	private int arr[];
	private int top;
	Stack(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	public void push(int value)
	{
		if(isFull())
		{
			System.out.println("array full");
			return;
		}
		
		arr[++top]=value;
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("array empty");
		}
		return arr[top--];
	}
	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	public boolean isFull()
	{
		return top==capacity-1;
	}
	
}
