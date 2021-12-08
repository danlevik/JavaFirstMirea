package ru.mirea.task22;

public class Main {
    public static void main(String[] args){
        Client client = new Client();
        client.sit(ChairType.VICTORIAN);
        client.sit(ChairType.MAGIC);
        client.sit(ChairType.MULTIFUNC);
    }
}
