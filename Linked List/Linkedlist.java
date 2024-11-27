import java.util.*;


public class Linkedlist
{

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
    Node temp;
    Node head;
    Node prev;
    Linkedlist()
    {
          head=null;
    }
    void InsertAtBeginning(int val)
    {
        if(head==null) {
            Node newnode = new Node(val);
            head = newnode;
        }
        else
        {
            Node newnode=new Node(val);
            newnode.next=head;
            head=newnode;

        }
    }
    void deleteAtPos(int val)
    {
        prev=head;
        temp=head;
        for(int i=0;i<val-1;i++)
        {

            prev=prev.next;
            temp=temp.next;
        }
        temp=temp.next;
        prev.next=temp.next;

    }
    void insertAtPos(int pos,int val)
    {

        Node newnode=new Node(val);
        temp=head;
        prev=head;

        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
            if(temp==null)
            {
                throw new ArithmeticException("It is error bro00");
            }

        }
        newnode.next=temp.next;
        temp.next=newnode;


    }
    void insertAtEnd(int val)
    {
        Node newnode=new Node(val);
        temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newnode;
    }
    
    void display()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {

        Linkedlist li=new Linkedlist();
        li.InsertAtBeginning(5);
        li.InsertAtBeginning(40);
        li.InsertAtBeginning(40);
        li.InsertAtBeginning(50);
        li.InsertAtBeginning(60);
        li.InsertAtBeginning(70);
        li.deleteAtPos(2);
        li.insertAtPos(5,33);
        li.insertAtEnd(65);

        li.display();
    }
}
