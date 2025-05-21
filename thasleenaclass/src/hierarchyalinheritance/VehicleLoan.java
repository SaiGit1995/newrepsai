package hierarchyalinheritance;

public class VehicleLoan extends CustomerParent
{
	public void vehicle()
	{
		if(cibil>650)
		{
			System.out.println(customernumber);
			System.out.println("Eligible for vehicle loan");
		}
		else
		{
			System.out.println(customernumber);
			System.out.println("Not eligible");
		}
	}
	public static void main(String[] args) 
	{
		VehicleLoan obj = new VehicleLoan();
		obj.vehicle();
		GoldLoan gold = new GoldLoan();//create each obj for each ChildDetails class so that it can access
		gold.gold();
	}

}
