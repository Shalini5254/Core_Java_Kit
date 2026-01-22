import java.util.*;

public class AlphabetDigitSpecial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=sc.next().charAt(0);
        if((n>='A' && n<='Z')|| (n>='a' && n<='z')){
            System.out.println("Alphabet");
        }
        else if((n >= '0' ) && (n <= '9')){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
    }
}
