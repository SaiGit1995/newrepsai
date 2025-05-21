package constructor;

public class Rectangle 
{

	public static void main(String[] args)
	{
		AreaRectangle area = new AreaRectangle();
		area.areaOfRectangle();
	}

}
class AreaRectangle
{
	int length;
	float breadth;
	AreaRectangle()
	{
		System.out.println("i am a constructor");
		length = 20;
		breadth = 5.5f;
	}
	public void areaOfRectangle()
	{
		float area = length*breadth;
		System.out.println(area);
	}
}

