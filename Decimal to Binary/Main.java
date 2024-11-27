import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int rem[]=new int[100];
        int i=0;
        while(number!=0)
        {
            rem[i]=number%2;
            number=number/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(rem[j]+"");
        }
    }
}