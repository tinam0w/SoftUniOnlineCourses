package JavaAdvanced.definingClassesExersice.rawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire tires;

    public Car(String model, Engine engine, Cargo cargo, Tire tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }

    public double[] getTiresPressure(){
        double[] pressures = new double[4];
        pressures[0] = this.tires.getPressure1();
        pressures[1] = this.tires.getPressure2();
        pressures[2] = this.tires.getPressure3();
        pressures[3] = this.tires.getPressure4();
        return pressures;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }
}
