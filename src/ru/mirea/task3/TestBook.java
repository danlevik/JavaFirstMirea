package ru.mirea.task3;

import ru.mirea.task2.Book;

public class TestBook {
    public static void main(String[] args) {

        Book b1 = new Book("Преступление и наказание", 300, "Триллер", "Доставский");
        Book b2 = new Book("Оно", 220, "Хоррор", "Стивен Книг");
        Book b3 = new Book("Сумерки. Сага. Рассвет", 638, "Романтика", "Я");
        Book b4 = new Book("Гарри Поттер, Дьявол и Гольфист", 394, "Юмор", "Джоан Рофлинг");

        System.out.println(b1);
        System.out.println(b3);
        System.out.println(b4);

    }
}