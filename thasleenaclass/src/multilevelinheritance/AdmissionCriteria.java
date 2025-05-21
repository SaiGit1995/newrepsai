package multilevelinheritance;

public class AdmissionCriteria extends College
{
	int maths = 150;
	int science = 150;
	int computer = 200;
	public void marks()
	{
		int marks = maths+science+computer;
		if(marks>=markneededforadmission)
		{
			System.out.println("The student mark is ok for admission");
		}
		else
		{
			System.out.println("Not eligible for admission");
		}
	}
}

