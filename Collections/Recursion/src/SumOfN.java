public class SumOfN {
    static int sumOf(int n,int d){
        if(n==0){
            return 0;
        }
        int lastdigit=n%10;
        return lastdigit+sumOf(n/10,d-1);
    }
    public static void main(String[] args){
        int n = 12345;
        int digits = (int)Math.log10(n) + 1;

        System.out.println(sumOf(n, digits));

    }
}
