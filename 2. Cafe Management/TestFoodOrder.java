import java.util.Scanner;
class FoodOrder
{
	// first lets declare our variables for prices of food items
	int frenchFries=100;
	int burger=120;
	int pastry=100;
	int pizza=200;
	int coldcoffee=100;
	int coldrink=80;
	int icedtea=80;
	int choice;
	int quantity;
	static int total;
	String again;
	
	Scanner sc=new Scanner(System.in);
	
	// Lets create a method for displaying our food menu
	public void displayMenu()
	{
		System.out.println("************* Welcome to our Cafe **************");
		System.out.println("================================================");
		System.out.println("  SNo   Menu                 Price  ");
		System.out.println("  1.    French Fries         100/-  ");
		System.out.println("  2.    Burger               120/-  ");
		System.out.println("  3.    Pastry               100/-  ");
		System.out.println("  4.    Pizza                200/-  ");
		System.out.println("  5.    Coldcoffee           100/-  ");
		System.out.println("  6.    Cold Drinks           80/-  ");
		System.out.println("  7.    Iced Tea              80/-  ");
		System.out.println("  8.    Exit                        ");
		System.out.println("================================================");
		System.out.println("What Do You Want to Order Today?");
	}
	
	//we need a method to generate Bill
	public void generateBill()
	{
		System.out.println();
		System.out.println("*********** Thank You for Ordering *************");
		System.out.println("*********** Your Bill is : "+total+" ***********");
	}
	
	// Creating a method to order a food items
	public void order()
	{
		while(true)
		{
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			
			switch (choice)
			{
				case 1: //French Fries
					System.out.println("You have Selected French Fries.");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total= total + (quantity * frenchFries);
					break;
				
				case 2: //Burger
					System.out.println("You have Selected Burger");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total= total + (quantity * burger);
					break;
				
				case 3: //Pastry
					System.out.println("You have Selected Pastry");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total= total + (quantity * pastry);
					break;
				
				case 4: //Pizza
					System.out.println("You have Selected Pizza");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total = total + (quantity * pizza);
					break;
				
				case 5: //Cold Coffee
					System.out.println("You have Selected Cold Coffee");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total = total + (quantity * coldcoffee);
					break;
				
				case 6: //Cold Drinks
					System.out.println("You have Selected Cold Drinks");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total = total + (quantity * coldrink);
					break;
			
				case 7: //Iced Tea
					System.out.println("You have Selected Iced Tea");
					System.out.println();
					System.out.print("Enter the desired Quantity: ");
					quantity=sc.nextInt();
					total= total + (quantity * icedtea);
					break;
				
				case 8: //Exit
					System.exit(1);
					break;
			
				default:
					System.out.println("Out of Cafe's Menu");
					break;		
			}
			sc.nextLine();
			System.out.print("Do you want to order anything else (Y/N): ");
			again=sc.nextLine();
			
			if(again.equals("NO")|| again.equals("No") || again.equals("no") || again.equals("n") || again.equals("N"))
			{
				generateBill();
				System.exit(1);
				// displayMenu();
				// order();
			}
			else if(again.equals("YES")|| again.equals("Yes") || again.equals("yes") || again.equals("y") || again.equals("Y"))
			{
				System.out.println("Please select food item from menu");
				System.out.println("------------------------------------------");
				displayMenu();
				order();
			}
			else
			{
				generateBill();
				System.exit(1);
			}
		}
	}
}
public class TestFoodOrder
{
	public static void main(String args[])
	{	
		FoodOrder food=new FoodOrder();
		food.displayMenu();
		food.order();
		food.generateBill();
	}
}

