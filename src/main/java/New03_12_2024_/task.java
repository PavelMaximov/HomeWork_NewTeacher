package New03_12_2024_;

public class task {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 2, 2, 3, 3};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(count);
    }
    }


