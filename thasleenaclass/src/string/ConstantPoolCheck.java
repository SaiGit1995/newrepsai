package string;

public class ConstantPoolCheck 
{

	public static void main(String[] args) 
	{
		ConstantPoolCheck obj = new ConstantPoolCheck();
		obj.constant();
		String s1="java";//literal format-------------constant pool
		String s2 = "java";
		
		String s3 = new String("java");//heap memory storage saved in different format
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
	public void constant()
	{
		String s1 = "Sai";
		String s3 = "Saii";
		String s2 = new String("Sai");
		System.out.println(s1==s2);//Saved in different memory space 
		System.out.println(s1==s3);//saved in constant pool so just point the s3 to s1 position
	}

}
