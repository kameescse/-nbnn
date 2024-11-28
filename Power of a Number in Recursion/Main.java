import java.util.*;
class power
{
    public int power1(int n,int n1)
    {
        if(n1==0)
        {
            return 1;
        }
        else
        {
            return n*power1(n,n1-1);
        }
    }

}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=2;
        int b=5;
        power p=new power();
        int ans=p.power1(a,b);
        System.out.println(ans);

    }
}
