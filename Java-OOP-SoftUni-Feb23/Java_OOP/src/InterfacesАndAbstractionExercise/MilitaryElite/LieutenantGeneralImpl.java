package InterfacesАndAbstractionExercise.MilitaryElite;

import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl{
    private Set<Private> privateSet;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, int... privateId) {
        super(id, firstName, lastName, salary);
        this.privateSet = new HashSet<>();
    }

    public void addPrivate(Private priv){
        this.privateSet.add(priv);
    }
}
