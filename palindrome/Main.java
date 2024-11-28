import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to be palindromed");
		int a=s.nextInt();
		int b=0,d=a;
		int r=0;
		while(0<a)
		{
		    b=a%10;
		    r=r*10+b;
		    a/=10;
		}
		System.out.println(r);
		System.out.println((r==d)?"Yes":"No");
	}
}
