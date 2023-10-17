package JavaAdvanced.definingClassesExersice.catLady;

public class Cat {
    private String breed;
    private String name;
    private double number;

    public Cat(String breed, String name, double number) {
        this.breed = breed;
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.breed, this.name, this.number);
    }
}
