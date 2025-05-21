package stringmethod;

public class StringLowerUpper {

	public static void main(String[] args) 
	{
		StringLowerUpper obj = new StringLowerUpper();
		obj.lower();
		obj.upper();
	}
	public void lower()
	{
		String s1 = "SAI";
		System.out.println(s1.toLowerCase());
	}
	public void upper()
	{
		String s2 = "sai";
		System.out.println(s2.toUpperCase());
	}

}
