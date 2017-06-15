
import javax.swing.JOptionPane;


public class askisi1 
{
    
	
	public static void main( String[] args )
	{
		double min;
		
		String a = JOptionPane.showInputDialog("Dwse ena akeraio");
		String b = JOptionPane.showInputDialog("Dwse ena akeraio");
		String c = JOptionPane.showInputDialog("Dwse ena akeraio");
		
		double x = Double.parseDouble(a);
		double y = Double.parseDouble(b);
		double z = Double.parseDouble(c);
		
		min=Minimum(x,y,z);
		
		String message =String.format("O minimum arithmos einai, %s !", min);
		JOptionPane.showMessageDialog(null, message );
	}	
				
	   public static double Minimum(double x,double y,double z )
	   { 
		   double min;
		   min=x;
		   if(min>y)
			   min=y;
		   if(min>z)
			   min=z;
		  
		 return min;
	   }
	   
}

