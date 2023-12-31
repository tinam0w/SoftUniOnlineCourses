package IteratorsExersice.StrategyPattern;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %d", getName(), getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
