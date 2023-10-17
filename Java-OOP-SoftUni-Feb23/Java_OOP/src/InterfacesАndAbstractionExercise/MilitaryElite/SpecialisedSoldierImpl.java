package InterfacesАndAbstractionExercise.MilitaryElite;

public class SpecialisedSoldierImpl extends PrivateImpl{
    enum Corps{
        AIRFORCES("AirForces"),
        MARINES("Marines");

        private final String name;
        Corps(String name) {
            this.name = name;
        }
    }

    private Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        if (isValidEnum(corps.name)){
            this.corps = corps;
        } else {
            throw new IllegalArgumentException("no such corps");
        }
    }

    static public boolean isValidEnum(String corp) {
        Corps[] corps = Corps.values();
        for (Corps c : corps)
            if (c.name.equals(corp))
                return true;
        return false;
    }
}
