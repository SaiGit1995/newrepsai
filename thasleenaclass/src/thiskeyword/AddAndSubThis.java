package thiskeyword;

public class AddAndSubThis 
{
	public static void main(String[] args) 
	{
		Calculation sumsub = new Calculation(10,15);
		sumsub.sub();
	}
}
	class Calculation
	{
		int n1,n2;
		Calculation(int n1,int n2)
		{
			this.n1=n1;
			this.n2=n2;
			int sum = n1+n2;
			System.out.println(sum);
		}
		public void sub()
		{
			n1=20;
			n2=5;
			int sub = n1-n2;
			System.out.println(sub);
		}
	}

