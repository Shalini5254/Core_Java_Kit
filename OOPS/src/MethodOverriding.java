public class MethodOverriding {

        void show() {
            System.out.println("Parent class");
        }
    }

    class Child extends MethodOverriding{
        void show() {
            System.out.println("Child class");
        }

        public static void main(String[] args) {
            MethodOverriding p = new Child();
            p.show();
        }
    }


