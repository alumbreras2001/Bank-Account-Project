import java.util.*;
public  class Account {

	//account customer Name
	private String accountName;
	
	protected double balance;
	
	
    public Account(String accountName, double balance) {
    	
    	if(balance<0) {
    		System.out.println("balance cannot be less than zero.");
    	}else {
    		this.accountName=accountName;
    		this.balance=balance;
    		
    	}
    }
    
    public String getAccountName() {
    	return accountName;
    }
    public void setAccountName() {
    	this.accountName=accountName;
    }
    public double getBalance() {
    	return balance;
    }
    public void setBalance() {
    	this.balance = balance;
    }
    public void withdraw(double amount) {
    	if(amount >0) {
    		if(amount<=this.balance) {
    			this.balance-=amount;
    		System.out.println("Withdraw is completed, Current balance: " + this.balance);
    	}else {
    		System.out.println("There are not enough funds in your account");
    		System.out.println("Current balance: " + this.balance);
    	}
    	}else {
    		System.out.println("amount has to be larger than 0");
    		
    		
    	}
    }
    
    public void deposit(double amount)
    {
    	if(amount>0) {
    		this.balance+=amount;
    		System.out.println("Deposit is completed, Current balance: " + this.balance);
    	}else {
    		System.out.println("amount has to be larger than 0");
    	}
    }
@Override
    public String toString() {
    	return "Name: " + this.accountName +"Balance is: " + this.balance;
    }
}
