package oop3;

import java.time.LocalDate;

public class Car extends Transport {
    // Вложеный класс "Страховка"
    public static class Insurance{

        private final LocalDate expireDate;
        private final int cost;
        private final String numberInsurance;

        public Insurance(LocalDate expireDate, int cost, String numberInsurance) {
            if (expireDate == null) {
                this.expireDate = LocalDate.now().plusDays(365);
            } else {
                this.expireDate = expireDate;
            }
            this.cost = ValidationUtils.validOrDEfault_Int(cost,15000);
            this.numberInsurance = ValidationUtils.validOrDEfault_String(numberInsurance,"123456789");

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

        public String checkExpireDate() {
            if (getExpireDate().isBefore(LocalDate.now()) || getExpireDate().isEqual(LocalDate.now())) {
                return "Нужно оформлять страховку";
            }
            return "Страховка ещё действует";
        }

        public String checkNumber(){
            if (getNumberInsurance().length() != 9) {
              return  "Номер страховки некорректный!";
            }
            return "Номмер страховки коректный";
        }

        public Insurance(){
            this.expireDate = null;
            this.cost = 0;
            this.numberInsurance = null;
        }

        @Override
        public String toString() {
            return  checkExpireDate() +
                    "; цена страховки " + getCost() + "руб." +
                    "; " + checkNumber();
        }
    }

    // Вложеный класс "Ключ"
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

        public String printRemoteRunEngine() {
            if (getRemoteRunEngine()) {
                return "Удленный запуск имеится";
            }
            return "Удалённй запуск отсутсвует";
        }
        public String printRemoteKey() {
            if (getRemoteKey()) {
                return "Без ключевой доступ имеится";
            }
            return "Без ключевой доступ отсутсвует";
        }

        @Override
        public String toString() {
            return printRemoteRunEngine() +
                    "; " + printRemoteKey();
        }
    }

    // Поля
    private double engineVolume;
    //oop2
    private String transmission;
    private final String body;
    public String registrationNumber;
    private final int totalPlace;
    private boolean winterTires;
    private Key key;
    private final Insurance insurance;


    // Конструктор для класса "Машина"
    public Car(String brand,
               String model,
               double engineVolume,
               String colorBody,
               int productionYear,
               String productionCountry,
               int maxSpeed,
               //oop2
               String transmission,
               String body,
               String registrationNumber,
               int totalPlace,
               boolean winterTies,
               Key key,
               Insurance insurance) {

        super(brand, model, productionYear, productionCountry,
                colorBody, maxSpeed);

        this.engineVolume = Math.max(engineVolume, 0);
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
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
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

    public void PrintCar() {
        System.out.println(getBrand() +
                " " + getModel() +
                "; год выпуска: " + getProductionYear() + ";" +
                " производитель: " + getProductionCountry() +
                "; цвет: " + getColorBody() +
                "; объем двагателя: " + getEngineVolume() + " л.;" +
                "коробка передач: " + getTransmission() +
                "; тип кузова: " + getBody() +
                "; регистрационный номер: " + getRegistrationNumber()+
                "; количество мест: " + getTotalPlace() +
                "; резина: " + (getWinterTires()? "зимния":"летния") +
                "; " + (getKey())+
                "; " + (getInsurance()));
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

    public Insurance getInsurance() {
        return this.insurance;
    }

    public void refill(){
        System.out.println("можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    };

}
