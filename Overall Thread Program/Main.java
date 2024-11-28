import java.util.Scanner;
class vicky implements Runnable{
    public void run(){
        System.out.println("Hello");
 
    try {
       Thread.sleep(100) ;
    }
    catch(Exception e) {
        System.out.println(e);
    }
}
   }
public class Main
{
	public static void main(String[] args) {
	   vicky v=new vicky();
	   Thread t=new Thread(v);// Thread Runnable
	   t.start();
	   Thread t1=new Thread("Thread");// Thread String
	  System.out.println(t1.getName());
	   Thread t2=new Thread(v,"Thread1");
	  System.out.println(t2.getName());//Thread Runnable String
	 
	}
}
