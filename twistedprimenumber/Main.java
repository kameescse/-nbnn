import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a value :");
	    int a=s.nextInt();
	    int t=a;
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
	    int r=0;
	    while(t>0)
	    {
	        int st=t%10;
	        r=r*10+st;
	        t/=10;
	    }
	    
	     System.out.println(r);
	     int count=0;
	    int in;
	    for(in=1;in<=r;in++)
	    {
	        if(r%in==0)
	        {
	            count=count+1;
	        }
	    }
	    if(count==2)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	     System.out.println("After ");
	     
	     System.out.println((c==count)?"Yes":"No");
	}
}
