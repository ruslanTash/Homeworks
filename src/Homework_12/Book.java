package Homework_12;
import Homework_12.Author;

//  Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги.
//  Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
public class Book {
    private String title;
    private Author author;
    private int year;


//  Напишите конструкторы для обоих классов, заполняющие все поля.
    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

//  Создайте геттеры для всех полей автора и всех полей книги.
    public String getTitle() {
        return this.title;
    }
    public Author getAuthor(){
        return this.author;
    }
    public int getYear(){
        return this.year;
    }

//  Создайте сеттер для поля «Год публикации» у книги.
    public void setYear (int year){
        this.year = year;
    }
}


