package stringbuilder;

public class ReverseUsingSBuilder 
{

	public static void main(String[] args)
	{
		StringBuilder obj = new StringBuilder("Greema Sunny");
		obj.reverse();
		String s = obj.toString();
		System.out.println(s);
		
	}

}
