class sandy extends Exception
{
    sandy()
    {
        super();
    }
    sandy(String a)
    {
        super("This is Pruthivi");
    }
}


public class Main
{
    static void kamees(int age) throws sandy
{
    if(age<18)
    {
        System.out.println("Eligible");
    }
    else
    {
        System.out.println("Not Eligible");
    }
}
	public static void main(String[] args) throws sandy
	{
	    int age=17;
	    try {
	        kamees(age);
	   
	    }
	    catch(sandy s)
	    {
	        System.out.println(s);
	    }
	}
	
}
