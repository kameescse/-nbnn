import java.util.*;
public class amstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=153;
        int m=n;
        int rem[]=new int[100];
        int sum[]=new int[100];
        int add=0;
        for(int s=0;s<sum.length;s++)
        {
            sum[s] = sum[s] + 1;
        }

        int i=0;
        int count=0;
        while(m>0)
        {
            rem[i]=m%10;     //Ques : 153
            m=m/10;          //Ans : 351
            i++;
        }
//        for(int j=0;j<i;j++)
//        {
//            System.out.print(rem[j]);
//        }
//        System.out.println();
        for(int x=0;x<i;x++)
        {
            for(int y=0;y<i;y++)
            {
                sum[x]=sum[x]*rem[x];

            }
//            System.out.println();
        }

        for(int z=0;z<i;z++)
        {
            add=add+sum[z];

        }
        System.out.println(add);
        if(n==add)
        {
            System.out.println("It is Armstrong Number");
        }
        else
        {
            System.out.println("It is not a Armstrong Number");
        }


    }
}
