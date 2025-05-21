package supermethod;

public class ChildSuperMethod extends SuperParentMethod
{
	void childMethod()
	{
		super.parentSuper();
		System.out.println("Child method print");
	}
}
