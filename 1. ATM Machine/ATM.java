import java.util.HashMap;
import java.util.Scanner;

public class ATM 
{
    public static void main(String args[]) 
	{
        AtmOp obj = new AtmOp();
    }
}

class Data 
{
    float balance;
}

class AtmOp 
{
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Data> map = new HashMap<>();

    AtmOp() 
	{
        System.out.println("******************************************************");
        System.out.println("WELCOME TO OUR ATM!");
        op();
    }

    public void menu(Data obj) 
	{
        System.out.println("******************************************************");
        System.out.println("Please enter a valid number between 1 to 5:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Another Account");
        System.out.println("5. Exit");

        int input = sc.nextInt();

        switch (input) 
		{
            case 1:
                balance(obj);
                break;
            case 2:
                deposit(obj);
                break;
            case 3:
                withdraw(obj);
                break;
            case 4:
                op();
                break;
            case 5:
                System.out.println("Thank you for using ATM!");
                break;
            default:
                System.out.println("Please enter a valid number");
                menu(obj);
                break;
        }
    }

    public void balance(Data obj) 
	{
        System.out.println("******************************************************");
        System.out.println("Your balance: " + obj.balance);
		System.out.println("******************************************************");
		menu(obj);
    }

    public void deposit(Data obj) 
	{
        System.out.println("******************************************************");
        System.out.println("Enter Amount to be Deposited:");
        float amount = sc.nextFloat();

        obj.balance = obj.balance + amount;
        System.out.println("Amount Deposited Successfully!");
		System.out.println("******************************************************");
		menu(obj);
    }

    public void withdraw(Data obj) 
	{
        System.out.println("Enter Amount to be Withdrawn:");
        float withdrawAmount = sc.nextFloat();

        if (withdrawAmount > obj.balance) 
		{
            System.out.println("Insufficient balance!");
			System.out.println("******************************************************");
        } 
		else 
		{
            obj.balance = obj.balance - withdrawAmount;
            System.out.println("Amount Withdrawn Successfully!");
			System.out.println("******************************************************");
        }
		menu(obj);
    }

    public void op() 
	{
        System.out.println("******************************************************");
        System.out.println("Enter your Pin:");
        int pin = sc.nextInt();

        if (map.containsKey(pin)) 
		{
            Data obj = map.get(pin);
            menu(obj);
        } 
		else 
		{
            System.out.println("******************************************************");
            System.out.println("Please first create an account");
            System.out.println("Set your pin code");
            pin = sc.nextInt();
            Data obj = new Data();
            map.put(pin, obj);
            menu(obj);
        }
    }
}
