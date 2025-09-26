import java.lang.*;
public class Account1 {
	
	private String accountName;
	private int accountNo;
	private double balance;
	private double amount;
	
	public Account1(){}
	
	public Account1(String accountName,int accountNo,double balance){
		
		this.accountName=accountName;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	
	public void setAccountNmae(String accountName)
	
	{
		this.accountName= accountName;
	}
	public String getAccount1Name()
	{
		return accountName;
	}
	
    public void setAccountNo(int accountNo)

	{ 
	this.accountNo= accountNo;
	}	
	
	public int getAccountNo()
	{
		return accountNo;
	}
   public void setbalance(double balance)
   {
	this.balance= balance;
   }
   public double getBalance()
   {return balance;}
   
   public void show(){
	   System.out.println("accountName="+accountName); 
	   System.out.println("accountNo="+accountNo);
	   System.out.println("balance="+balance);
	   
   }
   public void setAmount(double amount)
   {this.amount=amount;}
   
   public void addbalance(double amount)
   {
	   this.balance=+amount;
   }
   public void withdrawBalance(double amount) 
   {
		
   if (amount > balance)
        System.out.println("\nInsufficient Balance");
   else 
   {
	   this.balance = balance - amount;
		
	}
	
	
		public void transfer(Account no, double amount)
	{
		 if(this.balance > amount) 
		 
        no.balance += amount;
		
		{ this.balance -= amount;}
		
        System.out.println("Transaction Done");
    
    else 
	{
        System.out.println("Insufficient Amount");
    }
	  }

}


   
}
