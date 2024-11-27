import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int val=0;
        int arr[]=new int[30];
        int ans=0;
        int n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
            val=n%2;
            arr[c]=val;
            n=n/2;
            c++;
        }
        for(int out=arr.length-1;out>=0;out--)
        {
            System.out.print(arr[out]);
        }
        System.out.println();
        String ans1="";
        for(int i=0;i<arr.length;i++)
        {
            ans1=ans1+arr[i];
        }
        System.out.print(ans1);
    }
}