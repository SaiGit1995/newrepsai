package methodoverloading;

public class Calculator 
{
	public static void sum(int n1,int n2)
	{
	int add = n1+n2;
	System.out.println(add);
	}
public static float sum(float f1,float f2)
	{
	float add = f1+ f2;
	return add;
	}
public static void main(String[] args)
	{
		sum(10,12);
		System.out.println(sum(1.25f,2.35f));
	}
}
