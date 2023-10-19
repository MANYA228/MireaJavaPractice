package HomeWorkAnimals;

import java.util.ArrayList;
import java.util.List;

public class AnimalApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        // Добавляем котов
        animals.add(new Cat("Барсик", 3));
        animals.add(new Cat("Мурзик", 5));

        // Добавляем собак
        animals.add(new Dog("Улыбака", 2));
        animals.add(new Dog("Рекс", 4));

        // Выводим список животных и их типы
        System.out.println("Список животных:");
        for (Animal animal : animals) {
            System.out.println(animal.getType() + " " + animal.getName() + ", возраст " + animal.getAge() + " лет");
        }

        // Выборка кошек по возрасту
        int catAgeLimit = 4;
        System.out.println("\nКошки старше " + catAgeLimit + " лет:");
        for (Animal animal : animals) {
            if (animal instanceof Cat && animal.getAge() > catAgeLimit) {
                System.out.println(animal.getType() + " " + animal.getName() + ", возраст " + animal.getAge() + " лет");
            }
        }
    }
}
