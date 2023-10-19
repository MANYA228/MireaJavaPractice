package Practice7.Exercise3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthDate;

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFormattedBirthDate(String format) {
        SimpleDateFormat dateFormat;
        switch (format) {
            case "short":
                dateFormat = new SimpleDateFormat("dd/MM/yy");
                break;
            case "medium":
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                break;
            case "full":
                dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                break;
            default:
                dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        }
        return dateFormat.format(birthDate);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + getFormattedBirthDate("medium") +
                '}';
    }

    public static void main(String[] args) {
        // Пример использования
        Date birthDate = new Date(); // Замените на фактическую дату рождения
        Student student = new Student("Иванов", 20, birthDate);

        System.out.println(student);
        System.out.println("Short Format: " + student.getFormattedBirthDate("short"));
        System.out.println("Medium Format: " + student.getFormattedBirthDate("medium"));
        System.out.println("Full Format: " + student.getFormattedBirthDate("full"));
    }
}

