import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int arr[]=new int[100];
        int decimal=0;
        int pow=1;
        int i=0;
        while(binary!=0)
        {
            arr[i]=binary%10;
            binary=binary/10;
            decimal=decimal+pow*arr[i];
            i++;
            pow=pow*2;
            
        }
        System.out.println(decimal);
    }
}