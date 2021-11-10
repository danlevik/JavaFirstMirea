package ru.mirea.task16;

public class Patient extends Person{
    MedicalCard MedicalCard;

    public Patient(String name, String phoneNum, String email) {
        super(name, phoneNum, email);
        MedicalCard = new MedicalCard();
    }

    public MedicalCard getMedicalCard() {
        return MedicalCard;
    }

    public void makeAppointment(){
        return;
    }
}
