import java.util.*;
    class Student {
        int id;
        String name;
        double marks;

        void display() {
            System.out.println(id + " " + name + " " + marks);
        }
    }

    public class StudentTest {
        public static void main(String[] args) {

            Student s1 = new Student();
            s1.id = 101;
            s1.name = "Rahul";
            s1.marks = 85.5;

            s1.display();
        }
    }


