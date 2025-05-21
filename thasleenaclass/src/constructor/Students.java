package constructor;

/*class Studentsdetails
{
    String name;
    int age;

    Studentsdetails() 
    {
        System.out.println("Default Constructor");
        name = "Unknown";
        age = 0;
    }

    void displayinfo() 
    {
        System.out.println(age + " " + name);
    }
}*/

public class Students
{
    public static void main(String[] args) 
    {
    	StudentDetails stu = new StudentDetails();
        stu.displayinfo();
    }

}