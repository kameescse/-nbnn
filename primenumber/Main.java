import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a value :");
        
	    int a=s.nextInt();
	    int c=0;
	    int i;
	    for(i=1;i<=a;i++)
	    {
	        if(a%i==0)
	        {
	            c=c+1;
	        }
	    }
	    if(c==2)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}
