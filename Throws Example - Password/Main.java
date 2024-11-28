import java.util.Scanner;
        class Mobile extends Exception{
            Mobile(){
                super("Password Unlocked");
            }
            Mobile(String s){
                super("Password Mismatched");
            }
        }
    public class Main{
        static void namefinder(String a)throws Mobile{
           
            String d="vicky";
            if(a.equals(d)){
                throw new Mobile();
            }
            else{
                throw new Mobile("don't unlock");
            }
        }
    public static void main(String[] args)throws Mobile{
        Scanner sc=new Scanner(System.in);
        String v=sc.next();
        try {
            namefinder(v);
        } catch(Mobile e) {
            System.out.println(e);
        }
    }
}