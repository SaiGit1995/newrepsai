package constructor;

public class StudentDetails 
{
		 	String name;
		    int age;

		    StudentDetails() 
		    {
		        System.out.println("Default Constructor");
		        name = "Unknown";
		        age = 0;
		    }

		    void displayinfo() 
		    {
		        System.out.println(age + " " + name);
		    }
}



