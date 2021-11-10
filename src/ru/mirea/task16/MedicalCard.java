package ru.mirea.task16;

import java.util.ArrayList;

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

    public void setAnalyzes(ArrayList<Analysis> analyzes) {
        this.analyzes = analyzes;
    }

    public ArrayList<Note> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(ArrayList<Note> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void addAnalysis(){
        return;
    }

    public void addNote(){
        return;
    }

    public void addPrescription(){
        return;
    }
}
