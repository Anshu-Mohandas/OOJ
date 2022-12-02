import java.util.Scanner;
class Book
{
	String name,author;
	double price;
	int num_pages;
	Book()
	{
		name="";
		author="";price=0.0;num_pages=0;
	}
	void set()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of the book:");
		name=s.nextLine();
		System.out.println("Enter the author of the book:");
		author=s.nextLine();
		System.out.println("Enter the price of the book:");
		price=s.nextDouble();
		System.out.println("Enter the number of pages:");
		num_pages=s.nextInt();
	}
	
	
	public String toString()
		{
			return("Name:"+name+"\nAuthor:"+author+"\nPrice:"+price+"\nNumber of pages:"+num_pages);
		}
	
}

class Lab3
{
	public static void main(String arr[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of books:");
		int n=s.nextInt();
		Book books[]=new Book[n];
		for (int i=0;i<n;i++)
		{
			books[i]=new Book();
			books[i].set();
			System.out.println("Book details:\n");
			System.out.println(books[i]);
		}
	}
}
		
		
		