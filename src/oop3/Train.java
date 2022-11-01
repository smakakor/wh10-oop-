package oop3;

public class Train extends Transport {

    private int tripPrice;
    private String tripsTime;
    private final String  departureStations;
    private final String endingStation;
    private  int totalTrain;


    public Train(String brand, String model,
                 int productionYear, String productionCountry,
                 String colorBody, int maxSpeed,
                 int tripPrice, String tripsTime,
                 String departureStations, String endingStation,
                 int totalTrain) {
        super(brand, model, productionYear, productionCountry, colorBody, maxSpeed);
        setTripPrice(tripPrice);
        setTripsTime(tripsTime);
        this.departureStations = departureStations;
        this.endingStation = endingStation;
        setTotalTrain(totalTrain);
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = ValidationUtils.validOrDEfault_Int(tripPrice,1000);
    }

    public String  getTripsTime() {
        return tripsTime;
    }

    public void setTripsTime(String tripsTime) {
        this.tripsTime = ValidationUtils.validOrDEfault_String(tripsTime,"1 hour");
    }

    public String getDepartureStations() {
        return departureStations;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getTotalTrain() {
        return totalTrain;
    }

    public void setTotalTrain(int totalTrain) {
        this.totalTrain = ValidationUtils.validOrDEfault_Int(totalTrain,1);
    }

    @Override
    public String toString() {
        return "Поезд " + getBrand() + '\'' +
                "; Модель " + getModel() + '\'' +
                "; Год выпуска " + getProductionYear() +
                "; Страна производства " + getProductionCountry() + '\'' +
                "; Цвет " + getColorBody() + '\'' +
                "; Скорость передвижения" + getMaxSpeed() + " км/ч" +'\''+
                "; Цена поездики " + getTripPrice() +
                "; Время поездки " + getTripsTime() + '\'' +
                "; Отходит от " + getDepartureStations() + '\'' +
                "; Следует до станции " + getEndingStation() + '\'' +
                "; В поезде " + getTotalTrain() + " вагонов.";

    }

    @Override
    public void refill() {
        System.out.println("нужно заправлять дизелем");
    }
}
