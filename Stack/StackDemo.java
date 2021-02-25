package Stack;
import java.util.ArrayList;
import java.util.List;
public class StackDemo {
public static void main(String[] args) {
	FixedStack stack1=new FixedStack(10);
	stack1.push(10);
	stack1.push(20);
	System.out.println(stack1.pop());
	DynamicStack ds=new DynamicStack();
	ds.push(40);
	ds.push(90);
	System.out.println(ds.pop());
}
}
interface Stack
{
	public void push(int value);
	public int pop();
}
class FixedStack implements Stack
{
	private int capacity;
	private int top=-1;
	private int arr[];
	public FixedStack(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	public final int getCapacity() {
		return capacity;
	}

	public final void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public final int getTop() {
		return top;
	}

	public final void setTop(int top) {
		this.top = top;
	}

	public final int[] getArr() {
		return arr;
	}

	public final void setArr(int[] arr) {
		this.arr = arr;
	}

	@Override
	public void push(int value) {
		// TODO Auto-generated method stub
		if(isFull())
		{
			System.out.println("full stack..");
		}
		else
		{
			arr[++top]=value;
		}
		
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return top==capacity-1;
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("stack empty");
			return 0;
		}
		return arr[top--];
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top==-1;
	}
	
}
class DynamicStack implements Stack
{
	private List<Integer> list=new ArrayList<>();
	
	public final List<Integer> getList() {
		return list;
	}
	public final void setList(List<Integer> list) {
		this.list = list;
	}
	public DynamicStack()
	{
		new ArrayList<Integer>();
	}
	@Override
	public void push(int value) {
		list.add(value);
		
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("empty stack...");
			return 0;
		}
		int value=list.get(list.size()-1);
		list.remove(list.size()-1);
		return value;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}
	
}