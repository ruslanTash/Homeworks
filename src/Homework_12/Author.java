package Homework_12;


public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }


    public String getAuthor() {
        return (this.firstName + " " + this.secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    //        Реализуйте методы toString, equals и hashCode.

    @Override
    public String toString() {
        return firstName + " " + secondName;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (getClass() != other.getClass()) return false;
        Author author = (Author) other;
        return firstName == author.firstName && secondName == author.secondName;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }
}












