import java.util.*;

public class ReversePalindromCheckOfNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev = 0, temp = n;

        while(n > 0){
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        System.out.println("Reverse: " + rev);

        System.out.println(temp == rev ? "Palindrome" : "Not Palindrome");

    }
}
