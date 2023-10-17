package ObjectsAndClassesMore.carSalesman;

public class Engine {

    private String model;
    private int power;
    private int displacement = -1;  //optional
    private String efficiency = "n/a";    //optional

    public void setModel(String model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

}
