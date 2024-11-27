import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the value :");
	    int a=s.nextInt();
	    int b=0,m=a;
	    int i=0;
	    while(i<=1)
	    {
	        b=a*a;
	        i++;
	    }
	    System.out.println(b);
	    int sum=0;
	    int r;
	    while(0<b)
	    {
	        r=b%10;
	        sum=sum+r;
	        b/=10;
	        
	        
	    }
	    System.out.println(sum);
	    System.out.println((sum==m)?"Yes":"No");
	}
}
