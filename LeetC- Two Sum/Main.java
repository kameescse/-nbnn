import java.util.*;
public class sample
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int in=0;in<n;in++)
        {
            arr[in]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (arr[i] + arr[j] == target)
                {
                    System.out.println(i + " " +j);

                }
            }
        }


        }
    }

