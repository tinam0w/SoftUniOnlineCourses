package PolymorphismLab.WildFarm.Animal;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal{
    private String livingRegion;

    public Mammal(String name, double weight, String region, AnimalType type) {
        super(name, weight, type);
        this.livingRegion = region;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        String formatted = decimalFormat.format(this.getAnimalWeight());

        return String.format("%s[%s, %s, %s, %d]",
                this.getAnimalType(), this.getAnimalName(), formatted,this.livingRegion, this.getFoodEaten());
    }

    protected String getLivingRegion() {
        return livingRegion;
    }
}
