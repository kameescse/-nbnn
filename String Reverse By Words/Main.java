import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String a="Kamees is a good boy";
        String b="";
        String[] s=a.split(" ");
        for(int i=s. length-1;i>=0;i--)
        {
            System.out.print(s[i]+" ");
        }
    }
}