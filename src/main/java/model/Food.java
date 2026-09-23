package model;

public abstract class Food implements Discountable {//Создали класс и подписались на интерфейс Скидки
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {//Задали входные параметры кол-во, цена и логическую переменную вида продукта
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // Добавили метод со скидкой
    @Override
    public double getDiscount() {
        return 0.0;
    }
}