package constructoroverloading;

public class ConstOverLoad 
{
	int age=25;
	String name;
	String work;
	String place;
	public static void main(String[] args) 
	{
		ConstOverLoad obj = new ConstOverLoad();
		//ConstOverLoad obj2 = new ConstOverLoad("Sai");
		//ConstOverLoad obj3 = new ConstOverLoad("Test Engineer","Kran");
	}
	ConstOverLoad()
	{
		this("Sai","place");//constructor chaining
		//this.age =age;//
		System.out.println(age);
	}
	ConstOverLoad(String name)
	{
		this.name = name;
		System.out.println(name);
	}
	ConstOverLoad(String work,String place)
	{
		this.work = work;
		this.place = place;
		System.out.println(work);
		System.out.println(place);
	}
}
