package stringbuilder;

public class PlindromeUsingSB 
{

	public static void main(String[] args) 
	{
		StringBuilder sb = new StringBuilder("kayak"); 
		String s1 = sb.toString();
		System.out.println(s1);
		sb.reverse();
		String s2 = sb.toString();
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		if(s1.equals(s2))//s1==s2 only compare the location not the value
		{
			System.out.println("it's Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
	}

}
