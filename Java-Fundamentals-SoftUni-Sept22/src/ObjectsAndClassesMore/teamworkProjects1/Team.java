package ObjectsAndClassesMore.teamworkProjects1;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String creator;
    private String teamName;
    private List<String> members = new ArrayList<>();

    public Team(String creator, String teamName){
        this.creator = creator;
        this.teamName = teamName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMembers(String memberName) {
        members.add(memberName);
    }

    public int getCountMembers(){
        return members.size();
    }
}
