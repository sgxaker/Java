


	
	class Date1 
	{
		private int m;
		private int y;
		private int d;
		private int Ds;
		private int[] Days={31,28,31,30,31,30,31,31,30,31,30,31};
		private String[] Months={"Ian", "Feb", "Mar", "Apr", "Mai", "Iou", "Aug", "Sep", "Okt", "Noe", "Dek"};
		
		
		public Date1()
		{
			
		}
		
		public Date1(int day, int month, int year)
		{
			setDay(day);
			setMonth(month);
			y=year;
		}
		
		
		
		public void setMonth(int month)
		{
			if(month>=1&&month<=13)
				m=month;
			else
				throw new IllegalArgumentException("Ebales lathos mhna ");
				
		}
		
		public void setDay(int day)
		{
			if(day>0 && day<=Days[m+1])
				d=day;
			else
				throw new IllegalArgumentException("Ebales lathos mera ");
		}
        
		
		public void displayDate(int i)
		{
			switch(i)
			{
			case 0:
				System.out.println(d+"/"+m+"/"+y);
				break;
			case 1:
				System.out.println(Months[m-1]+" "+d+", "+y);
				break;
			case 2:
				Ds=0;
				for(i=0;i<m;i++)
					Ds=Days[i]+Ds;
				System.out.println(Ds+" "+y);
				break;
			}
		}
		
		
		public String toString()
		{ 
			return String.format("%d/%d/%d", d, m ,y  );
		}
	}
	
	
	

