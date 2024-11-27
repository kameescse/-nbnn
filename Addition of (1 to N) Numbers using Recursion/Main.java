import java.util.*;
class add
{
    public int add1(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n+add1(n-1);
        }
    }

}
public class recursion1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int b=6;
        add a=new add();
        int ans=a.add1(b);
        System.out.println(ans);

    }
}
