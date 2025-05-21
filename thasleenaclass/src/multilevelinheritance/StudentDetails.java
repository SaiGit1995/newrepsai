package multilevelinheritance;

public class StudentDetails extends AdmissionCriteria
{
	
	public static void main(String[] args) 
	{
		StudentDetails obj = new StudentDetails();
		obj.marks();
		obj.studentDetails();
	}
	public void studentDetails()
	{
		int markss = maths+science+computer;
		String Name = "Sai Krishna BM";
		String YearOfAdmission = "2014 to 2018";
		if(markss>450)
		{
			
			System.out.println("Student name - "+Name);
			System.out.println("marks obtained = "+markss);
			System.out.println("Admission year - "+YearOfAdmission);
			System.out.println("The student is eligible for opting Computer science and Mechanical engineering");
		}
		else
		{
			System.out.println("CaN OPT OTHER COURSES");
		}
		
	}

}
