package soccer.domain;

import soccer.domain.dto.WinnerName;

public class MatchResult {
    private final TeamStatus team1;
    private final TeamStatus team2;

    public MatchResult(TeamStatus team1, TeamStatus team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public WinnerName result() {
        if (team1.isWinningAgainst(team2)) {
            return new WinnerName(team1.getTeamName());
        }
        if (team2.isWinningAgainst(team1)) {
            return new WinnerName(team1.getTeamName());
        }
        return new WinnerName("무승부");
    }
}
