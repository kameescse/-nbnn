import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int v=0;
		int c=0;
		for(int i=0;i<a.length();i++)
		if((a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'))
		{
		    v++;
		}
		else
		{
		    c++;
		}
		System.out.println(v+" "+c);
		
	}
}
