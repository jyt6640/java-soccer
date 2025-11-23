package soccer.view;

import static soccer.common.constant.ErrorMessage.ERROR_PREFIX;

public class OutputView {
    private static final String WINNER_SUFFIX = " 승리";

    public void printWinner(String winner) {
        System.out.println(winner + WINNER_SUFFIX);
    }

    public void printError(IllegalArgumentException e) {
        System.out.println(ERROR_PREFIX + e.getMessage());
    }
}
