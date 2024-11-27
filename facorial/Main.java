import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value :");
		int a=s.nextInt();
	    int i;
		int sum=1;
		for(i=1;i<=a;i++)
		{
		    sum=sum*i;
		}
		System.out.println(sum);
	}
}
