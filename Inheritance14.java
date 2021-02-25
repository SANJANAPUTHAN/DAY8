package day8exercises;

public class Inheritance14 {
public static void main(String[] args) {
	Student s=new Student("Sanjana",21);
	Marks mark=new Marks(90,80,90);
	Result result=new Result();
	System.out.println(result.calculateMarks(mark));
}
}
class Student
{
	Student()
	{
		
	}
	private String name;
	private int rollno;
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final int getRollno() {
		return rollno;
	}
	public final void setRollno(int rollno) {
		this.rollno = rollno;
	}
}
class Marks extends Student
{
	Marks()
	{
		
	}
	
	private int phyMarks;
	private int chemMarks;
	private int mathsMarks;
	public Marks(int phyMarks,int chemMarks,int mathsMarks)
	{
		
		this.phyMarks=phyMarks;
		this.chemMarks=chemMarks;
		this.mathsMarks=mathsMarks;
		
	}
	public final int getPhyMarks() {
		return phyMarks;
	}
	public final void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public Marks(String name, int rollno) {
		super(name, rollno);
		// TODO Auto-generated constructor stub
	}
	public final int getChemMarks() {
		return chemMarks;
	}
	public final void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	public final int getMathsMarks() {
		return mathsMarks;
	}
	public final void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	
}
class Result extends Marks
{
	Result(){
		
	}
	public Result(int phyMarks, int chemMarks, int mathsMarks) {
		super(phyMarks, chemMarks, mathsMarks);
		// TODO Auto-generated constructor stub
	}
	private int totalMarks;
	public int calculateMarks(Marks m)
	{
		totalMarks=m.getPhyMarks()+m.getChemMarks()+m.getMathsMarks();
		return totalMarks;
	}
	
}