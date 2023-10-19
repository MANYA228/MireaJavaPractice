package Practice7.Exercise4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод года, месяца и числа
        System.out.println("Введите год (yyyy):");
        int year = scanner.nextInt();
        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1; // Месяцы в Calendar начинаются с 0
        System.out.println("Введите число (1-31):");
        int day = scanner.nextInt();

        // Ввод часов и минут
        System.out.println("Введите часы (0-23):");
        int hours = scanner.nextInt();
        System.out.println("Введите минуты (0-59):");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        System.out.println("Созданный объект Date: " + date);

        // Создание объекта Calendar
        Calendar customCalendar = Calendar.getInstance();
        customCalendar.set(year, month, day, hours, minutes);

        System.out.println("Созданный объект Calendar:");
        System.out.println("Год: " + customCalendar.get(Calendar.YEAR));
        System.out.println("Месяц: " + (customCalendar.get(Calendar.MONTH) + 1)); // +1, так как месяцы в Calendar начинаются с 0
        System.out.println("День: " + customCalendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Часы: " + customCalendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Минуты: " + customCalendar.get(Calendar.MINUTE));
    }
}

