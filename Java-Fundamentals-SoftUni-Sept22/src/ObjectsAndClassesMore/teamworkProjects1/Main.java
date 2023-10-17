package ObjectsAndClassesMore.teamworkProjects1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Team> teamList = new ArrayList<>();
        List<String> teamNames = new ArrayList<>();
        List<String> creatorsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("-");
            String creator = input[0];
            String teamName = input[1];
            if (creatorsList.contains(creator)) {
                System.out.println(creator + " cannot create another team!");
            } else if (teamNames.contains(teamName)) {
                System.out.println("Team " + teamName + " was already created!");
            } else {
                teamNames.add(teamName);
                creatorsList.add(creator);
                Team team = new Team(creator, teamName);
                teamList.add(team);
                System.out.println("Team " + teamName + " has been created by " + creator + "!");
            }
        }

        String input1 = scanner.nextLine();
        while (!input1.equals("end of assignment")) {
            String member = input1.split("->")[0];
            String teamName = input1.split("->")[1];
            if (!teamNames.contains(teamName)) {
                System.out.println("Team " + teamName + " does not exist!");
            } else {
                for (Team team : teamList) {
                    if (team.getTeamName().equals(teamName)) {
                        if (team.getMembers().contains(member)
                                || team.getCreator().equals(member)) {
                            System.out.println("Member " + member + " cannot join team " + teamName + "!");
                        } else {
                            team.addMembers(member);
                        }
                    }
                }
            }
            input1 = scanner.nextLine();
        }

        List<Team> disbandedTeams = new ArrayList<>();
        List<Team> nonDisbandedTeams = new ArrayList<>();
        for (Team team : teamList) {
            Collections.sort(team.getMembers());
            if (team.getCountMembers() == 0)
                disbandedTeams.add(team);
            else
                nonDisbandedTeams.add(team);
        }

        disbandedTeams.sort(Comparator.comparing(Team::getTeamName));
        nonDisbandedTeams.sort(Comparator.comparing(Team::getCountMembers).reversed());
        nonDisbandedTeams.sort(Comparator.comparing(Team::getTeamName));

        for (Team team : nonDisbandedTeams) {
            System.out.println(team.getTeamName());
            System.out.println("- " + team.getCreator());
            for (String member : team.getMembers()) {
                System.out.println("-- " + member);
            }
        }
        System.out.println("Teams to disband:");
        for (Team team : disbandedTeams) {
            System.out.println(team.getTeamName());
        }
    }
}
