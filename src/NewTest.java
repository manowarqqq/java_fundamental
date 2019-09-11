import java.util.Arrays;
import java.util.Scanner;

public class NewTest {
    public static void main(String[] args) {
        int[] numbers = {12345, 4545};
        System.out.println(Arrays.toString(getDigitCount(numbers)));


    }


    public static int[] getDigitCount(int[] numbers) {
        int[] digitsCount = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != 0) {
                digitsCount[(int) (numbers[i] % 10)]++;
                numbers[i] /= 10;

            }
        }
        return digitsCount;

    }
}