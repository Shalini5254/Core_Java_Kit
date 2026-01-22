import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>85 && n<=100){
            System.out.println("Grade: A");
        }
        else if(n>75 && n<=85){
            System.out.println("Grade: B");
        }
        else if(n>55 && n<=75){
            System.out.println("Grade: C");
        }
        else if(n>30 && n<=45){
            System.out.println("Grade: D");
        }
        else{
            System.out.println("Grade: F");
        }

    }
}
