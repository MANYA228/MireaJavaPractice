package Practice7.Exercise1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class AssignmentDetails {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Лихов";

        // Дата и время получения задания
        String assignmentReceiveDate = "18.10.2023, 18:00";

        // Получение текущей даты и времени
        Date currentDate = new Date();

        // Форматирование текущей даты и времени
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy, HH:mm");
        String currentDateTime = dateFormat.format(currentDate);

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentReceiveDate);
        System.out.println("Текущая дата и время: " + currentDateTime);
    }
}

