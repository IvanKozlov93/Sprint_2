package model;

public class Meat extends Food {//Создали класс для мяса

    public Meat(int amount, double price) {//Создали конструктор в котором изначально isVegetarian = false
        super(amount, price, false);
    }
}