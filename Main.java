import java.lang.*;
import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
           System.out.println("*******************************************************************************");
           System.out.println("*******************************************************************************");
           System.out.println("                            Welcome to DHAKA Bank                       ");
           System.out.println("*******************************************************************************");
           System.out.println("*******************************************************************************");
       
       Scanner input = new Scanner (System.in);
       System.out.print("The Amount of accounnt you want to make -");
       int Acco= input.nextInt();
        Account accounts[] = new Account[Acco];
         for(int i =0;i<Acco;i++)
        {
            System.out.print("Slsect your option ");
      
        System.out.println("1.Savings Accounts \n 2. Fixed Account");
        int opt = input.nextInt();
           
            if(opt==1){
               
        	System.out.print("Account Holder Name :");
        	input.nextLine();
        	String name =input.nextLine();

        	System.out.print("Accout No :");
        	int AccountNo = input.nextInt();

        	System.out.print("Balance:");
        	double balance = input.nextDouble();

        	System.out.print("Interest Rate :");
        	double interestRate = input.nextDouble();
            input.nextLine();

        	accounts[i] = new SavingsAccount(AccountNo,name,balance,interestRate);

            System.out.println("Total Balance :"+(((balance*interestRate)/100)+balance));
        }

        else if (opt==2){
        	System.out.print("Account Holder Name :");
        	input.nextLine();
        	String name =input.nextLine();

        	System.out.print("Accout No :");
        	//input.nextInt();
        	int AccountNo = input.nextInt();

        	System.out.print("Balance:");
        	//input.nextDouble();
        	double balance = input.nextDouble();

        	System.out.print("Tunure Year :");
        	int tenureYear = input.nextInt();

        accounts[i] = new FixedAccount(AccountNo,name,balance,tenureYear);
        }      
    }

   
    System.out.println("Enter account index number: ");
    int j = input.nextInt();
int button;
do{
        System.out.println("Please select below Option");
        System.out.println("1. Add money ");
        System.out.println("2. Withdraw money");
        System.out.println("3. Transfer");
        System.out.println("4. Show account");
        System.out.println("5. close account"); 
        System.out.println("6. Exit");

         System.out.print("Enter your option : ");
         button=input.nextInt();
        
        switch(button){

                 case 1:
        	        System.out.println("Enter your Ammout to add money : ");
                    accounts[j-1].addBalance(input.nextDouble());
                    System.out.println("Total balance after adding money : "+ accounts[j-1].balance);
                
        	        break;

        	        case 2: 
        	        System.out.println("Enter your Ammout to Withdraw; ");
                    accounts[j-1].withdraw(input.nextDouble());
                     System.out.println("Total balance after withdrawing  money : "+ accounts[j-1].balance);
        	        break;

        	        case 3:
        	        System.out.println("Enter Amount you want to Transfer:");
                        double m=input.nextDouble();
                     if(m<=1000.00){
                         if (m<accounts[j-1].balance){
                             System.out.println("Enter index number Account you want to Transfer:");
                             int b=input.nextInt();
                             accounts[b-1].addBalance(m);
                             System.out.println("Transfer done!!");;
                        } 
                    else{System.out.println("Not sufficient balance to Transfer:");}
                        }
                else{System.out.println("Cannot transfer more than 1000.00");}
        	        break;

        	       case 4:

                        System.out.println("Enter index number of the account you want to see: ");
                        int x= input.nextInt();

                       
                        if(accounts[x-1] != null)
                          {
                            System.out.println("#######################");
                            System.out.println("***********************");
                            accounts[x-1].showDetails();

                 
                          }
                        
                    
                   
                             break;

        	        case 5:
                        if(accounts[j-1].balance>500)
                        {
                         int flag =0;
                         System.out.println("which indexed account you want to remove ?");
                         int i= input.nextInt();
                            for( i=0; i<accounts.length; i++)
                             {
                               if(accounts[i] == accounts[j-1])
                                   {
                                     accounts[i] = null;
                                    flag = 1;
                                    break;
                                    }
                             }
                          if(flag==1){System.out.println("-----Removed-----");}
                           else{System.out.println("-----CanNot Remove-----");}
                        }
                        else 
                        {
                            System.out.println("YOU DO NOT HAVE SUFFICIENT CLOSING CHARGE");
                        }
        	        break;
        	        case 6:
                        System.exit(0);
        }
    }
        while(button!='6');
	}
}