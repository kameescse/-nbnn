import java.util.*;
class HelloWorld
{
    public static void main(String[] args)
    {
        int n=6;
        int z=n;
        for(int i=0;i<n;i++)
        
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            z--;
            for(int k=0;k<=z;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}