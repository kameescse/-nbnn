import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int n=5;
        int m=n;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }




            System.out.println();
        }
        for(int p=0;p<n;p++)
        {
            for(int k=1;k<m-p;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
