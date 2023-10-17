package December_2021.aquarium;

public class Fish {
    private String name;
    private String color;
    private int fins;

    public Fish(String name, String color, int fins) {
        this.name = name;
        this.color = color;
        this.fins = fins;
    }

    @Override
    public String toString() {
        return "Fish: " + getName() + "\n"
                + "Color: " + getColor() + "\n"
                + "Number of fins: " + getFins();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getFins() {
        return fins;
    }
}
