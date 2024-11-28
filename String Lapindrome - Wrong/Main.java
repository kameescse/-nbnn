import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        
        String s=new String("kamee");
        char q[]=s.toCharArray();
        int n=q.length;
        for(int i=0,j=q.length-1;i<j;i++,j--)
        {
            if(q[i]==q[j])
            {
                count++;
            }
    }
    if(count==n/2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
}
}