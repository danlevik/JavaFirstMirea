package ru.mirea.task2;

public class Book {
    private String name;
    private int pages;
    private String genre;

    public Book(String name, int pages, String genre) {
        this.name = name;
        this.pages = pages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Перед вами книга. На обложке написано '" +
                name + "'. " +
                "Вы быстро просматриваете книгу и понимаете что количество страниц в ней - " + pages + "." +
                " Жанр этой книги - " + genre + ". Интересно...";
    }
}