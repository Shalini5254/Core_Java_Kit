import java.util.*;

public class GcdLcmHcf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int x = a, y = b;

        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }

        int gcd = x;   // same as HCF
        int hcf = gcd;

        int lcm = (a * b) / gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}
