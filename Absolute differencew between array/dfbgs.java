import java.util.*;
public class dfbgs
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int res=0;
        int arr1[]=new int[n-1];
        for(int in=0;in<n;in++)
        {
            arr[in]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<0)
            {
                arr[i]=-(arr[i]);
            }
            else
            {
                arr1[i]=arr[i]-arr[i+1];
            }
        }

        for(int a=0;a<arr1.length;a++)
        {
            if(arr1[a]<0)
            {
                arr1[a]=-(arr1[a]);
            }
        }
        for(int out=0;out<arr1.length;out++)
        {
            System.out.print(arr1[out]+" ");
        }
        for(int ans=0;ans<arr1.length;ans++)
        {
            res=res+arr1[ans];
        }
        System.out.println();
        System.out.println(res);
    }
}
