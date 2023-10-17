package InterfacesАndAbstractionExercise.MilitaryElite;

public class Repair {
    private String name;
    private int hoursWorked;

    public Repair(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
