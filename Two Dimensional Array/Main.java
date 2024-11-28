import java.util.*;

    public class Main
    {
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=2;
		int[][] t=new int[n][n];
		System.out.print("Matrix A :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        t[i][j]=sc.nextInt();
		    }
		}
		
		System.out.print("Matrix B :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        t[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The value is :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(t[i][j]);
		    }
		    System.out.println("");
		}
		
		
	}	
}
