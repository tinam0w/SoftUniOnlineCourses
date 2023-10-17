package April_2022.easterBasket;

public class Egg {
    private String color;
    private int strength;
    private String shape;

    public Egg(String color, int strength, String shape) {
        this.color = color;
        this.strength = strength;
        this.shape = shape;
    }

    public Egg() {
    }

    @Override
    public String toString() {
        return getColor() + " egg, with " + getStrength()
                + " strength and " + getShape() + " shape.";
    }

    public String getColor() {
        return this.color;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getShape() {
        return this.shape;
    }
}
