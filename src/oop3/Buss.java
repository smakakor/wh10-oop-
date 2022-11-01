package oop3;

public class Buss extends Transport{

    public Buss(String brand, String model,
                int productionYear, String productionCountry,
                String colorBody, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, colorBody, maxSpeed);

    }

    @Override
    public void refill() {
        System.out.println("можно заправлять бензином или дизелем на заправке");
    }

}
