package singleinheritance;

public class EmployeeDetailChild extends EmployeeSalaryDetails
{

	public static void main(String[] args) 
	{
		EmployeeDetailChild obj = new EmployeeDetailChild();
		obj.salryDetails();
		System.out.println(obj.pf);//pf value printing 
		int s = obj.pf;
		System.out.println(s);
	}
	public void salryDetails()
	{
		String name = "Sai Krishna";
		String job = "Software engineer";
		int salaryremains = salary - pf;
		System.out.println(name);
		System.out.println(pf);
		System.out.println(job);
		System.out.println("Total salary = "+totalsalary);
		System.out.println("Salary get = "+salaryremains);
	}

}
