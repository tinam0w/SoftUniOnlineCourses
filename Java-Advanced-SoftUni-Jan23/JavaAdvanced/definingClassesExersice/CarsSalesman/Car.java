package JavaAdvanced.definingClassesExersice.CarsSalesman;

public class Car {
    private  String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(this.model).append(":").append(System.lineSeparator());
        sb.append(this.engine.getModel()).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(this.engine.getPower()).append(System.lineSeparator());

        if (this.engine.getDisplacement() == 0)
            sb.append("Displacement: ").append("n/a").append(System.lineSeparator());
        else
            sb.append("Displacement: ").append(this.engine.getDisplacement()).append(System.lineSeparator());

        if (this.engine.getEfficiency() == null)
            sb.append("Efficiency: ").append("n/a").append(System.lineSeparator());
        else
            sb.append("Efficiency: ").append(this.engine.getEfficiency()).append(System.lineSeparator());
        if (this.weight == 0)
            sb.append("Weight: ").append("n/a").append(System.lineSeparator());
        else
            sb.append("Weight: ").append(this.weight).append(System.lineSeparator());

        if (this.color == null)
            sb.append("Color: ").append("n/a").append(System.lineSeparator());
        else
            sb.append("Color: ").append(this.color);

        return sb.toString();
    }
}
