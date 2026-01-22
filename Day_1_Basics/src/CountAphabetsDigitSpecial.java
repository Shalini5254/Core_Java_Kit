import java.util.*;

public class CountAphabetsDigitSpecial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input: ");
        String line= sc.nextLine();

       String alphabets="";
       String digit="";
       String special="";

       int alphacount=0;
       int digitcount=0;
       int specialcount=0;

       for(int i=0;i<line.length();i++){
          char ch= line.charAt(i);
           if(Character.isLetter(ch)){
               alphabets+=ch;
               alphacount++;
           }
            else if(Character.isDigit(ch)){
                digit+=ch;
                digitcount++;
           }
            else if(!Character.isWhitespace(ch)){
                special+=ch;
                specialcount++;
           }
       }
        System.out.println("Alphabets "+alphabets);
        System.out.println("Alphabets Count: "+alphacount);
        System.out.println("Digits "+digit);
        System.out.println("Digits Count: "+digitcount);
        System.out.println("Special characters "+special);
        System.out.println("Special_Characters Count: "+specialcount);
    }
}
