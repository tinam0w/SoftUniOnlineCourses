package EncapsulationExersice.PizzaCalories;

public class Dough {

    enum FlourTypes {
        WHITE(1.5),
        WHOLEGRAIN(1);

        public final double calories;

        FlourTypes(double calories) {
            this.calories = calories;
        }
    }

    enum BakingTechniques {
        CRISPY(0.9),
        CHEWY(1.1),
        HOMEMADE(1);

        public final double calories;

        BakingTechniques(double calories) {
            this.calories = calories;
        }
    }

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    public double calculateCalories() {
        double baseCalories = 2 * this.weight;
        switch (this.flourType) {
            case "White":
                baseCalories *= FlourTypes.WHITE.calories;
                break;
            case "Wholegrain":
                baseCalories *= FlourTypes.WHOLEGRAIN.calories;
                break;
        }
        switch (this.bakingTechnique) {
            case "Chewy":
                baseCalories *= BakingTechniques.CHEWY.calories;
                break;
            case "Crispy":
                baseCalories *= BakingTechniques.CRISPY.calories;
                break;
            case "Homemade":
                baseCalories *= BakingTechniques.HOMEMADE.calories;
                break;
        }

        return baseCalories;
    }

    private void setFlourType(String flourType) {
        if (!flourType.equals("White")) {
            if (!flourType.equals("Wholegrain")) {
                throw new IllegalArgumentException("Invalid type of dough.");
            }
        }

        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!bakingTechnique.equals("Chewy")) {
            if (!bakingTechnique.equals("Crispy")) {
                if (!bakingTechnique.equals("Homemade")) {
                    throw new IllegalArgumentException("Invalid type of dough.");
                }
            }
        }

        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight < 0 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }

        this.weight = weight;
    }
}
