import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  sum = 0, temp = n;

        while(temp > 0){
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }

        System.out.println(sum == n ? "Armstrong" : "Not Armstrong");

    }
}
