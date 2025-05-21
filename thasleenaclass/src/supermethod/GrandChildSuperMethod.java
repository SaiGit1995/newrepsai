package supermethod;

public class GrandChildSuperMethod extends ChildSuperMethod
{

	public static void main(String[] args) 
	{
		GrandChildSuperMethod obj = new GrandChildSuperMethod();
		obj.grandchildSuper();
	}
	void grandchildSuper()
	{
		super.childMethod();
		System.out.println("GrandChild Super method");
	}

}
