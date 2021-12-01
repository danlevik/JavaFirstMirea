package ru.mirea.task16;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;

enum Speciality {
    THERAPY{
        public String getName() {return "Терапевт";}
    },
    DERMATOLOGY {
        public String getName() {return "Дерматолог";}
    },
    PEDIATRICS{
        public String getName() {return "Педиатр";}
    },
    UROLOGY{
        public String getName() {return "Уролог";}
    },
    SURGERY{
        public String getName() {return "Хирург";}
    },
    PSYCHIATRY{
        public String getName() {return "Психиатр";}
    }
}

public class Doctor extends Person{
    Speciality speciality;
    int salary;
    ArrayList<Appointment> appointments;
    ArrayList<Calendar> schedule;
    ArrayList<Patient> patients;

    public Doctor(String name, String phoneNum, String email, Speciality speciality, int salary) {
        super(name, phoneNum, email);
        this.appointments = new ArrayList<Appointment>();
        this.schedule = new ArrayList<Calendar>();
        this.patients = new ArrayList<Patient>();

        this.speciality = speciality;
        this.salary = salary;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public ArrayList<Calendar> getSchedule() {
        return schedule;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void addAppointment(Date date, Patient patient){
        appointments.add(new Appointment(date, patient));
    }
}
