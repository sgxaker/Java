import java.util.ArrayList;


public class StudentArchive 
{

	private ArrayList<Student> list = new ArrayList<Student>();;
	
	
	public void addToList(Student test)
	{
		list.add(test);
	}
	
	public void removeFromList(Student test)
	{
		list.remove(test);
	}
	
	
	public void display( )
	{
	for( Student item : list )
		System.out.printf("\n%s\n", item );
	}
	
}
