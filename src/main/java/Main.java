import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // 1. Инициализация данных
        Food firstProducts = new Meat(5, 100.0);
        Food secondProducts = new Apple(10, 50.0, Colour.RED_APPLE);
        Food thirdProducts = new Apple(8, 60.0, Colour.GREEN_APPLE);

        // 2. Создание массива продуктов
        Food[] foodProducts = {firstProducts, secondProducts, thirdProducts};

        // 3. Инициализация корзины
        ShoppingCart fullProducts = new ShoppingCart(foodProducts);

        // 4. Подсчет значений
        double totalSum = fullProducts.getSumPrice();
        double totalSumWithDiscount = fullProducts.getSumPriceAfterDiscount();
        double totalSumVegetarian = fullProducts.getSumPriceOfVegetarian();

        // 5. Вывод результатов
        System.out.println("Общая сумма товаров без скидки: " + totalSum + " руб.");
        System.out.println("Общая сумма товаров со скидкой: " + totalSumWithDiscount + " руб.");
        System.out.println("Сумма вегетарианских продуктов без скидки: " + totalSumVegetarian + " руб.");
    }
}