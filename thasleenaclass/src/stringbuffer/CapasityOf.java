package stringbuffer;

public class CapasityOf {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("hello");//default space + hello = 16+5 = 21
		System.out.println(sb.capacity());
		sb.append("there is no space in the value given");
		System.out.println(sb.capacity());
		
	}
	

}
