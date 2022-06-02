package person;
//Переопределить метод toString() в классе Person чтобы на выходе получить вывод строки в формате:Ы
//"Фамилия: Петров; Имя: Петр"
//Написать программу, которая создает два объекта класса Person и выводит на экран фамилию и имя с помощью метода toString()
public class People {
    public static void main(String[] args) {
        Person person1 = new Person("ivan","ivanov");
        Person person2 = new Person("goga","gogov" );
        System.out.println(person1);
        System.out.println(person2);
    }
}
