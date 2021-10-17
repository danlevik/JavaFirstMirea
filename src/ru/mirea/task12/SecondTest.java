package ru.mirea.task12;

import java.util.Arrays;


public class SecondTest {
    public static void quickSort(Student[] source, int leftBorder, int rightBorder) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source[(leftMarker + rightMarker) / 2];
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (comparator.compare(source[leftMarker], pivot) > 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (comparator.compare(source[rightMarker], pivot) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Student tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }


    public static void main(String[] args) {
        Student[] idNumber = new Student[5];
        idNumber[0] = new Student(13, "levicky", 56);
        idNumber[1] = new Student(18, "ovcharenko", 48);
        idNumber[2] = new Student(8, "ivanova", 64);
        idNumber[3] = new Student(16, "murunova", 39);
        idNumber[4] = new Student(20, "pisarev", 24);

        System.out.println(Arrays.toString(idNumber));
        quickSort(idNumber, 0, idNumber.length-1);
        System.out.println(Arrays.toString(idNumber));
    }
}
