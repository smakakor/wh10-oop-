package oop3Work3;

public class Main {
    public static void main(String[] args) {
        herbivores();

    }

    public static void herbivores () {
        Herbivores[] herbivores = new Herbivores[4];
        herbivores[0] = new Herbivores("Газель", 5, "пустыня", 50, null);
        System.out.println(herbivores[0]);
        herbivores[0].eat();
        herbivores[0].move();
        herbivores[0].walk();
        herbivores[0].slip();
        herbivores[0].graze();
        herbivores[1] = new Herbivores("Жираф", 6, "саванна", 55, null);
        System.out.println(herbivores[1]);
        herbivores[2] = new Herbivores(null, -2, null, -25, null);
        System.out.println(herbivores[2]);
        herbivores[3] = new Herbivores("Газель", 5, "пустыня", 50, null); // повторяет herbivores1 для сравнения
        System.out.println(herbivores[3]);
        for (int i = 0; i < herbivores.length; i++) {
            for (int j = 0; j < herbivores.length; j++) {
                if (herbivores[i].equals(herbivores[j]) && i!=j) {
                    System.out.println("error: объекты повторяются");
                }
            }
        }
    }
    public static void predators () {
            Predators predators1 = new Predators("Гиена", 2, "саванна", 60, null);
            System.out.println(predators1);
            Predators predators2 = new Predators(null, -2, null, -2, null);
            System.out.println(predators2);
        }

    public static void amphibians() {
        Amphibians amphibians1 = new Amphibians("Лягушка", 1, "пруд");
        System.out.println(amphibians1);
        Amphibians amphibians2 = new Amphibians(null, -4, null);
        System.out.println(amphibians2);
    }

    public static void flightless() {
        Flightless flightless1 = new Flightless("Павлин", 6, "джунглии", "ходьба");
        System.out.println(flightless1);
        Flightless flightless2 = new Flightless(null, -7, null, null);
        System.out.println(flightless2);
    }

    public static void flying() {
        Flying flying1 = new Flying("Чайка", 4, "прибрежные зоны", "полёт");
        System.out.println(flying1);
        Flying flying2 = new Flying(null, -3, null, null);
        System.out.println(flying2);
    }
    
}
