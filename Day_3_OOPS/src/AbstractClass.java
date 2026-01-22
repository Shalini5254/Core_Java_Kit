
    abstract class AbstractClass {
        abstract void area();
    }

    class Circle extends AbstractClass {
        void area() {
            System.out.println("Area = πr²");
        }

        public static void main(String[] args) {
            AbstractClass s = new Circle();
            s.area();
        }
    }


