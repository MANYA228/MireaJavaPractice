package Practice4.Exercise7;

public class StudentApp {
    public static void main(String[] args) {
        Student учащийся1 = new Schoolboy("Иван", 15, 9);
        Student учащийся2 = new Schoolboy("Мария", 14, 8);
        Student учащийся3 = new Student4("Петр", 20, "Институт технологий");

        Student[] учащиеся = {учащийся1, учащийся2, учащийся3};

        System.out.println("Школьники:");
        for (Student ученик : учащиеся) {
            if (ученик instanceof Schoolboy) {
                ((Schoolboy) ученик).ходитьВШколу();
            }
        }

        System.out.println("\nСтуденты:");
        for (Student ученик : учащиеся) {
            if (ученик instanceof Student4) {
                ((Student4) ученик).учитьсяВУниверситете();
            }
        }
    }
}
