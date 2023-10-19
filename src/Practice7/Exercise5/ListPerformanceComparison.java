package Practice7.Exercise5;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        int numElements = 1000000; // Количество элементов в списках
        int indexToInsert = numElements / 2; // Индекс для вставки и удаления
        int numIterations = 1000; // Количество итераций

        // Создаем ArrayList и LinkedList
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Заполняем списки
        for (int i = 0; i < numElements; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Измеряем время вставки в ArrayList
        long startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.add(indexToInsert, i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertTime = endTime - startTime;
        System.out.println("ArrayList вставка: " + arrayListInsertTime + " наносекунд");

        // Измеряем время вставки в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.add(indexToInsert, i);
        }
        endTime = System.nanoTime();
        long linkedListInsertTime = endTime - startTime;
        System.out.println("LinkedList вставка: " + linkedListInsertTime + " наносекунд");

        // Измеряем время удаления из ArrayList
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.remove(indexToInsert);
        }
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;
        System.out.println("ArrayList удаление: " + arrayListRemoveTime + " наносекунд");

        // Измеряем время удаления из LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.remove(indexToInsert);
        }
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;
        System.out.println("LinkedList удаление: " + linkedListRemoveTime + " наносекунд");

        // Измеряем время поиска по образцу в ArrayList
        int searchElement = numElements / 2;
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            arrayList.indexOf(searchElement);
        }
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;
        System.out.println("ArrayList поиск: " + arrayListSearchTime + " наносекунд");

        // Измеряем время поиска по образцу в LinkedList
        startTime = System.nanoTime();
        for (int i = 0; i < numIterations; i++) {
            linkedList.indexOf(searchElement);
        }
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;
        System.out.println("LinkedList поиск: " + linkedListSearchTime + " наносекунд");
    }
}

