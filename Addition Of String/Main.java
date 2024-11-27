import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    String s2=sc.next();
	    int n=9;
	    int k,r;
	  //  System.out.println(s+s2);
	  int x=9;
	  int []a=new int[x];
	  int []b=new int[x];
	  for(int i=0;i<n;i++)
      {
          a[i]=i;
          
            
         
      }
      for(String i=0;i<n;i++)
      {
        System.out.println(a[i]);
          
            
         
      }
      for(int i=0;i<n;i++)
      {
          if(a[i]==s)
          {
              k=i;
          }
      }
      
      for(int i=0;i<n;i++)
      {
          if(a[i]==s2)
          {
              r=i;
          }
      }
      System.out.println(k);
      System.out.println(k);

		
	}
}
