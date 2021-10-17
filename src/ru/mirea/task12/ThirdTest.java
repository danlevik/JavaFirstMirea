package ru.mirea.task12;

import java.util.Arrays;

public class ThirdTest {
    public static void mergeSort(Student[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(Student[] a, Student[] l, Student[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].studentId <= r[j].studentId) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void main(String[] args){
        Student[] idNumber1 = new Student[5];
        idNumber1[0] = new Student(13, "levicky", 56);
        idNumber1[1] = new Student(18, "ovcharenko", 48);
        idNumber1[2] = new Student(8, "ivanova", 64);
        idNumber1[3] = new Student(16, "murunova", 39);
        idNumber1[4] = new Student(20, "pisarev", 24);

        Student[] idNumber2 = new Student[4];
        idNumber2[0] = new Student(14, "dalbek", 48);
        idNumber2[1] = new Student(17, "uvarov", 58);
        idNumber2[2] = new Student(12, "pavlov", 62);
        idNumber2[3] = new Student(21, "squidward", 27);

        Student[] merged = new Student[9];

        mergeSort(idNumber1, idNumber1.length);
        mergeSort(idNumber2, idNumber2.length);
        merge(merged, idNumber1, idNumber2, idNumber1.length, idNumber2.length);
        System.out.println(Arrays.toString(merged));
    }
}
