package soccer.controller;

import soccer.domain.Score;
import soccer.domain.Team;
import soccer.domain.TeamStatus;
import soccer.service.MatchService;
import soccer.service.dto.WinnerName;
import soccer.util.InputParser;
import soccer.util.MatchInput;
import soccer.view.InputView;
import soccer.view.OutputView;

public class soccerController {
    private final InputView inputView;
    private final OutputView outputView;
    private final InputParser inputParser;

    public soccerController() {
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.inputParser = new InputParser();
    }

    public void run() {
        try {
            inputView.introduceService();

            TeamStatus team1 = inputTeam();
            TeamStatus team2 = inputTeam();

            MatchService matchResult = new MatchService(team1, team2);
            WinnerName winnerName = matchResult.result();

            outputView.printWinner(winnerName.winnerName());
        } catch (IllegalArgumentException e) {
            outputView.printError(e);
            throw e;
        }
    }

    private TeamStatus inputTeam() {
        String input = inputView.readTeamStatus();
        MatchInput matchInput = inputParser.parse(input);
        return new TeamStatus(
                new Team(matchInput.teamName()),
                new Score(matchInput.score())
        );
    }
}
