import java.util.*;
public class str
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] str=s.toCharArray();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if((str[i]!=str[j])&&(i!=j))
                {
                   str[i]=str[i];
                }
                else if((str[i]==str[j]))
                {
                    str[i]='-';
                    str[j]='-';
                }

            }
        }
        for(int out=0;out<s.length();out++)
        {
            System.out.print(str[out]);
        }
        System.out.println();
        for(int a=0;a<s.length();a++)
        {
            if(str[a]!='-')
            {
                s1=s1+str[a];
            }
        }
        System.out.print("Unique Elem is "+s1);
    }
}
