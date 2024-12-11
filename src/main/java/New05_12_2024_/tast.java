package New05_12_2024_;

import java.util.Arrays;

public class tast {
    public static void main(String[] args) {
        String[] array = {"elephant", "cat", "dog"};
        Arrays.sort(array, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(array));
    }
}