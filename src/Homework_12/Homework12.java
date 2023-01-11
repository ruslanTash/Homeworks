package Homework_12;

import Homework_12.Author;
import Homework_12.Book;

//  В методе main создайте несколько объектов «Книга» (достаточно двух)
//  и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
//  Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//  Метод main не должен находиться в классах Book и Author.
//  Создайте отдельный класс для запуска приложения и объявите метод main в нем.
public class Homework12 {

public static void main(String[] args) {
    Author pushkin = new Author("Alexander", "Pushkin");
    Author gluhovsky = new Author("Dmitry", "Gluhovsky");
    Book metro2033 = new Book("Metro 2033", gluhovsky, 2033);
    Book onegin = new Book("Евгений Онегин", pushkin, 1823);
//    В том же методе main измените год публикации одной из книг с помощью сеттера.
    metro2033.setYear(2005);

    System.out.println("metro2033.getAuthor() = " + metro2033.getAuthor());
    System.out.println("onegin.getAuthor().getAuthor() = " + onegin.getAuthor().getAuthor());
    System.out.println("metro2033.getTitle() = " + metro2033.getTitle());
    System.out.println("metro2033.getYear() = " + metro2033.getYear());
}
}
