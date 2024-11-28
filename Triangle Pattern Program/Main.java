import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int n=6;
        int z=n;
        int y=0;
       for(int i=0;i<n;i++)
       {
           z--;
           for(int j=0;j<=z;j++)
           {
            System.out.print(" ");
           }
           y++;
           for(int k=1;k<=y;k++)
           {
               System.out.print(y+" ");
           }
           System.out.println();
       }
       
        
    }
}