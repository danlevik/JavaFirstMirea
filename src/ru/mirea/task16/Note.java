package ru.mirea.task16;

import java.util.Calendar;

public class Note {
    private Calendar date;
    private String disease;
    private String statusOfDisease;

    public Note(Calendar date, String disease, String statusOfDisease) {
        this.date = date;
        this.disease = disease;
        this.statusOfDisease = statusOfDisease;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getStatusOfDisease() {
        return statusOfDisease;
    }

    public void setStatusOfDisease(String statusOfDisease) {
        this.statusOfDisease = statusOfDisease;
    }
}
