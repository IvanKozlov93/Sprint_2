package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {//Создали класс Яблок
    private String colour;//Добавили поле для использования цвета яблок

    public Apple(int amount, double price, String colour) {//Создали конструктор в котором изначально isVegetarian = true
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {//Создали метод который вернет скидку в зависимости от цвета яблок
        if (Colour.RED_APPLE.equals(this.colour)) {
            return Discount.DISCOUNT_RED_APPLE;
        }
        return Discount.DISCOUNT_DEFAULT_APPLE;
    }
}
