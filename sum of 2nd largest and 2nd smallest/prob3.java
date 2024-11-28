import java.util.*;
public class prob3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n%2==0) 
        {
            int arr[]=new int[n];
            int arr1[]=new int[n/2]; //index 0
            int arr2[]=new int[n/2]; //index 1
            int temp=0;
            int temp1=0;
            int temp2=0;
            int count=0;
            int count1=0;
            for (int in=0;in<n;in++) 
            {
                arr[in]=sc.nextInt();
            }
            for (int i=0;i<n;i=i+2) 
            {
                arr1[count]=arr[i];
                count++;
            }
            for (int j=1;j<n;j=j+2) 
            {
                arr2[count1]=arr[j];
                count1++;
            }
//        for(int out1=0;out1<n/2;out1++)
//        {
//            System.out.print(arr1[out1]);
//        }
//        System.out.println();
//        for(int out2=0;out2<n/2;out2++)
//        {
//            System.out.print(arr2[out2]);
//        }
            for (int a=0;a<arr1.length;a++) 
            {
                for (int b=a+1;b<arr1.length;b++) 
                {
                    if(arr1[a]<arr1[b]) 
                    {
                        temp1 = arr1[a];
                        arr1[a] = arr1[b];
                        arr1[b] = temp1;
                    }
                }
            }
            for (int x = 0; x < arr2.length; x++) {
                for (int y = x + 1; y < arr2.length; y++) {
                    if (arr2[x] > arr2[y]) {
                        temp2 = arr2[x];
                        arr2[x] = arr2[y];
                        arr2[y] = temp2;
                    }
                }
            }


            int sum = arr1[1] + arr2[1];
            System.out.println(sum);
        }
        else if(n%2==1)
        {
            int arr[] = new int[n];
            int arr1[] = new int[(n+1) / 2]; //index 0
            int arr2[] = new int[n / 2]; //index 1
            int temp = 0;
            int temp1 = 0;
            int temp2 = 0;
            int count = 0;
            int count1 = 0;
            for (int in = 0; in < n; in++) {
                arr[in] = sc.nextInt();
            }
            for (int i = 0; i < n+1; i = i + 2) {
                arr1[count] = arr[i];
                count++;
            }
            for (int j = 1; j < n; j = j + 2) {
                arr2[count1] = arr[j];
                count1++;
            }
//        for(int out1=0;out1<n/2;out1++)
//        {
//            System.out.print(arr1[out1]);
//        }
//        System.out.println();
//        for(int out2=0;out2<n/2;out2++)
//        {
//            System.out.print(arr2[out2]);
//        }
            for (int a = 0; a < arr1.length; a++) {
                for (int b = a + 1; b < arr1.length; b++) {
                    if (arr1[a] < arr1[b]) {
                        temp1 = arr1[a];
                        arr1[a] = arr1[b];
                        arr1[b] = temp1;
                    }
                }
            }
            for (int x = 0; x < arr2.length; x++) {
                for (int y = x + 1; y < arr2.length; y++) {
                    if (arr2[x] > arr2[y]) {
                        temp2 = arr2[x];
                        arr2[x] = arr2[y];
                        arr2[y] = temp2;
                    }
                }
            }


            int sum = arr1[1] + arr2[1];
            System.out.println(sum);
        }

    }
}
