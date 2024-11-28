
import java.util.*;
class Box
{
    double width;
    double height;
    double depth;

     public double volume(double width,double height,double depth)
    {

        this.width=width;
        this.height=height;
        this.depth=depth;
        return this.volume1();

    }
    public double volume1()
    {
        double volume=(width*height*depth);
        return volume;
    }
}

public class ques
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Box b=new Box();
        b.volume(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double ans=b.volume1();
        System.out.println(ans);

    }
}
