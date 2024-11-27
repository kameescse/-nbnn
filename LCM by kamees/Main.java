import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int x=0;x<n;x++)
        {
            arr[x]=sc.nextInt();
        }
        for(int y=0;y<n;y++)
        {
            for(int z=y+1;z<n-1;z++)
            {
                if(arr[y]>arr[z])
                {
                    temp=arr[y];
                }
            }
            
        }
        System.out.println(temp);
        
        
        while(true)
        {
            for(int c=0;c<n;c++)
            {
            if(temp%arr[c]==0)
            {
                break;
            }
            temp++;
            }
        }
        System.out.println(temp);
    }
}
