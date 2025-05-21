package supervariable;

public class ChildVariable extends ParentVariable
{
	String name = "Rahul";
	void childVariable()
	{
		this.name = name;
		System.out.println(super.name);
		System.out.println(name);
	}
}
