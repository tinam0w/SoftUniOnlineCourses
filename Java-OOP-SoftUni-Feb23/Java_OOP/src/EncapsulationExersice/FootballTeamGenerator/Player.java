package EncapsulationExersice.FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    public double overallSkillLevel(){
        return (endurance + sprint + passing + dribble + shooting) / (double)5;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    private void validateStat(int number, String statName){
        if (number < 0 || number > 100){
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }

    private void setEndurance(int endurance) {
        String statName = "Endurance";
        validateStat(endurance, statName);
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        String statName = "Sprint";
        validateStat(sprint, statName);
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        String statName = "Dribble";
        validateStat(dribble, statName);
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        String statName = "Passing";
        validateStat(passing, statName);
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        String statName = "Shooting";
        validateStat(shooting, statName);
        this.shooting = shooting;
    }
}
