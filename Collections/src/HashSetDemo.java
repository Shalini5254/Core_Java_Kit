import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

      /*  HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // ignored

        System.out.println(set);

       */
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Java");
        map.put(102, "Python");
        map.put(101, "C++"); // overwrites

        System.out.println(map);

    }
}

