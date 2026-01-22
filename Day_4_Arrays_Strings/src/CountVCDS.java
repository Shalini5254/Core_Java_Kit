public class CountVCDS {
    public static void main(String[] args) {
        String s = "Java 8 is awesome";

        int v = 0, c = 0, d = 0, sp = 0;

        for (char ch : s.toCharArray()) {
            if ("AEIOUaeiou".indexOf(ch) != -1)
                v++;
            else if (Character.isLetter(ch))
                c++;
            else if (Character.isDigit(ch))
                d++;
            else if (ch == ' ')
                sp++;
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Spaces: " + sp);
    }
}

