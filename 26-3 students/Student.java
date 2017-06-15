
class Student 
{

	private int year;
    private String onoma;
    private String epitheto;
    private int sunoloPerasmenwn;
    private int examhnoFoit;
    private Date1 dateEisa;
    
    public Student(int y, String o, String e, int sp, int ef, Date1 de)
    {
    	year=y;
    	onoma=o;
    	epitheto=e;
    	sunoloPerasmenwn=sp;
    	examhnoFoit=ef;
    	dateEisa=de;
    }
    
    public
    String toString()
    
    {
    
    return String.format(" %s %s %s %s %s %s", year, onoma, epitheto, sunoloPerasmenwn, examhnoFoit, dateEisa);
    }
	
}
