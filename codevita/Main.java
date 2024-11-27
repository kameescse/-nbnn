import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String str="";
    int a=0;
    int b=0;
    int a1=0;
    int b1=0;
    int pos=0;
    int res=0;
    int[] ans=new int[n];
    
    for(int in=0;in<n;in++)
    {
      str="";
      res=0;
      a=0;
      b=0;
      str=sc.next();
      a=sc.nextInt();
      b=sc.nextInt();
      for(int i=0;i<str.length();i++)
      {
        
        if(str.charAt(i)=='1')
        {
          a1++;
        } 
        else if(str.charAt(i)=='0')
        {
          continue;
        }
        else
        {
          System.out.println("INVALID");
          break;
        }
        if(i==str.length()-1)
        {
          res=((a*a1)+(b*b1));
          ans[pos]=res;
          pos++;
          
          
        }
        
        
      }  
     
    }  
     for(int out=0;out<pos;out++)
        {
          System.out.println(ans[out]);
        }
  }
}  