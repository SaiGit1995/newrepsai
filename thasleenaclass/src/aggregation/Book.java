package aggregation;

public class Book 
{
	String name;
	int price;
	Author author;
	Book(String name, int price, Author author)
	{
		this.name = name;
		this.price = price;
		this.author = author;
	}
}