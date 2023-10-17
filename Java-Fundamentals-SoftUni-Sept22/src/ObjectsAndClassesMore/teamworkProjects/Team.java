package ObjectsAndClassesMore.teamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String creatorName;
    private String teamName;
    public List<String> members = new ArrayList<>();

    public String getMembersString() {
        String allMembers = "";
        for (String name : members) {
            allMembers = name + " ";
        }
        return allMembers;
    }

    public List<String> getMembersList(){
        return this.members;
    }

    public void addMembers(String name) {
        this.members.add(name);
    }

    public int countMembers(){
        String[] countMember = getMembersString().split(" ");
        return countMember.length;
    }
    public String getCreator() {
        return creatorName;
    }

    public void setCreator(String creator) {
        this.creatorName = creator;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String team) {
        this.teamName = team;
    }
}
