package aggregation;

public class Aggregationclass 
{

	public static void main(String[] args) 
	{
		Author au = new Author("Sai",28,"trivandrum");
		Book bu = new Book("Java",250,au);//au is the reference varibale for fetching the details from Author classbu.display();
		System.out.println("The name of the book is "+bu.name);
		System.out.println("The price of the book is "+bu.price);
		System.out.println("The author name is "+bu.author.name);//instance variable same aanekil then obj.intstance variable.name;
		System.out.println("At the age of "+bu.author.age);
		System.out.println("The author is from "+bu.author.place);//subclass obj.parent reference.parentclass variable
	}
}
