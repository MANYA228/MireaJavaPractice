package Practice4.Exercise3;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        // Конструктор без параметров
        this.fullName = "Unknown";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        // Конструктор с параметрами
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " говорит");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Иванов", 30);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}
