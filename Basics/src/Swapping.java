import java.util.*;
public class Swapping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a element:");
        int a=sc.nextInt();
        System.out.println("Enter b element:");
        int b=sc.nextInt();
        System.out.println("Before Swaping:");
        System.out.println("Value of a: "+a+" \n Value of b: "+b);
       /*
       -----Without Using temp------
        a=a+b;  //a*b
        b=a-b;  //a/b
        a=a-b;  //a/b
        */
        // Using Temp variable
        int temp=a;
        a=b;
        b=temp;


        System.out.println("After Swaping:");
        System.out.println("Value of a: "+a+" \n Value of b: "+b);
    }
}
