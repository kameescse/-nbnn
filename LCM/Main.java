import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<n;i++)
        {
            if (max<arr[i])
            {
                max=arr[i];
            }
        }
        int maxi=1;
        int ans=0;
        int count=0;
        for (int i=0;i<n;i++)
        {
            maxi=maxi*arr[i];
        }
        for (int i=max;i<maxi;i++)
        {
            count=0;
            for (int j=0;j<n;j++)
            {
                if(i%arr[j]==0)
                {
                    count++;
                }
            }
            if (count==n)
            {
                ans=i;
                break;
            }
        }
        System.out.println(ans);
    }
}
