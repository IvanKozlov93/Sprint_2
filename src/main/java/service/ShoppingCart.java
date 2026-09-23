package service;

import model.Food;

public class ShoppingCart {//Создали класс для расчета выходных параметров
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getSumPrice() {//Метод для подсчета общей суммы товаров в корзине
        double sumPrice = 0.0;
        if (products != null) {
            for (int i = 0; i < products.length; i++) {
                Food sumProducts = products[i];
                if (sumProducts != null) {
                    int productsAmount = sumProducts.getAmount();
                    double productsPrice = sumProducts.getPrice();
                    double totalProducts = productsAmount * productsPrice;

                    sumPrice = sumPrice + totalProducts;
                }
            }
        }
        return sumPrice;
    }

    public double getSumPriceAfterDiscount() {//Метод для подсчета общей суммы товаров с учетом скидки
        double sumPriceAfterDiscount = 0.0;
        if (products != null) {
            for (int i = 0; i < products.length; i++) {
                Food sumProducts = products[i];
                if (sumProducts != null) {
                    //Считаем сумму без скидки
                    int productsAmount = sumProducts.getAmount();
                    double productsPrice = sumProducts.getPrice();
                    double totalProducts = productsAmount * productsPrice;
                    //Запрашиваем скидку
                    double discount = sumProducts.getDiscount();
                    //Делаем конечный расчет
                    double totalDiscount = totalProducts * (discount / 100.0);
                    double totalProductsDiscount = totalProducts - totalDiscount;
                    // Суммируем с прошлыми значениями
                    sumPriceAfterDiscount = sumPriceAfterDiscount + totalProductsDiscount;
                }
            }
        }
        return sumPriceAfterDiscount;
    }

    public double getSumPriceOfVegetarian() {//Метод для подсчета ТОЛЬКО вегетарианских товаров
        double sumPriceOfVegetarian = 0.0;
        if (products != null) {
            for (int i = 0; i < products.length; i++) {
                Food sumProducts = products[i];
                if (sumProducts != null) {
                    boolean isVegetarian = sumProducts.isVegetarian();
                    if (isVegetarian) {
                        int productsAmount = sumProducts.getAmount();
                        double productsPrice = sumProducts.getPrice();
                        double productsVegetarion = productsAmount * productsPrice;
                        sumPriceOfVegetarian = sumPriceOfVegetarian + productsVegetarion;
                    }
                }
            }
        }
        return sumPriceOfVegetarian;
    }
}