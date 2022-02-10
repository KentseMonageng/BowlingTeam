public class BowlingTeam {
    // field for team names and an array to hold the 'members'
    private String teamName;
    private final String[] members;

   {
        members = new String[4];
    }


    public void setTeamName(String team) {
        teamName = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setMembers(int number, String name) {
        members[number] = name;
    }

    public String getMember(int number) {
        return members[number];
    }
}
