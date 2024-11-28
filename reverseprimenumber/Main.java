import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value A :");
	int a=s.nextInt();
	if((a/2!=0)&&(a/3!=0)&&(a/5!=0))
	{
	    System.out.println("It is prime number");
	}
	else
	{
	    System.out.println("It is not a prime number");
	}
	
	}
}
