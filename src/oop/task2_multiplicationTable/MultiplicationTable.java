package oop.task2_multiplicationTable;

import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Set<Number> examples = new HashSet<>();
        Random rand = new Random();

        while (examples.size() < 15) {
            examples.add(new Number(rand.nextInt(10), rand.nextInt(10)));
        }
        System.out.println(examples);
    }

}
class Number {
    private final int number1;

    private final int number2;

    public Number(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Number number = (Number) o;
        return (number1 == number.number1 && number2 == number.number2) ||
                (number1 == number.number2 && number2 == number.number1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1*number2, number2 + number1);
    }
    @Override
    public String toString() {
        return this.number1 +
                " * " + this.number2 +
                " = ?";
    }

}
