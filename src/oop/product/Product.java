package oop.product;

import java.util.Objects;

public class Product {
    private final String product;
    private final float price;
    private final int amount;

    private boolean check;

    public Product(String product, float price, int amount) {
        if (product == null || product.isBlank() || price < 0 || amount < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        }
        this.product = product;
        this.price = price;
        this.amount = amount;
        this.check = false;
    }

    public String getProduct() {
        return product;
    }

    public float getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck() {
        this.check = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Objects.equals(product, product1.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product);
    }

    @Override
    public String toString() {
        String checkString = this.check ? "Да" : "Нет";
        return String.format("%s, Цена: %s, Количество: %s, Куплен %s", getProduct(), getPrice(),getAmount(),checkString);
    }
}
