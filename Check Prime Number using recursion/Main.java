import java.util.*;
class prime
{
    public static int prime1(int n, int n1)
    {
        if(n1==n)
        {
             n1=n1-1;
        }
        if(n1==1)
        {
            return 1;
        }
        else
        {
            if(n%n1==0)
            {
                return 0;
            }
        }
        return prime1(n,n1-1);
        
    }
}
public class Main
{
    public static void main(String[] args) 
    {
        prime p=new prime();
        int n=7;
        int n1=7;
        int q=p.prime1(n,n1);
        if(q==1)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}