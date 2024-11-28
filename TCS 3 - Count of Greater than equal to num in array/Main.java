import java.util.*;
class HelloWorld 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            if(arr1[0]<=arr1[j])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}