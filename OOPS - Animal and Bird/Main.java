import java.util.*;
class Animal
{
    void eat()
    {
        System.out.println("Animal CLass Eat Method");
    }
    void sleep()
    {
        System.out.println("Animal Class Sleep method");
    }
}
class Bird extends Animal
{
    void fly()
    {
        System.out.println("Bird class FLy method");
    }
}
public class prob1
{
    public static void main(String[] args)
    {
        Animal a=new Animal();
        a.eat();
        a.sleep();
        Bird b=new Bird();
        b.fly();
        b.eat();
        b.sleep();

    }
}
