package Christmas;

public class Present {
    private String name;
    private double weight;
    private String gender;

    public Present(String name, double weight, String gender) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("Christmas.Present %s (%.2f) for a %s", name, weight, gender);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getGender() {
        return gender;
    }
}
