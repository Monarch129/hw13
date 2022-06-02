package phone;

import person.Person;

//Написать программу, которая создать 4 объекта класса Phone из всех конструкторов и выводит каждого

public class Phones {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("iphone6");
        Phone phone3 = new Phone("iphone5", 79215677372L);
        Phone phone4 = new Phone("iphone13", 7931876574L, new Person("Anton", "Popov"));
      System.out.println(phone1+"\n"+phone2+"\n"+phone3+"\n"+phone4);




    }
}
