import java.util.*;
public class charvoworconsonenet
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.println("It is Vowels");
        }
        else
        {
            System.out.println("It is Consonent");
        }
    }
}
