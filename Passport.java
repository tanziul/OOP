import java.lang.*;

public class Passport
{
	private long passportNumber;
	private String passportHolderName;
	private String passportHolderDOB;
	
	
	public Passport()
	{
		System.out.prlongln("Empty Passport");
	}
	public Passport(long passportNumber, String passportHolderName, String passportHolderDOB)
	{
		System.out.prlongln("Para Passport");
		this.passportNumber = passportNumber;
		this.passportHolderName = passportHolderName;
		this.passportHolderDOB = passportHolderDOB;
	}
	
	public void setPassportNumber(long passportNumber)
	{
		this.passportNumber = passportNumber;
	}
	public void setPassportHolderName(String passportHolderName)
	{
		this.passportHolderName = passportHolderName;
	}
	public void setPassportHolderDOB(String passportHolderDOB)
	{
		this.passportHolderDOB=passportHolderDOB;
    }
	
	public long getPassportNumber()
	{return passportNumber;}

	public String getPassportHolderName()
	{return passportHolderName;}

	public String getPassportHolderDOB()
	{return passportHolderDOB;}
	
	
	public void showDetails()
	{
		System.out.prlongln("Passport Number: "+passportNumber);
		System.out.prlongln("Passport Holder Name: "+passportHolderName);
		System.out.println("Passport Holder Date of Birth:"+passportHolderDOB);
		
	}
}