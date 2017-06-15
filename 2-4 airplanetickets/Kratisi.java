import java.util.Scanner;

public class Kratisi 
{

	public static void main( String[] args )
	{
		Scanner input= new Scanner(System.in);
		int epilogh, mpla;
		boolean tmp1, tmp2;
		epilogh=0;
		mpla=1;
		
		seats airplane = new seats();
		airplane.seatInit();
		
		
		while (mpla!=0)
		{	
		System.out.println("Gia na deis tis 8eseis pata 1");
		System.out.println("Gia na tsekareis an oi 8eseis ths First Class einai gemates pata 2");
		System.out.println("Gia na tsekareis an oi 8eseis ths First Economy einai gemates pata 3");
		System.out.println("Gia na kaneis krathsh pata 4");
		System.out.println("Gia na bgeis apo to programma pata 0");
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
			System.out.println("Yparxoun dia8esimes 8eseis");
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
			System.out.println("Yparxoun dia8esimes 8eseis");
		}
		break;
		
		case 4:

			System.out.println("Gia First Class pata 1, gia Economy Class pata 2");
			epilogh = input.nextInt();
			input.nextLine();
			airplane.getSeat(epilogh);
			break;
		case 0:
		 break;
		} //switch
		 
		    
		
		} //while
		
	}
	
}