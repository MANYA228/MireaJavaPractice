package Practice11;

public class Exercise15 {
    public static void main(String[] args) {
        int number = 12345;
        printDigitsReverse(number);
    }

    public static void printDigitsReverse(int n) {
        if (n < 10) {
            // Если число меньше 10, выводим его и завершаем рекурсию
            System.out.print(n + " ");
        } else {
            // Выводим последнюю цифру
            System.out.print(n % 10 + " ");
            // Рекурсивно вызываем функцию для числа без последней цифры
            printDigitsReverse(n / 10);
        }
    }
}
