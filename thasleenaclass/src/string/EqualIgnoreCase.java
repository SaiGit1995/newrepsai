package string;

public class EqualIgnoreCase
{

	public static void main(String[] args)
	{
		EqualIgnoreCase obj = new EqualIgnoreCase();
		obj.equalIgnore();
		/*String s1 = "Java";
		String s2 = "JAVA";
		String s3 = new String("java");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.equalsIgnoreCase(s1));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s3));*/
	}
	public void equalIgnore()
	{
		String x = "sai";
		String y = "SAI";
		String z = new String("sAi");
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x.equalsIgnoreCase(z));
	}
}
