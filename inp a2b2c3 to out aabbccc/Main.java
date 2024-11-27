import java.sql.SQLOutput;
import java.util.*;
public class a2b2c3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=new String("a1b4c3");
        int n=s.length();
        String s1="";                                                          //empty string
        for(int i=0;i<n;i++)
        {
            if((s.charAt(i)>=48)&&(s.charAt(i)<=57))
            {
                int m=s.charAt(i)-48;                                       //convert ascii to num y -48
                for(int j=1;j<m;j++)
                {
                    s1=s1+s.charAt(i-1);
                }
            }
            else if(((s.charAt(i)>=65)&&(s.charAt(i)<=90))||((s.charAt(i)>=97)&&(s.charAt(i)<=122)))  //need to be a alphabet
            {
                s1=s1+s.charAt(i);
            }


        }
        System.out.println(s1);
    }
}
