package Homework_12;

//  Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
//  Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
public class Book {
    private String title;
    private Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }


    public void setYear(int year) {
        this.year = year;
    }

//  Реализация методы toString, equals и hashCode.

    @Override
    public String toString() {
        return title + "\n" + author.toString() + "\n" + year;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return title == book.title && year == book.year && author == book.author;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, author, year);
    }

}


