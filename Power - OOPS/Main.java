
import java.util.*;
class Multiple
{
    public double productdouble(double n,double m)
    {
        double  multiple1=1;
        for(int i=0;i<m;i++)
        {
            multiple1=multiple1*n;

        }
        return multiple1;

    }
    public int productint(int o,int p)
    {
        int multiple2=1;
        for(int i=0;i<p;i++)
        {
            multiple2=multiple2*o;

        }
        return multiple2;

    }

}

public class tough
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Multiple mul=new Multiple();
        double ans=mul.productdouble(2,3);
        int ans1=mul.productint(4,3);
        System.out.println("Product in Double is "+ans);
        System.out.println("Product in Int is "+ans1);
    }
}
