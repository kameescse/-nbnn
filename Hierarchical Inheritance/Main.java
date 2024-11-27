import java.util.*;
class kamees
{
    public void first()
    {
        System.out.println("This is Parent Class");
        
    } 
}
class subash extends kamees
{
    public void second()
    {
        System.out.println("This is Child Class");
    } 
}
class speed extends kamees
{
    public void third()
    {
        System.out.println("This is a Child Class");
    } 
}



public class Main
{
	public static void main(String[] args) 
	{
	    kamees k=new kamees();
	    k.first();
	    subash s=new subash();
	    s.second();
	    speed d=new speed();
	    d.third();
	    
	}
}
