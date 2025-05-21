package stringmethod;

public class StringChar 
{

	public static void main(String[] args) 
	{
		StringChar obj = new StringChar();
		obj.charSearch();
		obj.searchChar();
		obj.search();
		searching();
	}
	public void charSearch()
	{
		String s1 = "Sai";
		System.out.println(s1.charAt(2));
	}
	public void searchChar()
	{
		String s2 = "Hari";
		System.out.println(s2.charAt(0));
	}
	public void search()
	{
		String s3 = "nandhana";
		System.out.println(s3.charAt(3));
	}
	public static void searching()
	{
		String s4 = "Greema";
		System.out.println(s4.charAt(0));
	}

}
