import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=new String("kabilan");
        String s1="";
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            
            if((s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'))
            {
                if(s.charAt(i)=='a')
                {
                    s1=s1+(char)(s.charAt(i)-32);
                }
                else if(s.charAt(i)=='e')
                {
                    s1=s1+(char)(s.charAt(i)-32);
                }
                else if(s.charAt(i)=='i')
                {
                     s1=s1+(char)(s.charAt(i)-32);
                }
                else if(s.charAt(i)=='o')
                {
                     s1=s1+(char)(s.charAt(i)-32);
                }
                else if(s.charAt(i)=='u')
                {
                     s1=s1+(char)(s.charAt(i)-32);
                }
            }
            else
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
    }
}