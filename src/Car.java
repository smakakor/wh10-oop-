public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color,
               int productionYear,String productionCountry) {
        String[] string = new String[3];
        string [0] = brand;
        string [1] = model;
        string [2] = productionCountry;
        for (int i = 0; i < string.length; i++) {
            if (string[i].equals("")) {
                string[i] = "default";
            }
        }
        this.brand = string[0];
        this.model = string[1];
        this.productionCountry = string[2];

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color.equals("")) {
            this.color = "белый";
        }else {
        this.color = color;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

    }
    void PrintCar() {
        System.out.println(brand+" "+model+"; год выпуска: "+productionYear+"; производитель: "+productionCountry+
                "; цвет: "+color+"; объем двагателя: "+engineVolume+" л.");
    }

}
