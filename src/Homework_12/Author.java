package Homework_12;

//  Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
public class Author {
    private String firstName;
    private String secondName;

    //  Напишите конструкторы для обоих классов, заполняющие все поля.
    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    //  Создайте геттеры для всех полей автора и всех полей книги.
    public String getAuthor() {
        return (this.firstName + " " + this.secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    //        Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//        Обратите внимание, что toString книги не должен дублировать код из toString автора, а должен делегировать (вызывать) его версию метода.
    @Override
    public String toString() {
        return firstName + " " + secondName;
    }




}











