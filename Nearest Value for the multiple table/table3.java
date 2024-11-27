/*It is used to check the closest evement when it is divided bytthe value. for example
inhave taken 28 and 3 and the nearest value is 27 in the 3 table*/



import java.util.*;
public class table3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=26;
        int b=3;
        int n=a/b;
        int x=1;
        int arr[]=new int[n+1];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=((i+1)*b);
        }
        for(int z:arr)
        {
            System.out.print(z+" ");
        }

        int c=a-arr[n-1];
        int d=arr[n]-a;
        System.out.println();
        System.out.println("value of c"+c);
        System.out.println("value of d"+d);
        int e=(c<d)?(arr[n-1]):(arr[n]);
        System.out.println();
        System.out.println(e);




    }
}













