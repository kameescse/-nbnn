import java.util.*;
class student
{
    int number;
    String name;
    int rollno;
    student(int n,String s)
    {
        number=n;
        name=s;
         
    }
    public void display()
    {
        System.out.println(number+" "+name);
    }
   
    student(int n,String s,int b)
    {
        number=n;
        name=s;
        rollno=b;
    }
     public void show()
    {
        System.out.println(number+" "+name+" "+rollno);
    }
    
}
public class Main
{
	public static void main(String[] args) 
	{
		student s=new student(81,"Pragadees");
		student s1=new student(79,"Misbah");
		student s2=new student(81,"Abishek",8);
		s.display();
		s2.show();
	}
}
