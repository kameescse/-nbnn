import java.util.*;
class emp
{
    Scanner sc=new Scanner(System.in);
//  int u=sc.nextInt(); 
  int subashno;
  String subashitem;
  public void show ()
  {
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt ();
    int b=sc.nextInt();
	  System.out.println();
	  System.out.println (a+b);
// 	  System.out.println(u);
  }
}
public class Main
{
  static int subash1 ()
  {
	Scanner sc = new Scanner (System.in);
	int a = 10;
	int b = 20;
	int c = a + b;

	  System.out.println (c);
	  return c;
  }
  public static void main (String[]args)
  {
	subash1 ();
	emp e1 = new emp ();
	e1.subashno = 12;
	System.out.println(e1.subashno);
	e1.show ();
  }
}
