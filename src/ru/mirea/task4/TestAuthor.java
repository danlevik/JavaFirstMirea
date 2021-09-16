package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args){
        Author a1 = new Author("Даниил", "maila1@m.com", 'M');
        Author a2 = new Author("Ольга", "maila2@m.ru", 'F');

        System.out.println(a1);
        System.out.println(a2);
        a2.setEmail("newmaila2@gmail.com");
        System.out.println(a2);
    }
}
