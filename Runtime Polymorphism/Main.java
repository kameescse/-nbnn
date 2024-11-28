import java.util.*;
class kamees
{
    void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
class subash extends kamees
{
    void add(int a,int b,int c)
    {
        System.out.println(a*b*c);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
		kamees k=new kamees();
		k.add(45,65);
		subash s=new subash();
		s.add(56,65,43);
	}
}
