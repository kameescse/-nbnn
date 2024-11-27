import java.util.*;
public class matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int m=3;
        int arr1[][]=new int[n][m];
        int arr2[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int out=0;out<n;out++)
        {
            for(int out1=0;out1<m;out1++)
            {
                System.out.print(arr1[out][out1]);
            }
            System.out.println();
        }
        for(int x=0;x<n;x++)
        {
            for(int y=0;y<m;y++)
            {
                arr2[y][x]=arr1[x][y];
            }
        }
        System.out.println("After transposing the Array");
        System.out.println();
        for(int out=0;out<n;out++)
        {
            for(int out1=0;out1<m;out1++)
            {
                System.out.print(arr2[out][out1]);
            }
            System.out.println();
        }

    }
}
