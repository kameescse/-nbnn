import java.util.*;
public class dup
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        char[] a=s.toCharArray();
        String ans="";
        for(int i=0;i<s.length();i++) {
            count = 0;

            for (int j = i + 1; j < s.length(); j++) {

                if ((a[i] == a[j]) && (count == 0)&&(a[i]!='-'))
                {
                    ans=ans+a[i];
                    a[j] = '-';
                    count++;
                } else if ((a[i] == a[j]) && (count != 0)) {
                    a[j] = '-';
                }


            }


        }
//
//        for(int out=0;out<s.length();out++)
//        {
//            System.out.print(a[out]+" ");
//        }
        System.out.print(ans);
}
}
