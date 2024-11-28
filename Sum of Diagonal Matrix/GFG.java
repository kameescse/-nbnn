//{ Driver Code Starts


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
            int n = Integer.parseInt(br.readLine().trim());
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int ans = ob.DiagonalSum(matrix);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends




class Solution
{
    public int DiagonalSum(int[][] matrix) // 111 111 111   = 6
    {                                      // 1 2 3 4       =  10
        int sum=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
            {
            if(i==j)
            {
                sum=sum+matrix[i][j];
            }
            }
        }
        for(int x=0;x<matrix.length;x++)
        {
            for(int y=matrix.length-1;y>=0;y--)
            {
                if((x+y)==(matrix.length-1))
                {
                    sum=sum+matrix[x][y];
                }
            }
        }
        return sum;
    }
}