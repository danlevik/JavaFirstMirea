package ru.mirea.task12;

import java.util.Arrays;

public class FirstTest {

    public static void insertionSort(Student[] students){
        for (int left = 0; left < students.length; left++) {
            // Вытаскиваем значение элемента
            Student value = students[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (students[i].compareTo(value) > 0) {
                    students[i + 1] = students[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            students[i + 1] = value;
        }
    }

    public static void main(String[] args){
        Student[] idNumber = new Student[5];
        idNumber[0] = new Student(13, "levicky", 56);
        idNumber[1] = new Student(18, "ovcharenko", 48);
        idNumber[2] = new Student(8, "ivanova", 64);
        idNumber[3] = new Student(16, "murunova", 39);
        idNumber[4] = new Student(20, "pisarev", 24);

        System.out.println(Arrays.toString(idNumber));
        insertionSort(idNumber);
        System.out.println(Arrays.toString(idNumber));
    }
}
