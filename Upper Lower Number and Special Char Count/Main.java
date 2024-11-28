import java.util.*;
public class count
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s="#GeeKs01fOr@gEEks07";
        int upper=0;
        int lower=0;
        int num=0;
        int other=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>=65)&&(s.charAt(i)<=90))
            {
                upper++;
            }
            else if((s.charAt(i)>=97)&&(s.charAt(i)<=122))
            {
                lower++;

            }
            else if((s.charAt(i)>=48)&&(s.charAt(i)<=57))
            {
                num++;
            }
            else
            {
                other++;
            }
        }
        System.out.println("upper is :"+upper);
        System.out.println("lower is :"+lower);
        System.out.println("number is :"+num);
        System.out.println("other char is :"+other);
    }
}
