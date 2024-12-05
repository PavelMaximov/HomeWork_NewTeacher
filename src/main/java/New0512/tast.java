package New0512;

import java.util.Arrays;

public class tast {
    public static void main(String[] args) {
        String[] array = {"apple pie", "banana bread", "cherry tart"};
        String target = "bread";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains(target)) {
                count++;
            }
        }

        String[] newArray = new String[array.length - count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].contains(target)) {
                newArray[index] = array[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}

