import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    int a1[]={1,2,3,4};
	    int a2[] = {1, 2,2,3, 4};
	    
		int count=0;
        
        for(int i=0;i<a2.length;i++)
        {
        for(int j=0;j<a1.length;j++)
        {
            if((a2[i]==a1[j])&&(a2[i]!=-11))
            {
                count++;
                a1[j]=-11;
                j=a1.length;
            }
        }
    }
    System.out.println(count);
    if(count==a2.length)
    {
        System.out.println("Yes");
    }
    else{
    System.out.println("No");}
	}
}


/*

 long count=0;
        
        for(long i=0;i<a2.length;i++)
        {
        for(int j=0;j<a1.length;j++)
        {
            if((arr[i]==arr[j])&&(arr[i]!=-11))
            {
                count++;
                arr[j]=-11;
                j=a1.length;
            }
        }
    }
    if(count==a2.length)
    {
        return "Yes";
    }
    return "No";


*/
































