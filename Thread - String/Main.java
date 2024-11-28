import java.util.*;
class th extends Thread{
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
	  s.start();
	  Thread t=new Thread("Lakshitha Pruthivirajan ");
	  System.out.println(t.getName());
	}
  }
