import java.util.*;
public class sam
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        String ans="";
        int a=0;
        int upper=0;
        int lower=0;
        char[] c=s.toCharArray();

        for(int i=0;i<s.length();i++)
        {
            if((c[i]>=65)&&(c[i]<=90))
            {
                upper++;
            }
            else if((c[i]>=97)&&(c[i]<=122))
            {
                lower++;
            }


        }
        if(upper>lower)
        {
            for(int x=0;x<s.length();x++)
            {
                if((c[x]>=65)&&(c[x]<=90))
                {
                    ans=ans+c[x];

                }
            }
        }
        else
        {
            for(int y=0;y<s.length();y++)
            {
                if((c[y]>=97)&&(c[y]<=122))
                {
                    ans=ans+c[y];


                }
            }
        }
        if(upper>lower)
        {
            System.out.print("more-upper : "+ans);
        }
        else
        {
            System.out.print("more-lower : "+ans);
        }


    }
}
