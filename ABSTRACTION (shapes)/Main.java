import java.util.*;
import java.util.Scanner;
abstract class Shape
{
  int a, b;

  abstract void printArea ();
}

class Rectangle extends Shape
{
  Rectangle (int a, int b)
  {
	this.a = a;
	this.b = b;
  }
  void printArea ()
  {
	System.out.println ("Area of Rectangle" + (a * b));
  }

}

class Triangle extends Shape
{
  Triangle (int a, int b)
  {
	this.a = a;
	this.b = b;
  }
  void printArea ()
  {
	System.out.println ("Area of Triangle" + (1 / 2 * a * b));
  }
}

class Circle extends Shape
{
  Circle (int a)
  {
	this.a = a;
  }
  void printArea ()
  {
	System.out.println ("Area of Circle" + 3.14 * a);
  }
}

public class Main
{
  public static void main (String args[])
  {
	Scanner sc = new Scanner (System.in);
	int a = sc.nextInt ();
	int b = sc.nextInt ();
	Rectangle r = new Rectangle (a, b);
	Triangle t = new Triangle (a, b);
	Circle c = new Circle (a);
	  r.printArea ();
	  t.printArea ();
	  c.printArea ();

  }
}
