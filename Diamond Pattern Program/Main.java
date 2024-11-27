import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int n=5;
        int m=n;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n-i+1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print(" *");
            }

            System.out.println();
        }
        for(int i=0;i<=n;i++)
        {
            for (int k = 0; k < i; k++)
            {
                System.out.print(" ");
            }
            for(int l=0;l<n-i+1;l++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
