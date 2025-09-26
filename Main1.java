
public class Main1 {

	public static void main(String[] args) {

		Account a1 = new Account("Zahin", 111, 500.0);
		
        System.out.println("a1");
		System.out.println("----------------");
		a1.show();
		
		System.out.println();
		System.out.println("Adding 500/-");
		System.out.println("----------------");
		a1.addBalance(500.0);
		a1.show();

		System.out.println();
		System.out.println("Withdrawing 700/-");
		System.out.println("----------------");
		a1.withdrawBalance(700.0);
		a1.show();	
		
		Account a2 = new Account("Tanziul",222,1500.0);

		
	    System.out.println();
		System.out.println("a2");
		System.out.println("----------------");
		a2.show();
		
		System.out.println();
		System.out.println("Adding 1000/-");
		System.out.println("----------------");
		a2.addBalance(1000.0);
		a2.show();

		System.out.println();
		System.out.println("Withdrawing 500/-");
		System.out.println("----------------");
		a2.withdrawBalance(500.0);
		a2.show();	
		
		System.out.println();
		System.out.println("Transfer 250/- to account no 222");
		System.out.println("----------------");
		a1.transfer(a2,250.0);
		a1.show();

        System.out.println();
		System.out.println("Recieve 250/- from account no 111");
		System.out.println("----------------");
		a2.show();
		


			


	}
}