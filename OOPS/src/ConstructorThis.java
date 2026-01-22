public class ConstructorThis {

        int age;
        String name;

    ConstructorThis() {
            this(20, "Unknown");
        }

    ConstructorThis(int age, String name) {
            this.age = age;
            this.name = name;
        }

        void show() {
            System.out.println(age + " " + name);
        }

        public static void main(String[] args) {
            ConstructorThis p1 = new ConstructorThis();
            ConstructorThis p2 = new ConstructorThis(25, "Amit");
            p1.show();
            p2.show();
        }


}


