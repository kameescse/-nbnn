//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
  public static void main (String args[]) throws IOException
  {
	Scanner sc = new Scanner (System.in);
	int t = sc.nextInt ();
	while (t-- > 0)
	  {
		int B = sc.nextInt ();
		int N = sc.nextInt ();

		Solution ob = new Solution ();
		String ans = ob.getNumber (B, N);
		  System.out.println (ans);
	  }
  }
}

// } Driver Code Ends
/*

Given a decimal number N and the base B to which it should be converted. Convert the given number to the given base.

Example 1:

Input:
B = 2
N = 12 

Output:
1100

Explanation:
If the number 12 is converted to a 
number with base 2 we get the binary 
representation of 12 = 1100.
Example 2:

Input:
B = 16
N = 282

Output:
11A

Explanation:
If the number 282 is converted to a 
number with base 16 we get the hexadecimal 
representation of 282 = 11A.
Your Task:  
You don't need to read input or print anything. Your task is to complete the function getNumber() which takes two integer B and N representing the base and the decimal number and returns the number in the given base.

Expected Time Complexity: O(LogN)
Expected Auxiliary Space: O(1)

Constraints:
2 <= B <= 16
1 <= N <= 999999999




*/

//User function Template for Java
class Solution
{
  static String getNumber (int B, int N)
  {
	int n = N;
	int val = 0;
	int abs = 0;
	String res = "";
	String str = "0123456789ABCDEF";
	if (n == 0)
	  {
		return "0";
	  }
	while (n != 0)
	  {
		val = n % B;



		res = str.charAt (val) + res;

		n = n / B;

	  }
	return res;
  }
}
