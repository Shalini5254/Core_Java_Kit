
    class StaticKeyword  {
        static int count = 0;

        StaticKeyword () {
            count++;
        }

        static void show() {
            System.out.println("Count = " + count);
        }

        public static void main(String[] args) {
            new StaticKeyword ();
            new StaticKeyword ();
            StaticKeyword .show();
        }
    }


