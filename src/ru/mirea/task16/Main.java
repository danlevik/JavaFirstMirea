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
            System.out.println("Доктор " + doctor.name + " cпециальности " + doctor.speciality);
            System.out.println("И его уважаемые пациенты: ");
            for (Appointment appointment : doctor.appointments){
                System.out.println("  Дата записи: " + appointment.getDate());
                System.out.println("  Имя пациента: " + appointment.getPatient().name);
            }
        }

        System.out.println("\nВсе пациенты:");
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
            int action = 999;
                try {
                    action = sc.nextInt();
                }
                catch (InputMismatchException e) {
                    System.out.println("Вы ввели не число.");
                }

            switch (action){
                default:
                    System.out.println("Некорректный номер команды!\n");
                    break;
                case 0:
                    exit = true;
                    break;

                case 1:
                    System.out.println("ДЛЯ ОКОНЧАНИЯ ВВОДА ВМЕСТО ИМЕНИ ВВЕДИТЕ 0");

                    try {
                        System.out.print("Введите имя врача: ");
                        String name = sc.next();

                        while (!name.equals("0")) {
                            if (name.length() > 20){
                                throw new Exception("string is too long");
                            }

                            // номер телефона и почта одни у всех, нам они не особо нужны
                            String phoneNum = "88005553535";
                            String email = "doctormail@mail.ru";

                            System.out.println("Введите номер специальности врача из вариантов: ");
                            System.out.println("1 - Терапевт\n2 - Дерматолог\n3 - Педиатр\n" +
                                    "4 - Уролог\n5 - Хирург\n6 - Психиатр");
                            int speciality_num = sc.nextInt();
                            Speciality speciality;
                            switch (speciality_num){
                                case 2:
                                    speciality = Speciality.valueOf("DERMATOLOGY");
                                    break;
                                case 3:
                                    speciality = Speciality.valueOf("PEDIATRICS");
                                    break;
                                case 4:
                                    speciality = Speciality.valueOf("UROLOGY");
                                    break;
                                case 5:
                                    speciality = Speciality.valueOf("SURGERY");
                                    break;
                                case 6:
                                    speciality = Speciality.valueOf("PSYCHIATRY");
                                    break;

                                default:
                                    speciality = Speciality.valueOf("THERAPY");
                                    break;
                            }

                            System.out.print("Введите зарплату: ");
                            int salary = sc.nextInt();

                            doctors.add(new Doctor(name, phoneNum, email, speciality, salary));

                            System.out.println("Врач " + name + " добавлен в систему!\n");

                            System.out.print("Введите имя врача: ");
                            name = sc.next();
                        }
                    }
                    catch (Exception e){
                        System.out.println("Слишком длинное имя! Оно не должно превышать 20 символов.");
                    }
                    break;

                case 2:
                    System.out.println("ДЛЯ ОКОНЧАНИЯ ВВОДА ВМЕСТО ИМЕНИ ВВЕДИТЕ 0");

                    try {
                        System.out.print("Введите имя пациента: ");
                        String name = sc.next();
                        while (!name.equals("0")) {
                            if (name.length() > 20){
                                throw new Exception("string is too long");
                            }
                            // номер телефона и почта одни у всех, нам они не особо нужны
                            String phoneNum = "88886664646";
                            String email = "patientmail@mail.ru";

                            patients.add(new Patient(name, phoneNum, email));

                            System.out.println("Пациент " + name + " добавлен в систему!\n");

                            System.out.print("Введите имя пациента: ");
                            name = sc.next();
                        }
                    }
                    catch (Exception e){
                        System.out.println("Слишком длинное имя! Оно не должно превышать 20 символов.");
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
