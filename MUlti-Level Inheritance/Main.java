import java.util.*;
class kamees
{
    void display()
    {
        System.out.println("Kamees is a good boy");
    }
}
class subash extends kamees
{
    public void show()
    {
        System.out.println("Subash is a fake friend");
    }
}
class misbah extends subash
{
    public void help()
    {
        System.out.println("Misbah is a Topper");
    }
}



public class Main
{
	public static void main(String[] args) 
	{
		kamees r=new kamees();
		r.display();
	
		
		subash s=new subash();
		s.show();
		s.display();
		misbah m=new misbah();
		m.help();
	}
}
