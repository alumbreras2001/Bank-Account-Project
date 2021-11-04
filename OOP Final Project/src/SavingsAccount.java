
public class SavingsAccount extends Account {
	
	
	private double interestRate;
	
	
	
	public SavingsAccount(String accountName, double interestRate) {
		super(accountName,interestRate);
		this.interestRate = interestRate;
	}
	
	
	public double getinterestRate() {
        return this.interestRate;
    }

    public void setinterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calcInterest() {
        return balance * interestRate;
    }

    public void applyInterest() {
        double interest = calcInterest();
        System.out.printf("Interest amoun added to balance", interest);
        deposit(interest);
	
    }
		
		 public void deposit(double amount) {

		        
		        if (amount > 0) {
		            balance += amount;
		            System.out.printf("Amount %.2f deposited", amount);
		            System.out.printf("Current Balance is: %.2f%n", balance);

		        } else {
		            System.out.println("A negative amount cannot be deposited");
		        }
	
	}
	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
            
            if ((amount) <= balance) {
                System.out.printf("Amount of %.2f withdrawn", amount);
                balance -= amount;
                System.out.printf("Current Balance is: %.2f", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn");
        }
    }

	
	@Override
	public String toString() {
		return "Savings Account : " + this.balance;
	
		
	
		
	}

}
