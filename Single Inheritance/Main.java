

import java.util.*;
class animal
{
    void buffollo()
    {
        System.out.println("This Buffollo is Beautiful");
    }
    void cow()
    {
        System.out.println("Cow gives milk");
    }
}
class insect extends animal
{
    void ant()
    {
        System.out.println("Ant is very smallest insect");
    }
}
public class Main
{
    public static void main(String[] args)
    {
        animal a=new animal();
        a.buffollo();
        a.cow();
        insect i=new insect();
        i.ant();


    }
}