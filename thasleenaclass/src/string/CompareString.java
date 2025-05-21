package string;

public class CompareString 
{

	public static void main(String[] args) 
	{
		CompareString obj = new CompareString();
		obj.words();
		obj.compare();
	}
	public void words()
	{
		String s1 = "addSai";
		String s2 = "addSai";
		System.out.println(s1.compareTo(s2));
	}
	public void compare()
	{
		String a = "greema";
		String b = "greema";
		System.out.println(a.compareTo(b));
	}

}
