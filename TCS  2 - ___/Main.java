import java.util.*;
class HelloWorld 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        int count1=0;
        char[] a=s.toCharArray();
        char[] one=new char[100];
        char[] two=new char[100];
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='$')
            {
                one[i]='$';
                count++;
            }    
            
        }
        for(int x=0;x<count;x++)
        {
            System.out.println(one[x]);
        }
        for(int j=0;j<s.length();j++)
        {
            if(s.charAt(j)=='*')
            {
                two[j]='*';
                count1++;
            
             }
        }     
        for(int y=0;y<count1;y++)
        {
            System.out.println(two[y]);
        }
        System.out.println(count-count1);
    }
}