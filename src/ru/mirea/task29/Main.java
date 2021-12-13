package ru.mirea.task29;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String[] countriesInfo = {"Россия", "Великобритания", "США", "Швейцария"};
        String[] namesInfo = {"Рубли", "Фунты", "Доллары", "Золотые слитки"};
        String[] convertToRubleInfo = {"Россия взяла кредит у Швейцарии", "Госдолг США реально очень большой", "Швейцария всё ещё очень богатая"};

        CurrencyInfo currencyInfo = new CurrencyInfo(countriesInfo, namesInfo, convertToRubleInfo);

        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("D:\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем данные в файл
        objectOutputStream.writeObject(currencyInfo);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("D:\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo deserialized = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(deserialized);
    }
}