


public class Main 
{

	public static void main(String args[])
	{
		
		
		
		Date1 HmerEisag = new Date1(18, 10, 1991);
		Student Kostas = new Student(2010, "Kostas", "Prattas", 31, 8, HmerEisag);
		
		StudentArchive list = new StudentArchive();
		
		list.addToList(Kostas);
		
		System.out.println(Kostas);
		
		
		Date1 HmerEisag1 = new Date1(1, 2, 1992);
		Student Giorgos = new Student(2011, "Giorgos", "Anastasiou", 31, 8, HmerEisag1);
		System.out.println(Giorgos);
		
		list.addToList(Giorgos);
		
		
		list.display();
		
		
		
	}
	
	
}
