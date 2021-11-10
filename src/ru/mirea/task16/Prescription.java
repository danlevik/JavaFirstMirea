package ru.mirea.task16;

import java.util.ArrayList;
import java.util.Calendar;

public class Prescription {
    Calendar date;
    ArrayList<String> drugs;
    String instructions;

    public Prescription(Calendar date, ArrayList<String> drugs, String instructions) {
        this.date = date;
        this.drugs = drugs;
        this.instructions = instructions;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ArrayList<String> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<String> drugs) {
        this.drugs = drugs;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}