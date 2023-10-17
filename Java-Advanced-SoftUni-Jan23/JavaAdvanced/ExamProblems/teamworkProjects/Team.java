package JavaAdvanced.ExamProblems.teamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String creator;
    private String teamName;
    private List<String> membersList;

    public Team(String teamName, String creator) {
        this.creator = creator;
        this.teamName = teamName;
        this.membersList = new ArrayList<>();
    }

    public String getCreator() {
        return creator;
    }

    public List<String> getMembersList() {
        return membersList;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getSize() {
        return this.membersList.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.teamName).append(System.lineSeparator());
        sb.append("- ").append(this.creator).append(System.lineSeparator());
        this.membersList.forEach(e -> sb.append("-- ").append(e).append(System.lineSeparator()));
        return sb.toString();
    }
}
