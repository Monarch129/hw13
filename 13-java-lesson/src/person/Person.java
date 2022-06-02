package person;
//Создать пакет person. В нем создать класс Person с полями: имя, фамилия. Добавить конструктор для всех полей класса. Добавить геттеры.
public class Person {
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;

    }


    @Override
    public String toString() {
        return "Имя: " + name + "; Фамилия: " + surname;
    }
}





