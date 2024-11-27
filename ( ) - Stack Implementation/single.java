import java.util.*;
public class single
{
    Node top;
    Node temp;
    single()
    {
        top=null;
    }
    class Node
    {
        char data;
        Node next;
        Node(char val)
        {
            data=val;
            next=null;
        }
    }
    void push(char s)
    {
        Node newnode=new Node(s);
        if(top==null)
        {
            top=newnode;
        }
        else
        {
            newnode.next=top;
            top=newnode;
        }
    }
    void add(char s)
    {
        if(s=='(')
        {
            push(s);
            if(top==null)
            {
                System.out.println(true);
            }

        }
        else if(s==')')
        {
            pop();
        }

    }
    void pop()
    {
        if(top==null)
        {
            System.out.println(false);

        }
        else
        {
            top = top.next;
        }
    }
    void disp()
    {
        if(top==null)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }


    public static void main(String[] args)
    {
        single s=new single();
//        s.add(')');
        s.add('(');
//        s.add('(');
//        s.add('(');
//        s.add(')');
//        s.add(')');
        s.add(')');



        s.disp();





    }
}
