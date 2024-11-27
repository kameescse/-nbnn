//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int num1 = Integer.parseInt(S[0]);
            int num2 = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.subClock(num1,num2));
        }
    }
}
// } Driver Code Ends

/* 

Given two positive integers num1 and num2, subtract num2 from num1 on a 12 hour clock rather than a number line.
Note: Assume the Clock starts from 0 hour to 11 hours.

 

Example 1:

Input:
num1 = 7, num2 = 5
Output:
2
Explanation:
7-5 = 2. The time in a 12 hour clock is 2.
Example 2:

Input:
num1 = 5, num2 = 7
Output:
10
Explanation:
5-7 = -2. The time in a 12 hour clock is 10.
 

Your Task:
You don't need to read input or print anything. Your task is to complete the function subClock() which takes 2 Integers num1, and num2 as input and returns the required time in a 12 hour clock format.

 

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 

Constraints:
1 <= num1,num2 <= 103




*/

//User function Template for Java

class Solution 
{
    static int subClock(int num1, int num2)
    {
        
        int sub=(num1-num2)%12;
        if(sub>0)
        {
            sub=sub%12;
            return sub;
        }
        else if(sub==0)
        {
            return 0;
        }
        
        else if(sub<0)
        {
            sub=(12+sub);
            
        }
        
        return sub;
    }
};