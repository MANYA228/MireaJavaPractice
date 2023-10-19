package Practice7.Exercise2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Получение текущей даты и времени
        Date currentDate = new Date();

        // Форматтер для преобразования строк в даты
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        // Ввод даты от пользователя
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате dd.MM.yyyy HH:mm:ss: ");
        String userInput = scanner.nextLine();

        try {
            // Преобразование введенной строки в дату
            Date userDate = dateFormat.parse(userInput);

            // Сравнение дат
            int comparisonResult = currentDate.compareTo(userDate);

            if (comparisonResult < 0) {
                System.out.println("Введенная дата больше текущей даты.");
            } else if (comparisonResult > 0) {
                System.out.println("Введенная дата меньше текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка при разборе даты. Убедитесь, что вы ввели дату в правильном формате.");
        }
    }
}
