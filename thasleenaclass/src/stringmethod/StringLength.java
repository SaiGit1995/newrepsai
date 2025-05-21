package stringmethod;

public class StringLength 
{

	public static void main(String[] args) 
	{
		StringLength obj = new StringLength();
		obj.lengthfind();
		//obj.length();
		obj.len();
		
	}
	public void length()
	{
		String s1 = "Sai Krishna";
		System.out.println(s1.length());
	}
	public void lengthfind()
	{
		String s2 = "there is a lion in the jungle and its the king of jungle";
		int count = s2.length();
		System.out.println("number of characters in the sentense "+count);
		this.length();
	}
	public void len()
	{
		String s1 = "Hare Ram";
		System.out.println(s1.length());
	}
	

}
