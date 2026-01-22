//class bank-sbi
    class RuntimePolymorphism {
        void interest() {
            System.out.println("General interest");
        }
    }

    class SBI extends RuntimePolymorphism {
        void interest() {
            System.out.println("SBI interest 6%");
        }

        public static void main(String[] args) {
            RuntimePolymorphism b = new SBI();   // runtime polymorphism
            b.interest();
        }
    }


