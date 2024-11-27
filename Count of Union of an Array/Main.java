//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            // Reading the first array
            String line1 = read.readLine().trim();
            String[] numsStr1 = line1.split(" ");
            int[] a = new int[numsStr1.length];
            for (int i = 0; i < numsStr1.length; i++) {
                a[i] = Integer.parseInt(numsStr1[i]);
            }

            // Reading the second array
            String line2 = read.readLine().trim();
            String[] numsStr2 = line2.split(" ");
            int[] b = new int[numsStr2.length];
            for (int i = 0; i < numsStr2.length; i++) {
                b[i] = Integer.parseInt(numsStr2[i]);
            }

            // Creating an instance of the Solution class
            Solution ob = new Solution();

            // Calling doUnion method and printing the result
            System.out.println(ob.doUnion(a, b));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution
{
    public static int doUnion(int arr1[], int arr2[])
    {
        int arr11=arr1.length;
        int arr22=arr2.length;
        int n=arr1.length+arr2.length;
        int dup[]=new int[n];
        int c=0;
        for(int i=0;i<arr11;i++)
        {
            dup[c]=arr1[i];
            c++;
        }
        for(int j=0;j<arr22;j++)
        {
            dup[c]=arr2[j];
            c++;
        }
        Arrays.sort(dup);
        // for(int out=0;out<dup.length;out++)
        // {
        //     System.out.print(dup[out]+" ");
        // }
        for(int x=0;x<dup.length;x++)
        {
            for(int y=x+1;y<dup.length;y++)
            {
                if(dup[x]==dup[y])
                {
                    dup[y]=-11;
                }
            }
        }
        int count=0;
        for(int an=0;an<dup.length;an++)
        {
            if(dup[an]!=-11)
            {
                count++;
            }
        }
        
        return count;
        
        
    }
}