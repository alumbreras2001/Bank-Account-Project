
public class CheckingAccount extends Account {
	
    private static double FEE = 1.1;

   
    public CheckingAccount(String accountName, double fee) {
        super(accountName, fee);
        FEE = fee;
    }

    public void deposit(double amount) {

        
        if( amount > 0) {
            balance += amount;
            System.out.printf("Amount deposited", amount);

           
            balance -= FEE;
            System.out.printf("Fee ", FEE);
            System.out.printf("Current Balance is: " +this.balance);
            
        } else {
            System.out.println("A negative amount cannot be deposited");
        }
    }

    public void withdraw(double amount) {

        
        if(amount > 0) {
            
            if((amount+FEE) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee: ",FEE);
                System.out.printf("Current Balance is: " + this.balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    
	}
	@Override
	public String toString() {
    	return "Balance is: " + this.balance;

    		
    		
    	}
    }

	
	


