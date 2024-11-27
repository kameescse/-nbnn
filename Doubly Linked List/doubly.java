import java.util.*;
public class doubly
{
    Node head;
    Node temp;
    doubly()
    {
       head=null;

    }
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int val)
        {
            data=val;
            prev=null;
            next=null;
        }
    }
    void beg(int val)
    {


            Node newnode=new Node(val);
            if(head==null)
            {
                head=newnode;
            }
            else
            {


                head.prev=newnode;
                newnode.next=head;
                head=newnode;
            }


    }
    void inspos(int pos,int val)
    {
        
    }
    void display()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        doubly d=new doubly();
        d.beg(4);
        d.beg(5);
        d.beg(6);
        d.display();
        d.inspos(1,8);


    }
}
