package soccer.domain;

public class MatchResult {
    private final TeamStatus team1;
    private final TeamStatus team2;

    public MatchResult(TeamStatus team1, TeamStatus team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
}
