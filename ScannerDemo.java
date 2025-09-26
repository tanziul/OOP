import java.util.Scanner;
public class ScannerDemo{
	public static void main(String[]args){
    
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Name,age,cgpa,address:");
   
  
    String name=sc.nextLine();
    int age=sc.nextInt();
    Double cgpa=sc.nextDouble();
    sc.nextLine();
    String address=sc.nextLine();




    System.out.println("Name="+name);
    System.out.println("Age="+age);
    System.out.println("CGPA="+cgpa);
    System.out.println("Address="+address);








	}
}
