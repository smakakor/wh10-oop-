package oop3;

public abstract class Transport {
    private String brand;
    private String model;
    private final int productionYear;
    private final String productionCountry;
    private String colorBody;
    protected int maxSpeed;

    public Transport(String brand, String model,
                     int productionYear, String productionCountry,
                     String colorBody, int maxSpeed) {
        setBrand(brand);
        setModel(model);
        this.productionYear = ValidationUtils.validOrDEfault_Int(productionYear, 2000);
        this.productionCountry = ValidationUtils.validOrDEfault_String(productionCountry, "default");
        setColorBody(colorBody);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = ValidationUtils.validOrDEfault_String(brand,"default");;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = ValidationUtils.validOrDEfault_String(model, "default");
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColorBody() {
        return colorBody;
    }

    public void setColorBody(String colorBody) {
        this.colorBody = ValidationUtils.validOrDEfault_String(colorBody, "white");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = ValidationUtils.validOrDEfault_Int(maxSpeed, 180);
    }

    @Override
    public String toString() {
        return "Бренд " + getBrand() + '\'' +
                "; Модель " + getModel() + '\'' +
                "; Год выпуска " + getProductionYear() +
                "; Страна производства " + getProductionCountry() + '\'' +
                "; Цвет " + getColorBody() + '\'' +
                "; Максимальная скорость" + getMaxSpeed() + "км/ч.";
    }

    public abstract void refill();

}
