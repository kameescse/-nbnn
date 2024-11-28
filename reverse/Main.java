import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	   
	    System.out.println("Enter the Value of A :");
	    int a=s.nextInt();

	    int r=0;
	    while(a>0)
	    {
	        int c=a%10;
	        r=r*10+c;
	        a/=10;
	    }
	    
	     System.out.println(r);
	}
}
