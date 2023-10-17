package EncapsulationExersice.FootballTeamGenerator;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Team> teamsMap = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] parts = command.split(";");
            switch (parts[0]) {
                case "Team":
                    handleAddTeam(teamsMap, parts);
                    break;
                case "Add":
                    handleAddPlayer(teamsMap, parts);
                    break;
                case "Remove":
                    handleRemovePlayer(teamsMap, parts);
                    break;
                case "Rating":
                    handleRating(teamsMap, parts);
                    break;
                default:
                    throw new IllegalStateException("Unknown command " + parts[0] + " !");
            }
            command = scanner.nextLine();
        }
    }

    private static void handleRating(Map<String, Team> teamsMap, String[] parts) {
        Team team = getTeamOrPrintNotFound(teamsMap, parts);
        if (team == null) return;

        System.out.println(team.getName() + " - " + (int) team.getRating());
    }

    private static void handleRemovePlayer(Map<String, Team> teamsMap, String[] parts) {
        Team team = getTeamOrPrintNotFound(teamsMap, parts);
        if (team == null) return;

        try {
            team.removePlayer(parts[2]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleAddPlayer(Map<String, Team> teamsMap, String[] parts) {
        Team team = getTeamOrPrintNotFound(teamsMap, parts);
        if (team == null) return;

        try {
            Player player = new Player(parts[2],
                    Integer.parseInt(parts[3]),
                    Integer.parseInt(parts[4]),
                    Integer.parseInt(parts[5]),
                    Integer.parseInt(parts[6]),
                    Integer.parseInt(parts[7]));

            team.addPlayer(player);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void handleAddTeam(Map<String, Team> teamsMap, String[] parts) {
        try {
            Team team = new Team(parts[1]);
            teamsMap.put(team.getName(), team);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Team getTeamOrPrintNotFound(Map<String, Team> teamsMap, String[] parts) {
        Team team = teamsMap.get(parts[1]);
        if (team == null) {
            System.out.println("Team " + parts[1] + " does not exist.");
            return null;
        }
        return team;
    }
}
