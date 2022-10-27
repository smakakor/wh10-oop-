public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (name.isBlank() || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (name.isBlank() || name.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (name.isBlank() || name.isEmpty()) {
            this.job = "Информация не указана";
        } else {
            this.job = job;
        }
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }

    void printHuman() {
        if (yearOfBirth != 0) {
            yearOfBirth = 2022 - yearOfBirth;
        }
        System.out.println("Привет! Меня зовут " + getName() + ". Я из города " + getTown() + ". Я родился в " + getYearOfBirth() + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth > 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
}
