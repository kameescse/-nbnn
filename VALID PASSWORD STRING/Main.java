import java.util.*;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int c1=0,c2=0,c3=0,c4=0,c5=0;
        if(str.length()>=4)
        {
            c1++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                c2++;
            }
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
            {
                c3++;
            }
            if(str.charAt(i)==' ' || str.charAt(i)=='/')
            {
                c4++;
            }
            if(str.charAt(0)>=48 && str.charAt(0)<=57)
            {
                c5++;
            }
        }
            if(c1>0&& c2>0 && c3>0 && c4==0 && c5==0)
            
            {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
