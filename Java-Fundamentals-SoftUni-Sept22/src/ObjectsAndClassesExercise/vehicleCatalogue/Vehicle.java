package ObjectsAndClassesExercise.vehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsepower;

    public Vehicle(String type, String model, String color, int horsepower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public int getHorsepower() {
        return this.horsepower;
    }

    @Override
    public String toString() {
        if (this.type.equals("car")) {
            return String.format("Type: Car%nModel: %s%nColor: %s%nHorsepower: %d", this.model, this.color, this.horsepower);
        }
        return String.format("Type: Truck%nModel: %s%nColor: %s%nHorsepower: %d", this.model, this.color, this.horsepower);
    }
}
