package Practice13.Exercise1;

public class StudentTest {

    public static void main(String[] args) {
        // Создаем массив объектов класса Student
        Student[] students = {
                new Student("Anna", 543),
                new Student("Michael", 321),
                new Student("Sophie", 987),
                // Добавьте еще студентов по желанию
        };

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        printStudents(students);

        // Сортируем массив по полю iDNumber методом сортировки вставками
        insertionSort(students);

        // Выводим отсортированный массив
        System.out.println("\nОтсортированный массив:");
        printStudents(students);
    }

    // Метод для вывода массива студентов
    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Метод сортировки вставками
    private static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; ++i) {
            Student key = students[i];
            int j = i - 1;

            // Перемещаем элементы массива, которые больше key, на одну позицию вперед
            while (j >= 0 && students[j].getiDNumber() > key.getiDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}


