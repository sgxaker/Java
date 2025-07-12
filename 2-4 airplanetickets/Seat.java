public class Seat 
{
	boolean[] seat;
	
	void seatInit()
	{
		seat = new boolean[10];
		for(int i=0;i<seat.length;i++)
		{
			seat[i]=false;
		}
	}
	
	void showSeats()
	{
		System.out.println("First Class Seats");
		for(int i=0;i<5;i++)
		{
			System.out.println(seat[i]);
			
		}
		
		System.out.println("Economy Class Seats");
		for(int i=5;i<10;i++)
		{
			System.out.println(seat[i]);
			
		}
	}
	
	
	
	boolean checkFirst()
	{
		if(seat[4]==false)
		{
			return false;
		}
		return true;
	}
	
	boolean checkEconomy()
	{
		if(seat[9]==false)
		{
			return false;
		}
		return true;
	}
	
	
	
	void getSeat(int a)
	{
		if(a==1 && seat[4]!=true)
		{
			for(int i=0;i<5;i++)
			{
				if(seat[i]==false)
				{
					seat[i]=true;
					System.out.println("Booking completed your seat is: " + (i+1) +(" ths First Class"));
					System.out.println();
					System.out.println();
					break;
				}
			}
		}
		else if(a==2 && seat[9]!=true)
		{
			for(int i=5;i<10;i++)
			{
				if(seat[i]==false)
				{
					seat[i]=true;
					System.out.println("Booking completed your seat is: " + (i+1) +("ths Economy Class"));
					break;
				}
			}
		}
		else
		{
			System.out.println("The Class you picked is full");
		}
	}
}
