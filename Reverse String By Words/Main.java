import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        String s="welcome to code";
        String temp="";
        String[] arr=new String[s.length()];
        int start=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
           
            if(((s.charAt(i))!=' '))
            {
                temp=temp+s.charAt(i);
                 if(i==s.length()-1)
            {
                arr[start]=temp;
            }
            }
            else
            {
                arr[start]=temp;
                temp="";
                start++;
            }
        }
        // for(int out=0;out<arr.length;out++)
        // {
        //     System.out.println(arr[out]+" ");
        // }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=null)
            {
                c++;
            }
        }
        String[] arr1=new String[c];
        for(int x=0;x<arr1.length;x++)
        {
            arr1[x]=arr[x];
        }
        for(int out1=arr1.length-1;out1>=0;out1--)
        {
            System.out.println(arr1[out1]+" ");
        }
        
    }
}