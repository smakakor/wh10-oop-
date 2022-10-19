public class Human {
    String name;
    String town;
    int yearOfBirth;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (name.equals("")) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town.equals("")) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (job.equals("")) {
            this.job = "Информация не указана";
        }else {
            this.job = job;
        }
        if(yearOfBirth>0){
            this.yearOfBirth = yearOfBirth;
        }else {
            this.yearOfBirth = 0;}
    }

    void printHuman() {
        if(yearOfBirth != 0) {
            yearOfBirth = 2022 - yearOfBirth;
        }
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}
