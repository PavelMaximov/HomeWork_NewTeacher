package New05_12_2024_;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTasksWithStringsAndIntsB {

    // 11. Отсортировать массив строк по длине.
    public static void task11() {
        String[] array = {"elephant", "cat", "dog"};
        Arrays.sort(array, (a, b) -> a.length() - b.length());

        System.out.println(Arrays.toString(array));
    }


    // 12. Найти и вывести все строки одинаковой длины.
    public static void task12() {
        String[] array = {"apple", "banana", "cherry", "dog", "cat"};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].length() == array[j].length()) {
                    System.out.println("Строки одинаковой длины: " + array[i] + " и " + array[j]);
                }
            }
        }
    }

    // 13. Сравнить содержимое двух массивов целых чисел.
    public static void task13() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);

        System.out.println("Массивы равны: " + areEqual);
    }
    

    // 14. Генерация нового массива из сумм элементов двух массивов.
    public static void task14() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
    }

    // 15. Найти уникальные значения в массиве строк.
    public static void task15() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
        boolean isUnique = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i].equals(array[j])) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("array[" + i + "] = " + array[i] + " is unique");
            }
            isUnique = true;
        }
    }

    // 16. Удалить дубликаты из массива строк.
    public static void task16() {
        String[] array = {"apple", "banana", "apple", "cherry", "banana"};
    }

    // 17. Объединить два массива строк в один.
    public static void task17() {
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};

        String[] arrayCombined = new String[array1.length + array2.length];
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            arrayCombined[j] = array1[i];
            j++;
        }

        for (int i = 0; i < array2.length; i++) {
            arrayCombined[j] = array2[i];
            j++;
        }
        System.out.println(array1.length + array2.length);
    }

    // 18. Проверить, упорядочен ли массив строк по алфавиту.
    public static void task18() {
        String[] array = {"apple", "banana", "cherry"};
    }

    // 19. Найти строки, начинающиеся с заданной буквы.
    public static void task19() {
        String[] array = {"apple", "banana", "apricot", "cherry"};
        char target = 'a';
    }

    // 20. Создать массив строк из первых букв элементов другого массива.
    public static void task20() {
        String[] array = {"apple", "banana", "cherry"};
        ArrayList<String> listUniqueLetters = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                boolean isUnique = true;
                for (int l = 0; l < listUniqueLetters.size(); l++) {
                    if (array[i].charAt(j) == listUniqueLetters.get(l).charAt(0)) {
                        isUnique = false;
                        break;
                    }
                }
                if (isUnique) {
                    listUniqueLetters.add(String.valueOf(array[i].charAt(j)));
                }
            }
        }
        System.out.println("listUniqueLetters = " + listUniqueLetters);
    }
}