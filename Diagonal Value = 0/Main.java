import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of row :");
		int r=sc.nextInt();
		System.out.println("Enter the value of column :");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        
		        a[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        if(i==j)
		        {
		            a[i][j]=0;
		        }
		    }
		    
		}
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		
	}
}
