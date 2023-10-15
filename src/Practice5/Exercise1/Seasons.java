package Practice5.Exercise1;

enum Seasons {
    Весна("прохладное", "Холодное время года"),
    Лето("жаркое", "Теплое время года"),
    Осень("прохладное", "Холодное время года"),
    Зима("холодное", "Холодное время года");

    private String averageTemperature;
    private String description;

    // Конструктор для времени года
    Seasons(String averageTemperature, String description) {
        this.averageTemperature = averageTemperature;
        this.description = description;
    }

    public String getDescription() {
        if (this == Лето) {
            return "Теплое время года";
        } else {
            return description;
        }
    }

    public String getAverageTemperature() {
        return averageTemperature;
    }
}
