import java.util.Scanner;


public class Library 
{
	
	
	
	public static void main( String[] args )
	  {
		
		Scanner input = new Scanner (System.in);
		
		
		
			
		Book[] myBook=new Book[4];
		
		for(int j=0;j<3;j++)
		{
		  System.out.println("Please provide First Name: ");
		  String a = input.nextLine();
		  System.out.println("Please provide Last Name: ");
		  String b = input.nextLine();
		  System.out.println("Please provide Title: ");
		  String c = input.nextLine();
		  System.out.println("Please provide Number of Pages: ");
		  int d = input.nextInt();
		  myBook[j] = new Book(a, b, c, d);
		  myBook[j].printDetails();
		}
		
	  }
	
	
	
}
