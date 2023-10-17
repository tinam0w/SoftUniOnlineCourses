package InterfacesАndAbstractionExercise.MilitaryElite;

public class SpyImpl extends SoldierImpl{
    private int codeNumber;

    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    public int getCodeNumber() {
        return codeNumber;
    }
}
