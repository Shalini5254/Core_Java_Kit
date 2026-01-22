import java.util.*;

public class FrequencyCount {
    public static void main(String[] args) {

        String s = "programming";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}

