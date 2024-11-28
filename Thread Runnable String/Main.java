import java.util.*;
class th implements Runnable {
public void run()
{
  int sum = 0;
  for (int i=0;i<=3;i++)
	sum+=i;
    System.out.println(sum);
    try {
        Thread.sleep(100);
    } catch(Exception e) {
        System.out.println(e);
    }
}
}
  public class Main
  {
	public static void main (String[]args)
	{
	  th s = new th ();
	  Thread t=new Thread(s); 
	  t.start();
	  //System.out.println(t.isAlive());
	  Thread t1=new Thread(s,"Lakshitha Pruthivirajan ");
	  System.out.println(t1.getName());
	   System.out.println(t1.getId());
	}
  }