package oneDarray;

public class FindEvenAndOdd 
{

	public static void main(String[] args)
	{
		FindEvenAndOdd obj = new FindEvenAndOdd();
		obj.evenOdd();
	}
	
	public void evenOdd()
	{
		int even = 0;
		int odd = 0;
		int i;
		int arr[] = {1,2,3,4,5,6};
		for(i=0;i<=arr.length;i++)
		{
			if(i%2==0)
			{
				even = even+1;
			}
			else
			{
				odd = odd +1;
			}
		}
		System.out.println("Number of even in the array "+even);
		System.out.println("Number of odd numbers in the array is "+odd);
		
	}

}
