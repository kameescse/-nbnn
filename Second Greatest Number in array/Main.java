import java.util.*; //second greatest number in an array
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int temp=0;
        for(int in=0;in<n;in++)
        {
            a[in]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a[i]>a[j])
                {
                   temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
                }
            }
        }
        // for(int q=0;q<n;q++)         // printing descending order 
        // {
        //     System.out.print(a[q]+" ");
        // }
        System.out.println(a[1]);
        }
        
    }
