
    interface Interface {
        void move();
    }

    class Car implements Interface {
        public void move() {
            System.out.println("Car is moving");
        }

        public static void main(String[] args) {
            Interface v = new Car();
            v.move();
        }
    }


