import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age :");
		int a=s.nextInt();
		if(a<10)
		{
		    System.out.println("Child");
		}
		else if(a<20)
		{
		    System.out.println("Teenage");
		}
		else if(a<30)
		{
		    System.out.println("Adult");
		}
		else if(a<60)
		{
		    System.out.println("Uncle");
		}
		else
		{
		    System.out.print("Old MAn");
		}
		
	}
}
