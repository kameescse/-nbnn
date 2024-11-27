import java.util.*;
class integer 
{
    public void display(int a)
    {
        int b;
        b=a*a;
        System.out.println(b);
        int mod=b%10;
        if(mod==a)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        integer c=new integer();
        c.display(5);
        
    }
}