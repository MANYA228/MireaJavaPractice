package Practice5.Exercise1;

public class Main {
    public static void main(String[] args) {
        // 1) Создаем переменную, содержащую любимое время года и распечатываем информацию о нем.
        Seasons favoriteSeason = Seasons.Лето;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // 2) Создаем метод, который выводит информацию о времени года.
        printSeasonInfo(Seasons.Зима);

        // 3) Используя цикл, распечатаем все времена года, среднюю температуру и описание.
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " - Средняя температура: " + season.getAverageTemperature() +
                    " - " + season.getDescription());
        }
    }

    // Метод для вывода информации о времени года с использованием оператора switch
    public static void printSeasonInfo(Seasons season) {
        switch (season) {
            case Лето:
                System.out.println("Я люблю лето");
                break;
            case Весна:
                System.out.println("Весна прекрасна");
                break;
            case Осень:
                System.out.println("Осень - время урожая");
                break;
            case Зима:
                System.out.println("Зима - сказочное время года");
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }
}
