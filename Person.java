import java.lang.*;

public class Person
{
	private long NID;
	private Passport passport;
	
	public Person()
	{
		System.out.println("Empty Person");
	}
	public Person(long NID, passport passport)
	{
		System.out.println("Para Person");
		this.NID= NID;
		this.passport = passport;
	}
	public void setNID(long NID)
	{
		this.NID = NID;
	}
	public void setpassport(passport passport)
	{
		this.passport = passport;
	}
	public String getNID(){return NID;}
	public passport getpassport(){return passport;}
	
	public void showDetails()
	{
		System.out.println("NID Number: "+NID);
		
		passport.showDetails();
		
	}
} 