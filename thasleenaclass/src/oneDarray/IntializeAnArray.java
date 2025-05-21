package oneDarray;

public class IntializeAnArray 
{

	public static void main(String[] args) 
	{
		ArrayStudy obj = new ArrayStudy();
	}
}
class ArrayStudy
{
	int i;
	ArrayStudy()
	{
		this.largest();
		int sum = 0;
		int arr[] = {5,4,3,2,1};
		for(i=0;i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		System.out.print("The sum of the array is "+sum);
		
	}
	public void largest()
	{
		System.out.println("The array elements are");
		int arr[] = {50,10,70};
		int max = arr[0];
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			
		}
		System.out.println("The largest number is "+max);
	}

}

	

