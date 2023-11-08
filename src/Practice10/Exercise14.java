package Practice10;

public class Exercise14{
    public static void main(String[] args) {
        int number = 12345;
        printDigits(number);
    }

    public static void printDigits(int n) {
        if (n < 10) {
            // Если число меньше 10, выводим его и завершаем рекурсию
            System.out.print(n + " ");
        } else {
            // Рекурсивно вызываем функцию для числа без последней цифры
            printDigits(n / 10);
            // Выводим последнюю цифру
            System.out.print(n % 10 + " ");
        }
    }
}
