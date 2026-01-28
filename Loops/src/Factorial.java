import java.math.BigInteger;
import java.util.*;
public class Factorial {
    static BigInteger factorial(int n){
        if(n==0 || n==1)
            return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n-1));

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n=sc.nextInt();
       /* int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }*/
        System.out.println(factorial(n));
    }
}
