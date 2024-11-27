import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int m=n;
        int e=1;

        for(int i=1;i<=n;i++)
        {
            int l=i;
            for(int k=1;k<=n-i+1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++)
            {

                System.out.print(l);
                l++;
            }

            for(int a=1,p=e;a<=i;a++,p--)
            {

                System.out.print(p);

            }
            e=e+2;

            System.out.println();
        }
    }
}
