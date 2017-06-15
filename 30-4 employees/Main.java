import java.util.*;

public class Main 
{
	
	
	
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner( System.in );
		SalariedEmployee[] ipaliloi=new SalariedEmployee[3];
		
		String onoma,eponymo,kwdikos;
		double misthos;
		int mera, minas,etos,currminas,i;
		
		System.out.println("pios einai o trexwn minas?:");
		currminas=input.nextInt();
		
		
		for(i=0;i<2;i++)
		{
			System.out.println("pio einai to onoma?:");
			onoma=input.nextLine();
			input.nextLine();
			System.out.println("pio einai to eponymo?:");
			eponymo=input.nextLine();
			System.out.println("pios einai o kwdikos?:");
			kwdikos=input.nextLine();
			System.out.println("pio einai h mera genisis?:");
			mera=input.nextInt();
			System.out.println("pios einai o minas genisis?:");
			minas=input.nextInt();
			System.out.println("pio einai to etos genisis?:");
			etos=input.nextInt();
			System.out.println("pios einai o misthos sou?:");
			misthos=input.nextDouble();
			
			if(currminas==minas)
			{
				misthos=misthos+100;
			}
			
			
		Date Hmergen=new Date(mera,minas,etos);
		
		ipaliloi[i]= new SalariedEmployee(onoma,eponymo,kwdikos,Hmergen,misthos);
		
		
		}
		
		for(i=0;i<2;i++)
		{
			System.out.println(ipaliloi[i].getWeeklySalary());
		}
		
	}

}
