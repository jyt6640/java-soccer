package soccer.domain;

public class TeamStatus {
    private Team team;
    private Score score;

    public TeamStatus(Team team, Score score) {
        this.team = team;
        this.score = score;
    }

    public boolean isWinningAgainst(TeamStatus other) {
        return this.score
                .isHigherThan(other.score);
    }

    public String getTeamName() {
        return team.getTeam();
    }
}
