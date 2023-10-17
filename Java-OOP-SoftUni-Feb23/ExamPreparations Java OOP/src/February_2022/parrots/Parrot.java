package February_2022.parrots;

public class Parrot {
    private String name;
    private String species;
    private boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        this.available = true;
    }

    public Parrot() {
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable(){
        return this.available;
    }

    @Override
    public String toString() {
        return "Parrot (" + getSpecies() + "): " + getName();
    }
}
