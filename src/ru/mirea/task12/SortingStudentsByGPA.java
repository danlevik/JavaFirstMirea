package ru.mirea.task12;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getGpa(), o2.getGpa());
    }


}
