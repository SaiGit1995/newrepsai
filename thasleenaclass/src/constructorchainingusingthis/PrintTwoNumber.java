package constructorchainingusingthis;

public class PrintTwoNumber 
{

	public static void main(String[] args) 
	{
		Number obj = new Number();
		obj.printing();
	}
}
	class Number
	{
	int i;
	int j;
	
		Number()
		{
			this(10,5);
			this.printing();
		}
		Number(int i,int j)
		{
			this.i=i;
			this.j=j;
			System.out.println(i+" "+j);
		}
		public void printing()
		{
			System.out.println("Constructor Chaining");
		}
	}
	


