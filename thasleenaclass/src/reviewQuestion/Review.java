package reviewQuestion;

public class Review 
{
	String name;
	float mark = 2.25f;
	static int age = 15;
	static String department = "CS";
	char c;
	public static void main(String[] args) 
	{
		Review obj = new Review();
		System.out.println(obj.display(department, 'A'));
		Review.print("Sai Krishna");
		Review.print("hari");
	}
	public String display(String s1, char c)
	{
		this.c = c;
		System.out.println(c);
		System.out.println(mark);
		return s1;
	}
	public static void print(String name)
	{
		//name = "Sai Krishna";//change cheyunnathu method agath name vilichal mathi
		name = name;
		System.out.println("The student name is "+name);
		System.out.println("The age of the student is "+age);
		System.out.println("The department he was alloted is "+department);
		System.out.println(age);
		System.out.println(name);
	}
	
}
