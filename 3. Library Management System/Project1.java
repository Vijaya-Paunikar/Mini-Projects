import java.util.Scanner;
public class Project1
{
    public static void main(String args[]) 
	{
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while(true) 
		{
            System.out.println("**************** Library Management System ****************");
            System.out.println("Press 1. Add Book");
            System.out.println("Press 2. Issue a Book");
            System.out.println("Press 3. Return a Book");
            System.out.println("Press 4. Print complete issue details");
            System.out.println("Press 5. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) 
			{
                case 1:
                    library.add();
                    break;
                case 2:
                    library.issue();
                    break;
                case 3:
                    library.return_book();
                    break;
                case 4:
                    library.detail();
                    break;
                case 5:
                    library.exit();
                    break;
                default:
                    System.out.println("Invalid Number");
                    break;
            }

            System.out.println("Do you want to select the next option? (Y/N)");
            char option = sc.next().charAt(0);
            if (option == 'n' || option == 'N') {
                library.exit();
            }
        }
    }
}

class Library 
{
    String name,book_name, issue_date, return_date, s_name;
    int book_id,book_no,total_no;
	char option_issue;
    Scanner sc = new Scanner(System.in);

    public void add() 
	{
        System.out.println("Enter Book Name, Price and Book Number:");
        name = sc.nextLine();
        float price = sc.nextFloat();
        book_no = sc.nextInt();

        System.out.println("Your added book details are Book Name: " + name + "  Price: Rs." + price + "  Book No: " + book_no);
    }

    public void issue()
	{
		while(true)
		{
			System.out.println("Enter Book Name: ");
			book_name=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Book Id: ");
			book_id=sc.nextInt();
			sc.nextLine();
			System.out.println("Book Issue Date: ");
			issue_date=sc.nextLine();
			System.out.println("Book Return Date: ");
			return_date=sc.nextLine();

			
			System.out.println("Do you want to issue another bookagain ? (Y/N)");
            char option_issue = sc.next().charAt(0);
            if (option_issue == 'n' || option_issue == 'N')
			{
                System.exit(0);
            }	
			total_no++;
		}
		
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
			System.out.println("Student Name: "+s_name);
			System.out.println("Book Id: "+book_id);
			System.out.println("Issue Date: "+issue_date);
			System.out.println("Total Number of Book Issued: "+total_no);
			System.out.println("Book Return Date: "+return_date);
		}
		else
		{
			System.out.println("Incorrect Book Id, Please enter correct id");
		}
	}
	
	public void detail()
	{
		System.out.println("************************");
		System.out.println("Student Name: "+s_name);
		System.out.println("Book Id: "+book_id);
		System.out.println("Issue Date: "+issue_date);
		System.out.println("Total Number of Book Issued: "+total_no);
		System.out.println("Book Return Date: "+return_date);
	}
	

    public void exit() {
        System.exit(0);
    }
}

