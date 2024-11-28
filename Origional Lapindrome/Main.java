import java.util.*;
public class Main  
{
    public static void main(String[] args) 
    {
       String s=new String("kaak");
       int arr1[]=new int[26];
       int arr2[]=new int[26];
       int count=0;
       int count1=0;
       int sum=0;
       int sum1=0;
       int a=(s.length()+1)/2;
       for(int i=0;i<a;i++)
       {
           arr1[i]=s.charAt(i);
           count++;
       }
    //   for(int j=0;j<count;j++)
    //   {
    //       System.out.println(arr1[j]);
    //   }
       for(int x=a,x1=0;x<s.length();x++,x1++)
       {
           arr2[x1]=s.charAt(x);
           count1++;
       }
    //   for(int y=0;y<count1;y++)
    //   {
    //       System.out.println(arr2[y]);
    //   }
       for(int f=0;f<count;f++)
       {
           sum=sum+arr1[f];
       }
       for(int g=0;g<count;g++)
       {
           sum1=sum1+arr2[g];
       }
    //   for(int h=0;h<count;h++)
    //   {
    //       System.out.println(arr1[h]);
    //   }
    //   for(int k=0;k<count;k++)
    //   {
    //       System.out.println(arr2[k]);
    //   }
    System.out.println(sum);
    System.out.println(sum1);
    if(sum==sum1)
    {
        System.out.println("It is Lapindrome");
    }
    else
    {
        System.out.println("It is Not Lapindrome");
    }
    
    }
}