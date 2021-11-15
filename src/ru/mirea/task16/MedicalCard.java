package ru.mirea.task16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MedicalCard {
    ArrayList<Analysis> analyzes;
    ArrayList<Note> medicalHistory;
    ArrayList<Prescription> prescriptions;

    public MedicalCard() {
        analyzes = new ArrayList<Analysis>();
        medicalHistory = new ArrayList<Note>();
        prescriptions = new ArrayList<Prescription>();
    }

    public ArrayList<Analysis> getAnalyzes() {
        return analyzes;
    }

    public ArrayList<Note> getMedicalHistory() {
        return medicalHistory;
    }

    public void addAnalysis(){
        System.out.println("Введите дату (ДД-ММ-ГГГГ): ");
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

        try {
            Date date = formatter.parse(strDate);

            System.out.println("Введите тип анализа: ");
            String analysisType = sc.nextLine();

            System.out.println("Введите результаты анализов: ");
            String results = sc.nextLine();

            this.analyzes.add(new Analysis(date, analysisType, results));
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void addNote(){
        System.out.println("Введите дату (ДД-ММ-ГГГГ): ");
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

        try {
            Date date = formatter.parse(strDate);

            System.out.println("Введите название заболевания: ");
            String analysisType = sc.nextLine();

            System.out.println("Введите статус заболевания: ");
            String results = sc.nextLine();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public void addPrescription(){
        System.out.println("Введите дату (ДД-ММ-ГГГГ): ");
        Scanner sc = new Scanner(System.in);
        String strDate = sc.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy", Locale.ENGLISH);

        try {
            Date date = formatter.parse(strDate);

            System.out.println("Введите количество лекарств: ");

            ArrayList<String> drugs = new ArrayList<String>();
            int n = sc.nextInt();
            for (int i = 0; i < n; i++){
                System.out.println("Введите название лекарства №" + (i + 1) + ": ");
                String drug = sc.nextLine();
                drugs.add(drug);
            }

            System.out.println("Введите инструкции в строку: ");
            String results = sc.nextLine();
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
