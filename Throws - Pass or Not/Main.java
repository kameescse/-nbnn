import java.util.*;
class kamees extends Exception
{
    kamees()
    {
        
        super(" "+"He is Passed");
        
    }
    kamees(int n)
    {
        super("He is Not Passed");
    }
}
public class Main
{
	public static void main(String[] args) throws kamees{
		Scanner sc=new Scanner(System.in);
		int mark=sc.nextInt();
		if(mark<35)
		{
		    throw new kamees(mark);
		}
		else
		    {
		        throw new kamees();
		    }}
	
}
