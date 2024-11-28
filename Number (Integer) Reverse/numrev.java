import java.util.*;
public class numrev
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;

        int val=0;
        while(n!=0)
        {
            val=n%10;
            ans=(ans*10)+val;
            n=n/10;
        }
        System.out.print(ans);
    }
}
