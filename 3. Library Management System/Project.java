import java.util.Scanner;
class Library
{
	static String name,issue_date,return_date,s_name;
	static int book_id,total_no;
	Scanner sc=new Scanner(System.in);
	public void add()
	{
		System.out.println("Enter Book Name, Price and Book Number:");
		name=sc.nextLine();
		float price=sc.nextFloat();
		int book_no=sc.nextInt();
		
		System.out.println("Your added book details is "+ name + price + book_no);
	}
	
	public void issue()
	{
		System.out.print("Enter Book Name: ");
		name=sc.nextLine();
		System.out.print("Enter Book Id: ");
		book_id=sc.nextInt();
		sc.nextLine();
		System.out.print("Book Issue Date: ");
		issue_date=sc.nextLine();
		System.out.print("Total number of book you have issued: ");
		total_no=sc.nextInt();	
		sc.nextLine();
		System.out.print("Return Book Date: ");
		return_date=sc.nextLine();
	}
	
	int getId()
	{
		return book_id;
	}
	
	public void return_book()
	{
		System.out.print("Enter Student Name: ");
		s_name=sc.nextLine();
		System.out.println("Enter Book Id: ");
		int issue_book_id=sc.nextInt();
		
		if(book_id == issue_book_id)
		{
			System.out.println("*********** Total Details *************");
			System.out.print("Book Name: "+Library.book_no);
			System.out.print("Book Id: "+Library.book_id);
			System.out.print("Issue Date: "+Library.issue_date);
			System.out.print("Total Number of Book Issued: "+Library.total_no);
			System.out.print("Book Return Date: "+Library.return_date);
		}
		else
		{
			System.out.println("Incorrect Book Id, Please enter correct id");
		}
	}
	
	public void detail()
	{
		System.out.println("************************");
		System.out.print("Book Name: "+Library.book_no);
		System.out.print("Book Id: "+Library.book_id);
		System.out.print("Issue Date: "+Library.issue_date);
		System.out.print("Total Number of Book Issued: "+Library.total_no);
		System.out.print("Book Return Date: "+Library.return_date);
	}
	
	public void exit()
	{
		System.exit(0);
	}

}
public class Project
{
	public static void main(String args[])
	{
		do
		{
			System.out.println("**************** Library Management Sytem ****************");
			System.out.println("Press 1.Add Book");
			System.out.println("Press 2.Issue a Book");
			System.out.println("Press 3.Return a Book");
			System.out.println("Press 4.Print complete issue deteails");
			System.out.println("Press 5.Exit");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any Number: ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					Library obj=new Library();
					obj.add();
					break;
				case 2:
					Library obj1=new Library();
					obj1.issue();
					break;
				case 3:
					Library obj2=new Library();
					obj2.return_book();
					break;
				case 4:
					Library obj3=new Library();
					obj3.detail();
					break;
				case 5:
					Library obj4=new Library();
					obj4.exit();
					break;
				deafult:
					System.out.println("Invalid Number");
					break;		
			}
			System.out.println("You want to select next option Y/N");
			String option=sc.next().charAt(0);
			while(option== 'y' || option=='Y');
			if(option== 'n' || option=='N')
			{
				Library z=new Library();
				z.exit();
			}
			
		}
	}
}
		
