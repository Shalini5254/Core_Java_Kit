import java.util.*;
public class SecondLargest {
        public static void main(String[] args) {
            int[] a = {10, 5, 20, 8, 20};

            int largest = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int i = 0; i < a.length; i++) {
                if (a[i] > largest) {
                    second = largest;
                    largest = a[i];
                } else if (a[i] > second && a[i] != largest) {
                    second = a[i];
                }
            }

            System.out.println("Second Largest: " + second);
        }
    }


