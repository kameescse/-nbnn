import java.util.*;
public class prob4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str=s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if((str[i]>=65)&&(str[i]<=90))
            {
                ans=ans+(char)(str[i]+32);
            }
            else if((str[i]>=97)&&(str[i]<=122))
            {
                ans=ans+(char)(str[i]-32);

            }
        }
        System.out.print(ans);

    }
}
