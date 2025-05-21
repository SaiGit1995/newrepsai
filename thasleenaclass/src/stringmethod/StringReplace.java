package stringmethod;

public class StringReplace {

	public static void main(String[] args) 
	{
		StringReplace obj = new StringReplace();
		obj.replace();
	}
	public void replace()
	{
		String s1 = "Sai Krishna";
		System.out.println(s1.replaceAll("Krishna", "Devi"));//first replace aavendathu second replace word enthano vendathu athu
	}

}
