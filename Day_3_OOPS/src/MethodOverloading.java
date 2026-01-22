public class MethodOverloading {

        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        public static void main(String[] args) {
            MethodOverloading c = new MethodOverloading();
            System.out.println(c.add(10, 20));
            System.out.println(c.add(2.5, 3.5));
        }


}
