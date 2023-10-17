package InterfacesАndAbstractionExercise.MilitaryElite;

public class Mission {
    enum State {
        INPROGRESS("InProgress"),
        FINISHED("Finished");

        private String name;

        State(String name) {
            this.name = name;
        }
    }

    private String codeName;

    private State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        if (isValidEnum(state.name)) {
            this.state = state;
        } else {
            throw new IllegalArgumentException("no such state");
        }
    }

    public String getCodeName() {
        return codeName;
    }

    static public boolean isValidEnum(String state) {
        State[] states = State.values();
        for (State s : states)
            if (s.name.equals(state))
                return true;
        return false;
    }
}
