package ObjectsAndClassesMore.carSalesman;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private String engine;
    public Engine engine1;
    private int weight = -1;      //optional
    private String color = "n/a"; //optional
    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine1() {
        return engine1;
    }

    public String getColor() {
        return color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

}
