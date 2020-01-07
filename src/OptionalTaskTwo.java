import java.util.Arrays;
import java.util.Scanner;

public class OptionalTaskTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] array = new int[scan.nextInt()];
        System.out.println("Введите числа миссива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        int[] numbers = Arrays.copyOf(array, array.length);
        int minIndexinArray = 0;
        int[] digitsCount = new int[10];
        int[] differentDigitsCount = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != 0) {
                digitsCount[Math.abs((numbers[i] % 10))]++;
                numbers[i] /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (digitsCount[j] > 0) differentDigitsCount[i]++;
            }
            digitsCount = new int[10];
        }
        int min = differentDigitsCount[0];
        for (int i = 0; i < differentDigitsCount.length; i++) {
            if (differentDigitsCount[i] < min) {
                min = differentDigitsCount[i];
                minIndexinArray = i;
            }
        }
        System.out.println("Число, в котором количество различных цифр минимально: " + array[minIndexinArray]);
    }
}