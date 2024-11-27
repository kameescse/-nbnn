import java.util.*;
public class acc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="0C1A1B1C1C1B0A0";
        int ans=0;
        for(int i=1;i<s.length();i=i+2)
        {
            if(s.charAt(i)=='A')
            {
                if(((s.charAt(i-1)=='1')&&(s.charAt(i+1)=='1')))
                {
                    ans=1;
                }
                else
                {
                    ans=0;
                }
            }
            else if(s.charAt(i)=='B')
            {
                if((s.charAt(i-1)=='0')&&(s.charAt(i+1)=='0'))
                {
                    ans=0;
                }
                else
                {
                    ans=1;
                }
            }
            else if(s.charAt(i)=='C')
            {
                if(((s.charAt(i-1)=='0')&&(s.charAt(i+1)=='0'))||((s.charAt(i-1)=='1')&&(s.charAt(i+1)=='1')))
                {
                    ans=0;
                }
                else
                {
                    ans=1;
                }
            }
        }
        System.out.println(ans);

    }
}
