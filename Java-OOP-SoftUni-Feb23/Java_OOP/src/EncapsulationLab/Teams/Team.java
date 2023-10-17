package EncapsulationLab.Teams;

import EncapsulationLab.SortByNameAge.Person_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Team {
    private String name;
    private List<Person_01> firstTeam;
    private List<Person_01> reserveTeam;

    Team(String name) {
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();

        setName(name);
    }

    private void setName(String name){
        this.name = name;
    }

    void addPlayer(Person_01 player){
        if (player.getAge() < 40){
            this.firstTeam.add(player);
        } else {
            this.reserveTeam.add(player);
        }
    }

    List<Person_01> getFirstTeam(){
        return Collections.unmodifiableList(firstTeam);
    }

    List<Person_01> getReserveTeam(){
        return Collections.unmodifiableList(reserveTeam);
    }
}
