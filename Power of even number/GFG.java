//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            long n = Long.parseLong(br.readLine().trim());            
            Solution ob = new Solution();
            long ans = ob.sum_of_square_evenNumbers(2);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_square_evenNumbers(long n)
    {
        
        long ans=1;
        long sum=0;
        for(long i=1;i<=n;i++)
        {
            long a=i*2;
            ans=1;
            for(int j=0;j<2;j++)
            {
                ans=ans*a;
            }
            sum=sum+ans;
        }
        return sum;
    }
}