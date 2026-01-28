import java.util.*;

// every number is the sum of previous two numbers
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f0=0;
        int f1=1;
        int f2=0;
        System.out.print(f0+" "+f1+" ");
        for(int i=0;i<=n;i++){
             f2=f0+f1;
             System.out.print(f2+" ");
             f0=f1;
             f1=f2;
        }

    }
}
