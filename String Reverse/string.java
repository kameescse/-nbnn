import java.util.*;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); //Java
        String ans="";
        for(int i=s.length()-1;i>=0;i--)

        {
            ans=ans+s.charAt(i);
        }
        System.out.print(ans);
    }
}
