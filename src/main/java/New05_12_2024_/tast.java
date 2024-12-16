package New05_12_2024_;

import java.util.Arrays;

public class tast {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] oddArray = new int[oddCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[index] = array[i];
                index++;
            }
        }
        for (int i = 0; i < oddArray.length; i++) {
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();
    }
}