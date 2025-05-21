package hierarchyalinheritance;

public class GoldLoan extends CustomerParent
{
	public void gold()
	{
		if(cibil>=700)
		{
			System.out.println(customernumber);
			System.out.println("Eligible for gold loan");
		}
		else
		{
			System.out.println(customernumber);
			System.out.println("Not Eligible");
		}
	}
}
