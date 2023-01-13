package Homework_13;

import Homework_12.Author;
import Homework_12.Book;

import java.util.Objects;

public class Homework13 {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander", "Pushkin");
        Author gluhovsky = new Author("Dmitry", "Gluhovsky");
        Book metro2033 = new Book("Metro 2033", gluhovsky, 2033);
        Book onegin = new Book("Евгений Онегин", pushkin, 1823);
        metro2033.setYear(2005);
        Author pushkinAS = new Author("Alexander", "Pushkin");
        Book metro2034 = new Book("Metro 2033", gluhovsky, 2005);

//  Проверка методов toString, equals и hashCode:

        System.out.println("(pushkin.equals(gluhovsky)) = " + (pushkin.equals(gluhovsky)));
        System.out.println("(pushkin.equals(pushkinAS)) = " + (pushkin.equals(pushkinAS)));
        System.out.println(onegin.toString());
        System.out.println("pushkinAS.hashCode() = " + pushkinAS.hashCode());
        System.out.println("pushkin.hashCode() = " + pushkin.hashCode());
        System.out.println("onegin.equals(metro2033) = " + onegin.equals(metro2033));
        System.out.println("metro2034.equals(metro2033) = " + metro2034.equals(metro2033));
        System.out.println("metro2034.hashCode() = " + metro2034.hashCode());
        System.out.println("metro2033.hashCode() = " + metro2033.hashCode());
        System.out.println("onegin.hashCode() = " + onegin.hashCode());
    }
}
