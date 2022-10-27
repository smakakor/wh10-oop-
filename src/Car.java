import java.time.LocalDate;

public class Car {

    public static class Key {
        private final boolean remoteRunEngine;
        private final boolean remoteKey;

        public Key(boolean remoteRunEngine, boolean remoteKey) {
            this.remoteRunEngine = remoteRunEngine;
            this.remoteKey = remoteKey;
        }

        public boolean getRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean getRemoteKey() {
            return remoteKey;
        }
        public Key(){
            this.remoteRunEngine = false;
            this.remoteKey = false;
        }
    }

    public static class Insurance{
        private final LocalDate expireDate;
        private final double cost;
        private final String numberInsurance;

        public Insurance(LocalDate expireDate, double cost, String numberInsurance) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = cost;
            if (numberInsurance == null) {
                this.numberInsurance = "123456789";
            } else {
                this.numberInsurance=numberInsurance;
            }
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public double getCost() {
            return cost;
        }

        public String getNumberInsurance() {
            return numberInsurance;
        }

        public void checkExpireDate() {
            if (expireDate.isBefore(LocalDate.now())|| expireDate.isEqual(LocalDate.now())) {
                System.out.println("Нужно оформлять страховку");
            }
        }
        public void chekNumber(){
            if (numberInsurance.length() != 9) {
                System.out.println("Номер страховки некорректный!");
            }
        }
    }


    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
// oop2
    private String transmission;
    private final String body;
    public String registrationNumber;
    private final int totalPlace;
    private boolean winterTires;
    private Key key;
    private final Insurance insurance;

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String body,
               String registrationNumber,
               int totalPlace,
               boolean winterTies,
               Key key,
               Insurance insurance) {
        this.brand = ValidationUtils.validOrDEfault_String(brand,"default");
        this.model = ValidationUtils.validOrDEfault_String(model, "default");
        this.engineVolume = Math.max(engineVolume, 0);
        this.productionCountry = ValidationUtils.validOrDEfault_String(productionCountry, "default");
        this.productionYear = ValidationUtils.validOrDEfault_Int(productionYear, 2000);
        this.color = ValidationUtils.validOrDEfault_String(color, "white");
//oop2
        this.transmission = ValidationUtils.validOrDEfault_String(transmission, "default");
        this.body = ValidationUtils.validOrDEfault_String(body, "default");
        this.registrationNumber = registrationNumber;
        if (isRegistrationNumber()) {
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = "default";
        }
        this.totalPlace = ValidationUtils.validOrDEfault_Int(totalPlace, 0);
        if (winterTies && (LocalDate.now().getMonthValue() <= 4 || LocalDate.now().getMonthValue() >=11)){
            this.winterTires = true;
        }else{
            this.winterTires = false;
        }
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        this.insurance = insurance;
    }
    public boolean isRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) &&
                Character.isDigit(chars[2]) &&
                Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) &&
                Character.isDigit(chars[7]) &&
                Character.isDigit(chars[8]);
    }
    void PrintCar() {
        System.out.println(getBrand() +
                " " + getModel() +
                "; год выпуска: " + getProductionYear() + ";" +
                " производитель: " + getProductionCountry() +
                "; цвет: " + getColor() +
                "; объем двагателя: " + getEngineVolume() + " л.;" +
                "коробка передач: " + getTransmission() +
                "; тип кузова: " + getBody() +
                "; регистрационный номер: " + getRegistrationNumber()+
                "; количество мест: " + getTotalPlace() +
                "; резина: " + (getWinterTires()? "зимния":"летния") +
                "; Удаленный запуск двигателя " + (getKey()));
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBody() {
        return body;
    }

    public int getTotalPlace() {
        return totalPlace;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public boolean getWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        if (isRegistrationNumber()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "default";
        }
    }

}
