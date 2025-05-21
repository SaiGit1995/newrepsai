package stringmethod;

public class SubString 
{

	public static void main(String[] args) 
	{
		SubString obj = new SubString();
		obj.SubStrings();
	}
	SubString()
	{
		String s1 = "Obsqura Zone";
		System.out.println(s1.substring(5));
	}
	public void SubStrings()
	{
		String s2 = "Mobilezone";
		System.out.println(s2.substring(4, 6));
		
	}

}
