package ObjectsAndClassesMore.teamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Team> teamList = new ArrayList<>();
        List<String> teamNames = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("-");
            boolean notForAdding = false;
            //ако вече има същия отбор:
            for (Team team1 : teamList) {
                if (input[0].equals(team1.getCreator())) {
                    System.out.printf("%s cannot create another team!%n", team1.getCreator());
                    notForAdding = true;
                    break;
                }
            }
            //ако вече има същия потребител:
            for (Team team1 : teamList) {
                if (input[1].equals(team1.getTeamName())) {
                    System.out.printf("Team %s was already created!%n", team1.getTeamName());
                    notForAdding = true;
                    break;
                }
            }
            //добавяме ноеия отбор:
            if (!notForAdding) {
                Team team = new Team();
                team.setCreator(input[0]);
                team.setTeamName(input[1]);
                teamList.add(team);
                teamNames.add(team.getTeamName());
                System.out.printf("Team %s has been created by %s!%n", input[1], input[0]);
            }
        }

        //добавяме нови членове:
        String input2 = scanner.nextLine();
        while (!input2.equals("end of assignment")) {
            String[] input2Arr = input2.split("->");
            String name = input2Arr[0];
            String team = input2Arr[1];
            if (!teamNames.contains(team)) {
                System.out.printf("Team %s does not exist!%n", team);
            } else {
                for (Team team1 : teamList) {
                    if (team1.getTeamName().equals(team)) {
                        if (team1.getMembersString().contains(name) ||
                                team1.getCreator().equals(name)) {
                            System.out.printf("Member %s cannot join team %s!%n", name, team);
                            break;
                        } else {
                            team1.addMembers(name);
                            break;
                        }
                    }
                }
            }
            input2 = scanner.nextLine();
        }
        //personList.sort(Comparator.comparing(Person::getAge));
        teamList.sort(Comparator.comparing(Team::countMembers).reversed());
        teamList.sort(Comparator.comparing(Team::getTeamName));

        //print all teams:
        List<Team> disbandedTeams = new ArrayList<>();
        for (
                Team team : teamList) {
            if (team.getMembersList().size() == 0) {
                disbandedTeams.add(team);
            } else {
                System.out.println(team.getTeamName());
                System.out.println("- " + team.getCreator());
                for (String name : team.getMembersList()) {
                    System.out.println("-- " + name);
                }
            }
        }
        disbandedTeams.sort(Comparator.comparing(Team::getTeamName));
        System.out.println("Teams to disband:");
        if (disbandedTeams.size() > 0) {
            for (Team team : disbandedTeams) {
                System.out.println(team.getTeamName());
            }
        }
    }
}

