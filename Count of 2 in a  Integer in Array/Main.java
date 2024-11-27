import java.util.*;
class HelloWorld
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int count=0;
        int count1=0;
        int arr[]=new int[1000];
        int arr1[]=new int[100];
        for(int in=0;in<n;in++)
        {
           arr[in]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            while(arr[i]>0)
            {
                
                    arr1[count]=arr[i]%10;
                    arr[i]=arr[i]/10;
                    count++;
                
            }
        
        }
        // for(int x=0;x<count;x++)
        // {
        //     System.out.println(arr1[x]);
        // }
        for(int y=0;y<count;y++)
        {
            if(arr1[y]==2)
            {
                count1++;
            }
        }
        System.out.println(count1);
        
        
        
    }
}