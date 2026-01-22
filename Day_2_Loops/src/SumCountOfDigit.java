import java.util.*;

public class SumCountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int sum = 0, count = 0;

        while (n > 0) {
            int d = n % 10;
            sum += d;
            count++;
            n /= 10;
        }

        System.out.println("Sum of digits = " + sum);
        System.out.println("Count of digits = " + count);
    }
}

