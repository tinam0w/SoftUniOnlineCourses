package InterfacesАndAbstractionExercise.MilitaryElite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl{
    private Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        repairs = new HashSet<>();
    }

    public void addRepair(Repair repair){
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs(){
        return repairs;
    }
}
