package string;

public class Equalsof {

	public static void main(String[] args) 
	{
		Equalsof obj = new Equalsof();
		obj.equalValue();
	}
	public void equalValue()
	{
		String a = "new";
		String b = "New";
		System.out.println(a.equals(b));
	}

}
