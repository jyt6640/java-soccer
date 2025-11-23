package soccer.domain;

import static soccer.common.constant.ErrorMessage.MAX_TEAM_LENGTH;

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
            throw new IllegalArgumentException(MAX_TEAM_LENGTH);
        }
    }

    public String getTeam() {
        return teamName;
    }
}
