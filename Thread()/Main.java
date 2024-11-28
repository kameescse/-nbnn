import java.util.*;
class th extends Thread{
public void run()
{
  int sum = 0;
  for (int i=0;i<=3;i++)
	sum+=i;
    System.out.println(sum);
}
}
  public class Main
  {
	public static void main (String[]args)
	{
	  th s = new th ();
	  s.start();
	}
  }
