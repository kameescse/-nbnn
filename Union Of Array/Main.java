import java.util.*;
public class Main
{
  public static void main(String[]args)
  {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[]a =new int[n];
	int[]b =new int[n];
	int[]c =new int[20];
	int l=0;
	for(int i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	for(int j=0;j<n;j++)
	{
	    b[j]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
	    c[l++]=a[i];
	    
	}
	for(int i=0;i<n;i++)
	{
	    c[l++]=b[i];
	    
	}
	for(int i=0;i<l;i++)
	{
	    for(int j=i+1;j<l;j++)
	    {
	        if(c[i]==c[j])
	        {
	            c[j]=c[j+1];
	            l--;
	        }
	    }
	}
	for(int i=0;i<l;i++)
	{
	    System.out.print(c[i]+" ");
	    
	}
	

  }
}
