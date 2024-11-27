import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==2)
        {
            System.out.println("28");

        }
        else if((n%2!=0)&&(n<=7)&&(n>0))
        {
            System.out.println("31 Days");
        }
        else if((n%2==0)&&(n<=7)&&(n>0))
        {
            System.out.println("30 Days");
        }
        else if((n%2==0)&&(n>7)&&(n<=12))
        {
            System.out.println("31 Days");
        }
        else if((n%2!=0)&&(n>7)&&(n<=12))
        {
            System.out.println("30 Days");
        }
        else
        {
            System.out.println("Ommala Correct Ah Kudu Da");
        }
    }
}
