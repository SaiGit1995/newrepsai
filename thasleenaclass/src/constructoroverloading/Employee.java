package constructoroverloading;

public class Employee 
{
	long EmployeeID;
	String EmployeeName;
	String Department;
	public static void main(String[] args)
	{
		Employee obj = new Employee(99878);
		//obj.Employee(98745);
	}
	Employee(long EmployeeID)
	{
		this(EmployeeID,"Sai");
		this.EmployeeID = EmployeeID;
		System.out.println(EmployeeID);
	}
	Employee(long EmployeeID,String EmployeeName)
	{
		this(EmployeeName,EmployeeID,"CS");
		this.EmployeeID = EmployeeID;
		this.EmployeeName = EmployeeName;
		System.out.println(EmployeeID);
		System.out.println(EmployeeName);
		
	}
	Employee(String EmployeeName,long EmployeeID,String Department)
	{
		this.EmployeeID = EmployeeID;
		this.EmployeeName = EmployeeName;
		this.Department = Department;
		System.out.println(EmployeeName);
		System.out.println(EmployeeID);
		System.out.println(Department);
		
	}

}
