import java.util.*;
class student
{
    int num;
    String str;
    int dig;
    public void display(int n,String s)
    {
        num=n;
        str=s;
        System.out.println(n+" "+s);
    }
    public void display(int n,String s,int r)
    {
        num=n;
        str=s;
        r=dig;
        System.out.println(num+" "+str+" "+r);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    student s=new student();
	    s.display(56,"Kamees");
	    s.display(65,"Kam",9765);
	}
}
