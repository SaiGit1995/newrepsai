package oneDarray;

public class DuplicateInArray 
{

	public static void main(String[] args) 
	{
		DuplicateInArray obj = new DuplicateInArray();
		obj.duplicate();
	}
	public void duplicate()
	{
		int[] arr = {1, 2, 3, 2, 4, 3};
		int n = arr.length;
		boolean[] visited = new boolean[n];
		  System.out.print("Duplicate elements: ");
		for(int i=0;i<=n;i++)
		{
			if(!visited[i])
			{
				for(int j=i+1;j<n;j++)
				{
					if (arr[i] == arr[j])
							{
						 System.out.print(arr[i] + " ");
							}
				}
			}
			 visited[i] = true;
		}
	}

}
