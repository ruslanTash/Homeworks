package Homework_13;

import Homework_12.Author;
import Homework_12.Book;

public class Homework13 {
    public static void main(String[] args){
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

//        Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//        Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
            System.out.println(pushkin.toString());
            System.out.println(pushkin.equals(gluhovsky));
            Author pushkin2 = new Author("Alexander", "Pushkin");
            System.out.println(pushkin2.toString());
//            System.out.println(pushkin.equals(pushkin2));
            System.out.println(onegin.toString());
//            System.out.println(pushkin.hashCode(pushkin2));
//            System.out.println(onegin.hashCode(metro2033));
    }
}
