package Practice13.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedStudentLists {

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("John", 3.5));
        list1.add(new Student("Alice", 4.0));
        list1.add(new Student("Bob", 3.8));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 3.9));
        list2.add(new Student("Diana", 3.7));

        System.out.println("List 1:");
        printStudents(list1);

        System.out.println("\nList 2:");
        printStudents(list2);

        List<Student> mergedList = mergeSortedLists(list1, list2);

        System.out.println("\nMerged and Sorted List:");
        printStudents(mergedList);
    }

    private static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();

        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() >= list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    private static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
