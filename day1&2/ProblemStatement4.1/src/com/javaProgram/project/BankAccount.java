package com.javaProgram.project;

public class BankAccount {
	
	  int account_number;
	    String name;
	    String account_type;
	    double balance;
	   
	    public void getAccount_number() {
	        System.out.println("Account number : "+account_number);
	    }
	   
	    public void setAccount_number(int account_number) {
	        this.account_number = account_number;
	    }
	   
	    public void getName() {
	        System.out.println("name of customer: "+ name);;
	    }
	   
	    public void setName(String name) {
	        this.name = name;
	    }
	   
	    public void getAccount_type() {
	        System.out.println("Account type: "+account_type); 
	    }
	   
	    public void setAccount_type(String account_type) {
	        this.account_type = account_type;
	    }
	   
	    public double getBalance() {
	       
	        if( balance < 1000)
	        {
	        try
	        {   
	            throw new NumberFormatException();
	        }
	        catch(NumberFormatException nw)
	        {
	            System.out.println("Balance is low : "+balance);
	            System.out.println();
	        }
	        }
	       
	       
	        return balance;
	       
	    }
	    public void setBalance(double balance) {
	        this.balance = balance;
	    }//end setter and getter

	    public BankAccount() {
	       
	        this.account_number = 1005675446;
	        this.name = "Ankita";
	        this.account_type = "Saving";
	        this.balance = 500;
	    }
	   
	   
	   
	   
	    public BankAccount(int account_number, String name, String account_type,
	            double balance) {
	       
	        this.account_number = account_number;
	        this.name = name;
	        this.account_type = account_type;
	        this.balance = balance;
	    }
	    
	    String CustomerDetails() {
	    	return name + account_number +account_type + balance ;
	    	
	    	
	    }
	    void deposit(double amt)
	    {
	        if(amt<0)
	        {
	            try
	            {
	                throw new NumberFormatException();
	            }
	            catch(NumberFormatException nf)
	            {
	                System.out.println("Negaive Amount cant be deposited");
	            }
	        }
	        else
	        {
	            balance=getBalance()+amt;
	            System.out.println("Current balance is ="+balance);
	            
	           
	        }
	       
	       
	       
	    }
	     public void withdraw(double amt){
	         if(amt>getBalance())
	            {
	        	 
	                try
	                {
	                    throw new NumberFormatException();
	                    
	                }
	                catch(NumberFormatException nf)
	                {
	                    System.out.println("WE CANT DEPOSITE AMOUNT INSUFFICENT BALANCE ");
	                }
	            }
	            else
	            {
	                balance=getBalance()-amt;
	                System.out.println("Current balance is ="+balance);
	               
	            }  
	    }
	     
	     void display()
	     {
	    System.out.println("Balance is = "+getBalance());   
	     }
	   
	   
	   
	   
	    public static void main(String[] args) {
	       
	       
	        BankAccount bank=new BankAccount();
	        bank.getAccount_number();
	       System.out.println();
	       
	       bank.getAccount_type();
	        System.out.println();
	        
	        bank.getName();
	       System.out.println();
	       
	       bank.deposit(2000);
	       bank.display();
	        System.out.println();
	        
	        bank.withdraw(500);
	        bank.display();
	        System.out.println();
	        
	        bank.withdraw(1000);
	        bank.getBalance();
	        bank.display();
	       
	       
	       
	    }
	   

}
