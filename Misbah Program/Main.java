import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int arr[]=new int[n];
        int arr1[]=new int[n];
        int temp=0;
        for(int in=0;in<n;in++)
        {
            arr[in]=sc.nextInt();
        }
        for(int fir=0;fir<n;fir++)
        {
            for(int sec=fir+1;sec<n;sec++)
            {
                if(arr[fir]<arr[sec])
                {
                    temp=arr[fir];
                    arr[fir]=arr[sec];
                    arr[sec]=temp;
                }
            }
        }
        for(int out=0;out<n;out++)
        {
            System.out.print(arr[out]+" ");
        }
        temp=arr[0]-arr[1;]
        for(int i=1;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                
            }
        }
    }
    
}    
   
   
   
   
   
   
    
