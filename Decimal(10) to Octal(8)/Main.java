import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    
	    int octal;
	    
	    int i=0;
	    int decimal=sc.nextInt();
	    int b[]=new int [100];
	    int temp=decimal;
	    while(temp!=0)
	    {
	        b[i]=temp%8;
	        temp=temp/8;
	        i++;
	        
	    }
	    for(int j=i-1;j>=0;j--)
	    {
	        System.out.print(b[j]);
	    }
		
	}
}
