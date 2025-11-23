package soccer.service;

import soccer.domain.TeamStatus;
import soccer.service.dto.WinnerName;

public class MatchService {
    private static final String DRAW = "무승부";

    private final TeamStatus team1;
    private final TeamStatus team2;

    public MatchService(TeamStatus team1, TeamStatus team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    public WinnerName result() {
        if (team1.isWinningAgainst(team2)) {
            return new WinnerName(team1.getTeamName());
        }
        if (team2.isWinningAgainst(team1)) {
            return new WinnerName(team2.getTeamName());
        }
        return new WinnerName(DRAW);
    }
}
