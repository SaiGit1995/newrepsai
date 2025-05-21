package thiskeyword;

public class InstanceValueDemand 
{
	String name;//memory space and name saving takes here 
	int age;
	public static void main(String[] args) 
	{
		InstanceValueDemand obj = new InstanceValueDemand("sai",28);
		obj.newAdd();
	}
	InstanceValueDemand(String name,int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("I am a constructor");
	}
	public void newAdd()
	{
		System.out.println(age+" "+name);
	}
}


