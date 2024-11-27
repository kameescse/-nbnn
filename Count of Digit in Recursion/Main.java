import java.util.*;
class count
{
    public int count1(int n)
    {
        if(n<10)
        {
            return 1;
        }
        else
        {
            return 1+count1(n/10);
        }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=456;
        count c=new count();
        int ans=c.count1(num);
        System.out.println(ans);
    }
}
