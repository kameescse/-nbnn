import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        int count=0;
        int arr[]=new int[n];
        for(int inp=0;inp<n;inp++)
        {
            arr[inp]=sc.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            count=0;
            for(int j=1;j<=n;j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                    
                }   
               
            }
            arr[i]=count;
        }
        // for(int out=0;out<n;out++)                      //wrong i did descending
        // {
        //     System.out.print(arr[out]+" ");
        // }
        // for(int x=0;x<n;x++)
        // {
        //     for(int y=0;y<n;y++)
        //     {
        //         if(arr[x]>arr[y])
        //         {
        //             temp=arr[x];
        //             arr[x]=arr[y];
        //             arr[y]=temp;
        //         }
        //     }
        // }
        for(int output=n-1;output>=0;output--)//reverse the factor by the index of the array not the values in the array like descending
        {
            System.out.print(arr[output]+" ");
        }
    }
}
        
            
        
    
