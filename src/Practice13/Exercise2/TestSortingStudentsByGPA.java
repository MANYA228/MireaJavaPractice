package Practice13.Exercise2;

public class TestSortingStudentsByGPA {

    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 3.5),
                new Student("Alice", 4.0),
                new Student("Bob", 3.8),
                // Добавьте еще студентов по желанию
        };

        System.out.println("Исходный массив:");
        printStudents(students);

        // Используем SortingStudentsByGPA для сортировки
        SortingStudentsByGPA.quickSort(students, new SortingStudentsByGPA());

        System.out.println("\nОтсортированный массив по убыванию GPA:");
        printStudents(students);
    }

    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

