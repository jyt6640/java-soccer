package soccer.util;

public class InputParser {
    private static final String DELIMITER = " ";
    private static final int TEAM_NAME_INDEX = 0;
    private static final int SCORE_INDEX = 1;

    public MatchInput parse(String input) {
        String[] parts = input.strip()
                .split(DELIMITER);
        return new MatchInput(parts[TEAM_NAME_INDEX], Integer.parseInt(parts[SCORE_INDEX]));
    }
}