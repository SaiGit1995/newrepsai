package stringbuffer;

public class NewInserting {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "Sai");
		System.out.println(sb);
	}

}
