import java.lang.*;

public class Account3 {

	public int id;
	public String name;
	public double balance;

	public Account3() {}

	public Account3(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void setid(int id) {
		this.id = id;
	}

	public int getid() {
		return id;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void show(int no) {

	}

	public void addBalance(double amount) {
		this.balance += amount;
	}

	public void withdrawBalance(double amount) 
	{
							

		if(amount<balance)
		{
			this.balance-=amount;
		}
		else {
					System.out.println("insufficient balance");

		}
		
	}

	public void transferBalance(int accno,double amount) 
	{

		
	}

	

}