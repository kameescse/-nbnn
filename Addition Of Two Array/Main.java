import java.util.*;

    public class Main
    {
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=2;
		int[][] t=new int[n][n];
		int[][] w=new int[n][n];
		System.out.println("Matrix A :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        t[i][j]=sc.nextInt();
		    }
		}
		
		System.out.println("Matrix B :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        w[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The value is :");
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        System.out.print(t[i][j]+w[i][j]+" ");
		    }
		    System.out.println(" ");
		}
		
		
	}	
}
