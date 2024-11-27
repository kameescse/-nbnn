/*check for special character available in a string if the special character is available 
then it is not valid. if The string doesn't has any special literals.

Then the String has atleast a single vowel it is valid */

import java.util.*;
public class Main  
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        String s=new String("ABCDeg$f");
        int vow=0;
        int cons=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if((c[i]<65)||((c[i]>91)&&(c[i]<96))||(c[i]>122))
            {
                cons++;
            }
        
            else if(((c[i]>65)&&(c[i]<90))||((c[i]>97)&&(c[i]<122)))
            {
                if((c[i]=='a')||(c[i]=='e')||(c[i]=='i')||(c[i]=='o')||(c[i]=='u')||(c[i]=='A')||(c[i]=='E')||(c[i]=='I')||(c[i]=='O')||(c[i]=='U'))
                {
                    vow++;
                }
                
                    
                
            }

        }
        if(cons>0)
        {
            System.out.println("NO");
        }
        else if(vow>0)
        {
            System.out.println("YES");
        }
        
    }
}