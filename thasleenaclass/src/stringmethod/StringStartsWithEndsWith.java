package stringmethod;

public class StringStartsWithEndsWith 
{

	public static void main(String[] args) 
	{
		StringStartsWithEndsWith obj = new StringStartsWithEndsWith();
		obj.startsWith();
		obj.endsWith();
		obj.nillSearch();
	}
	public void startsWith()
	{
		String s1 = "sai";
		System.out.println(s1.startsWith("S"));//case sensitive
	}
	public void endsWith()
	{
		String s2 = "Hai";
		System.out.println(s2.endsWith("i"));
	}
	public void nillSearch()
	{
		String s3 = "NO";
		System.out.println(s3.startsWith("n"));
				
	}

}
