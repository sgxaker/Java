import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.io.FileNotFoundException;

public class askisiprwti{
	public static void main(String[] Args)
	{
	
	Map < String , Integer > myMap = new HashMap < String , Integer >();

	 createMap( myMap ); 
	 displayMap( myMap );
	}

	
	
	private static void createMap( Map < String , Integer > map )
	 {
		Scanner input=null;
		String ln=null;
		
		 try
		 {
		 input = new Scanner(new File("text.txt"));
		 }
		 catch(FileNotFoundException e)
		  {
		 System.out.println("Problem opening files.");
		 System.exit (0);
		  }

		 
		  int count = 0;

		  while (input.hasNextLine( ))
		  {
		  ln = input.nextLine( );
		  String [] tokens = ln.split( " " );
		  
		  for ( String token : tokens )
		  {
		  String word = token.toLowerCase (); 

		
		 if ( map.containsKey( word ) ) 
		 {
		  count = map.get( word ); 
		  map.put( word , count + 1 ); 
		  } 
		  else
		  map.put( word , 1 ); 
		 }
		  count ++;
		  System.out.println(count + " " + ln);
		  }
		  input.close( );
		   } 
	
	
	private static void displayMap( Map < String , Integer > map )
	 {
	 Set < String > keys = map.keySet (); 
	 
	 TreeSet < String > sortedKeys = new TreeSet < String >( keys );

	 System.out.println( "\nMap contains :\nKey\t\tValue" );

	 
	 for ( String key : sortedKeys )
	 System.out.printf( "%-10s%10s\n", key , map.get( key ) );

	 System.out.printf(
	 "\nsize: %d\nisEmpty: %b\n", map.size(), map.isEmpty () );
	 } 
	 }
