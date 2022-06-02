package phone;

import person.Person;
//Создать пакет phone. В нем создать класс Phone с полями: модель, номер телефона, владелец - с типом Person.
//Добавить конструкторы: - пустой; - принимающий только модель; - принимающий модель и номер телефона; - принимающий модель, номер телефона и владельца;
public class Phone {

    private String model;
    private long number;
    private Person owner;

    public Phone() {
    }

    public Phone(String model) {
        this.model = model;
    }

    public Phone(String model, long number) {
        this.model = model;
        this.number = number;
    }

    public Phone(String model, long number, Person owner) {
        this.model = model;
        this.number = number;
        this.owner = owner;
    }



    public void setNumber(long number) {
        this.number = number;
        }

    public String getModel() {
        return model;
    }

    public long getNumber() {
        return number;
    }



    @Override
    public String toString() {
        String ownerString = owner==null ? "null": owner.getName() + " " + owner.getSurname();
        return "Владелец телефона: " + ownerString + "; Модель: " + model + "; Номер телефона: +" + number;
    }
}


