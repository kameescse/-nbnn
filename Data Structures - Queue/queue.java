import java.util.*;
public class queue
{
    Node first;
    Node temp;
    Node last;
    class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;
        }
    }
    queue()
    {
        first=null;
        last=null;
    }
    public void enqueue(int val)
    {
        Node newnode=new Node(val);
        if(first==null)
        {
            first=newnode;
            last=newnode;
        }
        else
        {
            last.next=newnode;
            last=newnode;
        }
    }
    public void dequeue()
    {
        if(first==null)
        {
            throw new ArithmeticException("Joker Boy");
        }
        if(first.next==null)
        {
            first=null;
        }
        else
        {
            first=first.next;
        }
    }
    public void display()
    {
        temp=first;

        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {

        queue q=new queue();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(1);
        q.dequeue();
        q.dequeue();
        q.enqueue(12);
        q.display();

    }
}

















