package ru.mirea.task16;

import java.sql.Time;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Doctor> doctors = new ArrayList<Doctor>();
        ArrayList<Patient> patients = new ArrayList<Patient>();

        System.out.println("Добро пожаловать в систему! Пожалуйста выберите действия");
        userInterface(doctors, patients);

        System.out.println("Врачи:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor.name);
            for (Appointment appointment : doctor.appointments){
                System.out.println("  " + appointment.getDate());
                System.out.println("  " + appointment.getPatient().name);
            }
        }

        System.out.println("Пациенты:");
        for (Patient patient : patients) {
            System.out.println(patient.name);
        }

    }

    static void userInterface(ArrayList<Doctor> doctors, ArrayList<Patient> patients){
        boolean exit = false;
        while (!exit){
            System.out.println("0 - Закончить действия");
            System.out.println("1 - Добавить врачей в систему");
            System.out.println("2 - Добавить пациентов в систему");
            System.out.println("3 - Оформить запись");

            Scanner sc = new Scanner(System.in);

            int action = sc.nextInt();

            switch (action){
                case 0:
                    exit = true;
                    break;

                case 1:
                    System.out.println("ДЛЯ ОКОНЧАНИЯ ВВОДА ВМЕСТО ИМЕНИ ВВЕДИТЕ 0");

                    System.out.print("Введите имя врача: ");
                    String name = sc.next();

                    while (!name.equals("0")) {

                        // номер телефона и почта одни у всех, нам они не особо нужны
                        String phoneNum = "88005553535";
                        String email = "doctormail@mail.ru";

                        System.out.print("Введите специальность врача: ");
                        String speciality = sc.next();
                        System.out.print("Введите зарплату: ");
                        int salary = sc.nextInt();

                        doctors.add(new Doctor(name, phoneNum, email, speciality, salary));

                        System.out.println("Врач " + name + " добавлен в систему!\n");

                        System.out.print("Введите имя врача: ");
                        name = sc.next();
                    }
                    break;

                case 2:
                    System.out.println("ДЛЯ ОКОНЧАНИЯ ВВОДА ВМЕСТО ИМЕНИ ВВЕДИТЕ 0");

                    System.out.print("Введите имя пациента: ");
                    name = sc.next();
                    while (!name.equals("0")) {

                        // номер телефона и почта одни у всех, нам они не особо нужны
                        String phoneNum = "88886664646";
                        String email = "patientmail@mail.ru";

                        patients.add(new Patient(name, phoneNum, email));

                        System.out.println("Пациент " + name + " добавлен в систему!\n");

                        System.out.print("Введите имя пациента: ");
                        name = sc.next();
                    }
                    break;

                case 3:
                    System.out.print("Введите индекс доктора (всего доступно " + doctors.size() + " врачей): ");
                    int doc_index = sc.nextInt();
                    System.out.println("Вы выбрали доктора " + doctors.get(doc_index).name +
                            " специальности " + doctors.get(doc_index).speciality);

                    System.out.print("Введите индекс пациента (всего доступно " + patients.size() + " пациентов): ");
                    int pat_index = sc.nextInt();
                    System.out.println("Вы выбрали пациента " + patients.get(pat_index).name);

                    System.out.print("Введите дату записи в формате dd-mm-yyyy: ");
                    String strDate = sc.next();

                    patients.get(pat_index).makeAppointment(doctors.get(doc_index), strDate);

                    System.out.println("Запись добавлена");
                    break;
            }
        }

    }
}
