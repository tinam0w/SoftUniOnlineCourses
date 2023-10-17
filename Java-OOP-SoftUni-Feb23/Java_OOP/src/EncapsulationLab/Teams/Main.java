package EncapsulationLab.Teams;

import EncapsulationLab.SortByNameAge.Person_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Person_01> people = new ArrayList<>();

        Team team = new Team("Stars");
        for (int i = 0; i < n; i++) {
            String[] input = reader.readLine().split(" ");
            Person_01 person01 = null;
            try {
                person01 = new Person_01(input[0], input[1], Integer.parseInt(input[2]), Double.parseDouble(input[3]));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            if (person01 != null){
                team.addPlayer(person01);
            }
        }

        System.out.printf("First team have %d players\n", team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players\n", team.getReserveTeam().size());
    }
}
