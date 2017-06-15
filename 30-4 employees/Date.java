//import java.util.*;

public class Date 
{ 	private int mera;
	private int minas;
	private int etos;
	private int[] monthDay={0,31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(int a,int b,int c)
	{
		
			setMonth(b);
			setDay(a);
			etos=c;
	}
	
	
	public String toString1()
		{
			return String.format("%02d/%02d/%04d",mera,minas,etos);
		}
	
	public void setDay(int a)
	{
		if(a>0&&a<=monthDay[minas])
		{
			mera=a;
		}
	}
	
	public void setMonth(int b)
	{
		if(b>=1&&b<13)
		{
			minas=b;
		}
		else
			throw new IllegalArgumentException("lathos minas");
	}
}
