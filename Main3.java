import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("***************************");
		System.out.println("**** Welcome to MyBank ****");
		System.out.println("***************************");
		System.out.println("How many accounts you want to create:");
 		Account3 a[]=new Account3[sc.nextInt()];
 		for(int i=0;i<a.length;i++)
		{
			int x=i+1;
			System.out.println("Account-"+x+"****Account Details****");
			System.out.println("Account no:"+x);
			System.out.println("Enter ID :");
			int id=sc.nextInt();
			System.out.println("Enter Name :");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter Balance :");
			Double balance=sc.nextDouble();
			a[i]=new Account3(id,name,balance);
		}
			
		System.out.println("Enter Account number to start:");
		int j=sc.nextInt();
		System.out.println("Welcome "+" "+ a[j-1].name);
		 
		System.out.println("Select an option below:");
 		System.out.println("1.Add Balance");
		System.out.println("2.Withdraw Balance");
		System.out.println("3.Transfer Balance");
		System.out.println("4.Check Balance");
		System.out.println("5.Exist");
 		 
 		
 		
 			System.out.println("Enter Amount you want to Add:");
 			a[j-1].addBalance(sc.nextDouble());
 		

 		
 			System.out.println("Enter Amount you want to Withdraw:");
 			a[j-1].withdrawBalance(sc.nextDouble());
		

 	
 			System.out.println("Enter Amount you want to Transfer:");
 			double q=sc.nextDouble();
 			if(q<=2000.00){
 				if (q<a[j-1].balance){
 					System.out.println("Enter Account you want to Transfer:");
 					int p=sc.nextInt();
 					a[p-1].addBalance(q);
 					System.out.println("Transfer done!!");;
				}
				else{System.out.println("Not sufficient balance to Transfer:");}
 			}
 			else{System.out.println("Cannot transfer more than 1000.00");}
 			


 		
 			System.out.println("Enter Account Number to Check Balance:");
 			int k=sc.nextInt();
 			System.out.println("account name = " + a[k-1].name);
		System.out.println("account no = " +a[k-1].id);
		System.out.println("balance = " +a[k-1].balance);
 	

 	System.out.println("Enter valid input:");

 		
 		 
	}
}
	