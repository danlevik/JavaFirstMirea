package ru.mirea.task12;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Student implements Comparable<Student> {

    protected int studentId;
    protected String lastname;
    protected int gpa;

    public Student(int studentId, String lastname, int gpa) {
        this.studentId = studentId;
        this.lastname = lastname;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getLastname() {
        return lastname;
    }

    public int getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.studentId, other.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", lastname='" + lastname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
