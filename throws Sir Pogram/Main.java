import java.util.*;
class kamish extends Exception{
    kamish()
    {
        super("kamish is palyboy");
    }
    kamish(String s)
    {
        super("kamish is not a play boy");
    }
}
public class Main{
    public static void main (String[] args) throws kamish{
        Scanner sc=new Scanner (System.in);
        if(10==10)
        {
            throw new kamish("hai");
        }
    }
}0