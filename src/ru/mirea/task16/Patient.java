package ru.mirea.task16;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Patient extends Person{
    MedicalCard MedicalCard;

    public Patient(String name, String phoneNum, String email) {
        super(name, phoneNum, email);
        MedicalCard = new MedicalCard();
    }

    public MedicalCard getMedicalCard() {
        return MedicalCard;
    }

    public void makeAppointment(Doctor doctor, String strDate){
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        try {
            Date date = formatter.parse(strDate);
            doctor.addAppointment(date, this);
        }
        catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
