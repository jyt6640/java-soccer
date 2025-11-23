package soccer.domain;

public class Team {
    private String teamName;

    public Team(String teamName) {
        validate(teamName);
        this.teamName = teamName;
    }

    public void validate(String teamName) {
        nameLength(teamName);
    }

    private void nameLength(String teamName) {
        if (teamName.length() > 10) {
            throw new IllegalArgumentException("[ERROR] 팀 이름은 10자 미만으로 입력해주세요.");
        }
    }

    public String getTeam() {
        return teamName;
    }
}
