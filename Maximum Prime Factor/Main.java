import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int[] c=new int[100];
	    int b=0;
	    for(int i=1;i<n-1;i++)
	    {
	        if(n%i==0)
	        {
	            
	            c[i]=i;
	            
	        }
	    }
	    for(int j=0;j<n;j++)
	    {
	        if(c[j]!=0)
	        {
	            c[j]=c[j];
	    
	        }
	  }
	  b=c[0];
	  for(int i=0;i<n;i++)
	  {
	      if(b<c[i])
	      {
	          b=c[i];
	      }
	  }
	  System.out.println(b);
	    
	    
	
	}
}
