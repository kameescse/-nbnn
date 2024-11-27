import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String a=sc.next();
	    char c=sc.next().charAt(0);
	    char a1[]=a.toCharArray();
	    for(int i=0;i<a1.length;i++)
	    {
	    if(a1[i]!=c)
	    {
	        System.out.print(a1[i]);
	    }
	    }
	    
	}
}
