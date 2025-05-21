package stringmethod;

public class StringConcat {

	public static void main(String[] args) 
	{
		StringConcat obj = new StringConcat();
		obj.concat();
		obj.jointwo();
	}
	public void concat()
	{
		String s1 = "Sai";
		String s2 = " Sai";
		System.out.println(s1.concat(s2));//direct printing
		System.out.println("obsqura"+" Zone");
	}
	public void jointwo()
	{
		String A1 = "hari ";
		String A2 = "priya";
		String con = A1.concat(A2);//Assign the value to the variable
		System.out.println(con);
		String A3 = " Meera";
		String conn = A2.concat(A3);
		System.out.println(conn);
	}

}
