import java.util.*;
public class primenumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=2;i<=n;i++)
        {
            int k=0;
            for(int j=1;j<=n;j++)
            {
                if(i%j==0)
                {
                    k++;
                }
            }
            if(k==2)
            {
                System.out.println(i);
            }
        }
    }
}
