public class Book 
{
   private String firstName;
   private String lastName;
   private String title;
   private int nP;
   private int rN;

   

//Constructor
   public Book(String a, String b, String c, int d)
     {
	   firstName=a;
	   lastName=b;
	   title=c;
	   nP=d;
	   rN=0;
     } 

//Display  
   public void printDetails()
     {
	   System.out.println(firstName);
	   System.out.println(lastName);
	   System.out.println(title);
	   System.out.println(nP);
	   if(rN!=0)
		   System.out.println(rN);
	   
     }
   
//Set-Get  
   public void setFN(String a)
     {
	   firstName=a;
     }
   
   public void setLN(String a)
     {
	   lastName=a;
     }
   
   public void setTitle(String a)
     {
	   title=a;
     }
   
   public void setNP(int a)
     {
	   nP=a;
     }
   
   public void setRN(int a)
     {
	   rN=a;
     }
   
   public String getFN()
     {
	   return(firstName); 
     }
   
   public String getLN()
     {
	   return(lastName); 
     }
   
   public String getTitle()
     {
	   return(title); 
     }
   
   public int getNP()
     {
	   return(nP); 
     }
   
   public int getRN()
     {
	   return(rN); 
     }
   
}