package EncapsulationExersice.FootballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        setName(name);
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String name) {

//        Optional<Player> playerToRemove = players.stream().filter(p -> p.getName().equals(name)).findFirst();
//        if (!playerToRemove.isPresent()){
//            throw new IllegalArgumentException("Player " + name + " is not in " + getName() + " team");
//        }
//        players.remove(playerToRemove.get());

        int toRemoveIndex = -1;
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getName().equals(name)){
                toRemoveIndex = i;
                break;
            }
        }

        if (toRemoveIndex == -1){
            throw new IllegalArgumentException("Player " + name + " is not in " + getName() + " team.");
        }

        players.remove(toRemoveIndex);
    }

    public double getRating() {
//        if (players.isEmpty()){
//            return 0;
//        }
        return Math.round(players.stream().mapToDouble(Player::overallSkillLevel).average().orElse(0));
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }
}
