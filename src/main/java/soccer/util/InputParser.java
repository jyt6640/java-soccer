package soccer.util;

public class InputParser {
    private static final String DELIMITER = " ";
    private static final int TEAM_NAME_INDEX = 0;
    private static final int SCORE_INDEX = 1;
    private static final String INPUT_REGEX = "^\\S+ \\d+$";

    public MatchInput parse(String input) {
        validate(input);
        String[] parts = input.strip()
                .split(DELIMITER);
        return new MatchInput(parts[TEAM_NAME_INDEX], Integer.parseInt(parts[SCORE_INDEX]));
    }

    private void validate(String input) {
        if (!input.matches(INPUT_REGEX)) {
            throw new IllegalArgumentException("[ERROR] 입력 형식이 올바르지 않습니다.");
        }
    }
}