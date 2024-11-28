import java.util.*;
public class squareroot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=81;
        int temp=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                if(i*i==n)
                {
                    temp=i;
                }
            }
        }
        System.out.println(temp);
    }
}
