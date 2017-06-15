import java.util.Random;
import java.util.Scanner;


public class maingame 
{

	
	
	public static void main( String[] args )
	{
		
		Scanner input = new Scanner( System.in );
		
		int balance=1000;
		int a,b,sum,point,bet;
		bet=0;
		point=0;
		sum=0;
		
		
		
		
		
		
		while(bet<balance)
		{	
			
			System.out.println("Posa 8es na pontareis man?");
			bet = input.nextInt();
			
			a=dice();
			b=dice();
			sum=a+b;
			
			System.out.println(a);
			System.out.println(b);	
		if(sum==7 || sum==11)
		{
		   System.out.println("Kerdises");
		   balance=balance+bet;
		   System.out.println(balance);
		   bet=0;
		}
		else if (sum==2 || sum==3 || sum==12)
		{
			System.out.println("Exases");
			balance=balance-bet;
			System.out.println(balance);
			bet=0;
		}
		else
		   {
			point=sum;
			while(sum !=7)
			{
				a=dice();
				b=dice();
				System.out.println("Nea zaria");
				System.out.println(a);
				System.out.println(b);
				sum=a+b;
				 if(sum==point)
				 {
					 System.out.println("Kerdises");
					 balance=balance+bet;
					 System.out.println(balance);
					 bet=0;
					 break;
				 }
				 if(sum==7)
				 {
					 System.out.println("Exases");
					 balance=balance-bet;
					 System.out.println(balance);
					 bet=0;
				 }
			 }
			
		   }
		
		 }
		
			
	}
	
	//random zaries
	public static int dice()
	{
		Random randomNumbers = new Random();
		
		int dice1 = 1 + randomNumbers.nextInt( 6 );
				return dice1;
		
	}
	
	
}

