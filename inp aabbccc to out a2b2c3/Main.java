import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String("aabbccccd");
        int n=s.length();
        String s1="";
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                s1=s1+s.charAt(i);
                count++;

            }

            else if((i!=0)&&(s.charAt(i)==s.charAt(i-1)))
            {
                count++;
                if(i==n-1)
                {
                    s1=s1+count;
                }
            }

            else if((i!=0)&&(s.charAt(i)!=s.charAt(i-1)))
            {
                s1=s1+count+s.charAt(i);
                count=1;
                if(i==n-1)
                {
                    s1=s1+count;
                }
            }

        }
        System.out.println(s1);

    }
}
