package JavaAdvanced.ExamProblems.teamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> teamCreatorMap = new TreeMap<>();
        List<Team> teamsList = new ArrayList<>();
        List<String> allMembersList = new ArrayList<>();

        //creating teams:
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("-");
            String creator = input[0];
            String teamName = input[1];
            if (!teamCreatorMap.containsKey(teamName) &&
            !teamCreatorMap.containsValue(creator)) {
                Team team = new Team(teamName, creator);
                teamsList.add(team);
                teamCreatorMap.put(teamName, creator);
                allMembersList.add(creator);
                System.out.println("Team " + teamName + " has been created by " + creator + "!");
            } else if (teamCreatorMap.containsKey(teamName)) {
                System.out.println("Team " + teamName + " was already created!");
            } else if (teamCreatorMap.containsValue(creator)) {
                System.out.println(creator + " cannot create another team!");
            }
        }

        //joining members:
        String input = scanner.nextLine();
        while (!input.equals("end of assignment")) {
            String user = input.split("->")[0];
            String teamName = input.split("->")[1];

            if (!teamCreatorMap.containsKey(teamName)){
                System.out.println("Team " + teamName + " does not exist!");
            } else if (allMembersList.contains(user)){
                System.out.println("Member " + user + " cannot join team " + teamName + "!");
            } else {
                allMembersList.add(user);
                for (Team team : teamsList) {
                    if (team.getTeamName().equals(teamName)){
                        team.getMembersList().add(user);
                    }
                }
            }
            input = scanner.nextLine();
        }

        //sorting:
        teamsList.sort(Comparator.comparing(Team::getTeamName));
        teamsList.sort(Comparator.comparing(Team::getSize).reversed());
        teamsList.forEach(team -> {
            team.getMembersList().sort(Comparator.comparing(String::toString));
        });

        //disbanding teams:
        List<Team> disbandedTeamsList = new ArrayList<>();
        for (Team team : teamsList) {
            if (team.getMembersList().size() == 0){
                disbandedTeamsList.add(team);
            }
        }
        teamsList.removeAll(disbandedTeamsList);

        teamsList.forEach(System.out::print);

        System.out.println("Teams to disband:");
        if (disbandedTeamsList.size() > 0)
            disbandedTeamsList.forEach(e -> System.out.println(e.getTeamName()));
    }
}
