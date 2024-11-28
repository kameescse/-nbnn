import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String b="";
        for(int i=s.length()-1;i>=0;i--)
        {
            b=b+s.charAt(i);
        }
        if(b.equalsIgnoreCase(s))
        {
            System.out.println("It is palinfrome");
        }
        
    }
}