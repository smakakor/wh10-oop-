package oop3;

public class Flower {
    private String flowerName;
    private String country;
    private double cost;
    int lifeSpan;


    Flower(String flowerName, String country, double cost, int lifeSpan) {

        if (!flowerName.isEmpty() || !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "white";
        }

        if (!country.isEmpty() || !country.isBlank()) {
            this.country = country;
        } else {
            this.country = "Russia";
        }

        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }

        if (!flowerName.isEmpty() || !flowerName.isBlank()) {
            this.flowerName = flowerName;
        } else {
            this.flowerName = "No data";
        }

        if (lifeSpan > 0) {
            this.lifeSpan = lifeSpan;
        } else if (lifeSpan < 0) {
            this.lifeSpan = Math.abs(lifeSpan);
        } else{
            this.lifeSpan = 3;
        }
    }

    // геттэр и сетэр для FlowerName
    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    // геттэр и сетэр для country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    //геттэр и сетэр для cost
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Назывние цветка: " + flowerName + "; Странна происхождения: " + country +
                "; Цена за одну штуку(руб): "+ cost + "; Срок хранения(дн): " + lifeSpan;
    }
}
