import java.util.*;
public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element:");
        int a=sc.nextInt();
        System.out.println("Enter b element:");
        int b=sc.nextInt();
        System.out.println("Choose operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        int ch=sc.nextInt();
        int c;
        switch (ch){
            case 1: c=a+b;
                   System.out.println("Addition of numbers: "+c);
                   break;
            case 2:c=a-b;
                System.out.println("Subtraction of numbers: "+c);
                break;
            case 3:c=a*b;
                System.out.println("Multiplication of numbers: "+c);
                break;
            case 4:c=a/b;
                System.out.println("Division of numbers: "+c);
                break;
            case 5:c=a%b;
                System.out.println("Modulo-Division of numbers: "+c);
                break;
            default:System.out.println("Invalid operation");
                break;
        }
    }
}
