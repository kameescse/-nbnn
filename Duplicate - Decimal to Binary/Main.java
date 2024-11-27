import java.util.*;
public class binrev
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;

        int arr1[]=new int[100];
        int arr2[]=new int[100];
        while(n>0)
        {
            if(n>=7)
            {
                
            }
            arr1[i]=n%2;
            n=n/2;
            i++;
        }
        for(int out=0;out<i;out++)
        {
            System.out.print(arr1[out]);
        }
        System.out.println();
        for(int g=i-1,a=0;g>=0;g--,a++)
        {
            arr2[a]=arr1[g];

        }
        for(int out=0;out<i;out++)
        {
            System.out.print(arr2[out]);
        }


    }

}
