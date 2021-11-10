package ru.mirea.task16;

import java.util.ArrayList;
import java.util.Calendar;

public class Doctor extends Person{
    String speciality;
    int salary;
    ArrayList<Calendar> schedule;
    ArrayList<Patient> patients;

    public Doctor(String name, String phoneNum, String email, String speciality, int salary, ArrayList<Calendar> schedule, ArrayList<Patient> patients) {
        super(name, phoneNum, email);
        this.speciality = speciality;
        this.salary = salary;
    }

    public String getSpeciality() {
        return speciality;
    }

    public ArrayList<Calendar> getSchedule() {
        return schedule;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}
