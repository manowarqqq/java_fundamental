import java.util.Arrays;
import java.util.Scanner;

public class OptionalTaskOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Введите числа массива");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));

        // 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину. (Самое маленькое число является самим коротким)
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max <
                    array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
}
}

