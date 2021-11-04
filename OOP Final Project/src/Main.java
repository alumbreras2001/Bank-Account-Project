import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MyFrame myFrame = new MyFrame();
		
		 Scanner scan = new Scanner(System.in);
		 int choice;
		 boolean quit =false;
		 
		 String accountName;
		 double currentBalance;
		 
		 System.out.println("Account Name:");
		 accountName=scan.nextLine();
		 
		 System.out.println("Current Balance: ");
		 currentBalance=scan.nextDouble();
		 
	  Account account =new Account(accountName, currentBalance);
	  SavingsAccount saccount=new SavingsAccount(accountName, currentBalance);
	  
	
		 
		 while(!quit) {
			 printMenu();
			 choice= scan.nextInt();
			 switch(choice) {
			 
			 case 1:
				 System.out.printf("Enter amount to be deposited in Savings Account");
				saccount.deposit(scan.nextDouble());
				 break;
				 
			 case 2:
				 System.out.printf("Enter amount to be withdrawn from Savings Account");
					saccount.withdraw(scan.nextDouble());

			 
			 case 3:
				 System.out.printf("Enter amount to be deposit: ");
				 account.deposit(scan.nextDouble());
				 break;
			
			 case 4:
				 System.out.printf("Enter amount to be Withdrawn: ");
				 account.withdraw(scan.nextDouble());
				 break;
				 
			 case 5:
				 quit=true;
				 break;
				 default:
					 System.out.println("invalid choice.");
					 break;
			 }
		 
		 System.out.println();
	}while(!quit);
	System.out.println("Thank you for your service");
		 scan.close();
	}
		 
		 private static int menu(Scanner scan) {
		
		return 0;
	}
//Prints menu options
		public static void  printMenu() {
		        System.out.println("Bank Account Menu");
		       System.out.println("1. Savings account deposit");
		       System.out.println("2. Savings account Withdraw");
		        System.out.println("3. Deposit Funds");
		        System.out.println("4. Withdraw Funds");
		        System.out.println("5. Quit");

		        int choice;

		        
		    }    
		}
		 