import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
        int d = s.nextInt();  
        int m = n/10;
        int[] a = new int[m + 1];
        for (int i = 0; i <= m; i++) {
            a[i] = i * i;
        }
        int count = 1;
        for (int i = 1; i <= m; i++) {
            for (int j  = i+1; j <= m; j++) {
                if (a[i] + a[j] == d) {
                    count=2;
                    System.out.println(a[i]+" "+a[j]+" "+count);
                    break;
                }
                else if(a[i]+a[i]+a[i]==d){
                    count=3;
                    System.out.println( a[i]+" "+a[i]+" "+a[i]+" "+count);
                    break;
                }
                else if(a[i]+a[i]+a[j]==d){
                    count=3;
                    System.out.println( a[i]+" "+a[i]+" "+a[j]+" "+count);
                    break;
                }
                else{
                    continue;
                }
            }
        }
        
    }
}