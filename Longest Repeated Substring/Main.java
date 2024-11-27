import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s="abcdechgsqtesgds";
        int max=0;
        int temp=0;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            arr.clear();
            temp=0;
            for(int j=i;j<s.length();j++)
            {
                if(arr.contains(s.charAt(j)))
                
                {
                    break;
                }
                else
                {
                    arr.add(s.charAt(j));
                    temp++;
                }
            }
            if(max<temp)
            {
                max=temp;
            }
        }
        System.out.println(max);
        
    }
}







