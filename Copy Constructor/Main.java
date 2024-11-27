import java.util.*;
class student
{
    int id;
    String bag;
     student(int n,String s)
    {
        id=n;
        bag=s;
    }

             student(student b) {
                id=b.id;
                bag=b.bag;

            }
            void display ()

            {
                System.out.println(id + " " + bag);
            }
        }

public class Main
{
    public static void main(String[] args)
    {
        student s=new student(154,"subash");
        student s1=new student(s);
        s.display();

    }
}

