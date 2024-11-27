import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;

        int arr1[]=new int[100];
        int arr2[]=new int[100];
        int arr3[]=new int[100];
        while(n>0)
        {
            
            arr1[i]=n%2;
            n=n/2;
            i++;
        }
//        for(int out=0;out<i;out++)
//        {
//            System.out.print(arr1[out]);
//        }
//        System.out.println();
        for(int g=i-1,a=0;g>=0;g--,a++)
        {
            arr2[a]=arr1[g];

        }

        for(int out=0;out<i;out++)
        {
            System.out.print(arr2[out]);
        }
        System.out.println();
        for(int a=0;a<i;a++)
        {
            if(arr2[a]==0)
            {
                arr3[a]=1;
            }
            else if(arr2[a]==1)
            {
                arr3[a]=0;
            }
        }

        for(int out=0;out<i;out++)
        {
            System.out.print(arr3[out]);
        }
        System.out.println();
        System.out.println("Final Ans : ");

//---------------------------------------------------------------------------------------
        int mul=1;
        int fin=0;
        for(int f=i-1;f>=0;f--)
        {
            fin=fin+mul*arr3[f];
            mul=mul*2;
        }
        System.out.print(fin);

    }

}
