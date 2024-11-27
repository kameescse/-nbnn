import java.util.*;
public class fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=50;
        int a[]=new int[100];
        a[0]=0;
        a[1]=1;
        for(int i=1;i<n;i++)
        {
            a[i+1]=a[i]+a[i-1];
        }
        for(int j=1;j<n;j++)
        {
            System.out.println(a[j]);
        }


    }
}
