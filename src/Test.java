import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1235211, 1122897, 123123, 1};
        int maxIndex = 0;
        int[] buff = new int[0];
        int[] diffDigit = getSomething(numbers);
        int min = diffDigit[0];
        for (int k = 0; k < diffDigit.length; k++) {
            if (diffDigit[k] < min) {
                maxIndex = k;
            }
        }
        System.out.println(Arrays.toString(diffDigit));
        System.out.println(maxIndex);
        System.out.println(Arrays.toString(numbers));

    }


    public static int[] getSomething(int[] numbers) {
        int[] digitsCount = new int[10];
        int differentDigitsCount[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != 0) {
                digitsCount[(int) (numbers[i] % 10)]++;
                numbers[i] /= 10;
            }
            for (int j = 0; j < 10; j++) {
                if (digitsCount[j] > 0) differentDigitsCount[i]++;
            }
            digitsCount = new int[10];
        }
        return differentDigitsCount;
    }

}
