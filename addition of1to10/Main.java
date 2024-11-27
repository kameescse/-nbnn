
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value of A :");
	    int a=s.nextInt();
	    System.out.println("Enter the value of B :");
	    int b=s.nextInt();
	    int sum=0;
	       while(a<=b)
	       {
	           sum=sum+a;
	           a=a+1;
	       }
	       System.out.println(sum);
	}
}
