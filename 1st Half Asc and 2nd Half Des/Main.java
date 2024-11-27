import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        int b=n/2;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<b-1;i++)
        {
            for(int j=0;j<b-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=b;i<n-1;i++)
        {
            for(int j=b;j<n-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");//6 3 8 2 7 9 1 6
        {
            a[i]=sc.nextInt();
        }
        {
            a[i]=sc.nextInt();
        }
        }
    }
}