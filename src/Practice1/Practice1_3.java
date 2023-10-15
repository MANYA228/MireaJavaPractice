import java.util.Scanner;
public class Practice1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("Сумма элементов массива: " + sum);
        double average = (double) sum / size;
        System.out.println("Среднее арифметическое элементов массива: " + average);
    }
}
