package InterfacesАndAbstractionExercise.MilitaryElite;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl{
    private Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        this.missions = new HashSet<>();
    }

    public void addMission(Mission mission){
        missions.add(mission);
    }

    public Collection<Mission> getMissions(){
        return missions;
    }

}
