import java.util.Scanner;

public class Kratisi 
{

	public static void main( String[] args )
	{
		Scanner input= new Scanner(System.in);
		int choice, mpla;
		boolean tmp1, tmp2;
		choice=0;
		mpla=1;
		
		seats airplane = new seats();
		airplane.seatInit();
		
		
		while (mpla!=0)
		{	
		System.out.println("To check the available seats press 1");
		System.out.println("To check if the First Class is full press 2");
		System.out.println("To check if the First Economy is full press 3");
		System.out.println("To make a reservation press 4");
		System.out.println("To terminate the program press 0");
		mpla = input.nextInt();
		input.nextLine();
		
		switch (mpla)
		{
		
		case 1:
		airplane.showSeats();
		break;
		
		
		case 2:
		tmp1 = airplane.checkFirst();
		if(tmp1==true)
		{
			System.out.println(Msg.firstFull() );
		}
		else
		{
			System.out.println("There are available seats");
		}
		break;
		
		case 3:
		tmp2 = airplane.checkEconomy();
		if(tmp2==true)
		{
			System.out.println(Msg.economyFull() );
		}
		else
		{
			System.out.println("There are available seats");
		}
		break;
		
		case 4:

			System.out.println("For First Class press 1, for Economy Class press 2");
			choice = input.nextInt();
			input.nextLine();
			airplane.getSeat(choice);
			break;
		case 0:
		 break;
		} //switch
		 
		    
		
		} //while
		
	}
	
}
