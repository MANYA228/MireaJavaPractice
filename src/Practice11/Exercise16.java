package Practice11;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        int[] result = countMaxElements();
        System.out.println("Наибольшее число: " + result[0]);
        System.out.println("Количество элементов, равных максимуму: " + result[1]);
    }

    public static int[] countMaxElements() {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;

        while (true) {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }

            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count++;
            }
        }

        int[] result = { max, count };
        return result;
    }
}

