package thiskeyword;

public class TwoInstancethis 
{
	public static void main(String[] args) 
	{
		//numbers obj = new numbers();
		//star onj1 = new star();
		//onj1.reverseStar();
		System.out.println("gree");
		New.main(args);//It’s like calling any other static method — Java doesn’t treat main() 
		//as sacred once inside your code; it’s just a method!
	}
	
}
class New
{
	public static void main(String[] args)
	{
		System.out.println("sai");
	}
}
	/*class numbers
	{
		int i;
		
		numbers()
		{
			for(i=1;i<=21;i++)
			{
				System.out.println(i);
			}
			System.out.println();
		}
	}
	class star
	{
		int i,j;
		star()
		{
			for(i=1;i<=5;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
		public void reverseStar()
		{
			int i,j;
			for(i=1;i<=5;i++)
			{
				for(j=5;j>=i;j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}*/
	

