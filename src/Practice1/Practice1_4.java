import java.util.Scanner;
public class Practice1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sumDoWhile = 0;
        int sumWhile = 0;
        int max = array[0];
        int min = array[0];

        int i = 0;
        do {
            sumDoWhile += array[i];
            i++;
        } while (i < size);

        i = 0;
        while (i < size) {
            sumWhile += array[i];
            i++;
        }

        i = 1;
        while (i < size) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            i++;
        }
        System.out.println("Сумма элементов массива (цикл do-while): " + sumDoWhile);
        System.out.println("Сумма элементов массива (цикл while): " + sumWhile);
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);
    }
}
