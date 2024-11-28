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
            String s = br.readLine();
            String[] S = s.split(" ");
            int n = Integer.parseInt(S[0]);
            int a = Integer.parseInt(S[1]);
            int d = Integer.parseInt(S[2]);
            Solution ob = new Solution();
            int ans = ob.sum_of_ap(n, a, d);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends

/*
Given n, a and d as the number of terms, first term and common difference respectively of an Arthimetic Series. Find the sum of the series upto nth term.
 
 
Input: 5 1 3
Output: 35
Explanation: Series upto 5th term is
1 4 7 10 13, so sum will be 35.
Example 2:

Input: 3 1 2
Output: 9
Example: Series upto 3rd term is 
1 3 5, so sum will be 9.


*/ 
//User function Template for Java

class Solution
{
    public int sum_of_ap(int n, int a, int d)
    {
        int sum=0;
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            
            if(i==1)
            {
                ans=a;
                sum=sum+ans;
            }
            else
            {
                ans=ans+d;
                sum=sum+ans;
            }

    
    }
    return sum;
}
}