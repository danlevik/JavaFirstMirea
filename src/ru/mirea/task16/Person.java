package ru.mirea.task16;

public abstract class Person {
    String name;
    String phoneNum;
    String email;

    public Person(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }
}
