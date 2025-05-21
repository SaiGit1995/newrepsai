package stringbuilder;

public class ConcatMultipleWord
{

	public static void main(String[] args) 
	{
		StringBuilder obj = new StringBuilder();
		String s1 = "hara ";
		String s2 = " hara";
		String s3 = " Mahadev";
		System.out.println(s1.concat(s2).concat(s3));
	}

}
