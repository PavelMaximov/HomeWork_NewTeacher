package New03_12_2024_;

public class task {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5};
        int sum = 0;
        boolean foundNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (foundNegative && array[i] > 0) {
                sum += array[i];
            }

            if (array[i] < 0 && !foundNegative) {
                foundNegative = true;
            }
        }

        System.out.println("Сумма положительных элементов после первого отрицательного: " + sum);
    }
    }


