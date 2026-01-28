import java.util.*;
 class PowerOf2 {
    static boolean power(int n){
        if(n==1)
            return  true;
        if(n<=0)
            return  false;
        if(n%2!=0)
           return false;

        return power(n/2);
    }
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter the value:");
      int n=sc.nextInt();
      System.out.print(power(n));
    }
}
