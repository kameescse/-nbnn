import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine()+" ";
		char[] c=s.toCharArray();
		String[] rev=new String[s.length()];
		String temp="";
		int inr=0;
		for (int i=0;i<s.length();i++)
		{
		    if (c[i]!=' ')
		    {
		        temp=temp+c[i];
		    }
		    else
		    {
		        rev[inr++]=temp;
		        temp=" ";
		    }
		}
		for (int i=rev.length-1;i>=0;i--)
		{
		    if (rev[i]!=null)
		    System.out.print(rev[i]+" ");
		}
	}
}
