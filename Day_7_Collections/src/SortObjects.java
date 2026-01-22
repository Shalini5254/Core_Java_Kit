import java.util.*;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class SortObjects {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(3, "Ravi"));
        list.add(new Student(1, "Amit"));
        list.add(new Student(2, "Neha"));

        // Sort by id
        Collections.sort(list, (a, b) -> a.id - b.id);

        System.out.println("Sorted by ID: " + list);

        // Sort by name
        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("Sorted by Name: " + list);
    }
}

