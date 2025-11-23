package soccer.domain;

import static soccer.common.constant.ErrorMessage.MAX_SCORE;
import static soccer.common.constant.ErrorMessage.MINUS_SCORE;

public class Score {
    private final int score;

    public Score(int score) {
        validate(score);
        this.score = score;
    }

    public void validate(int score) {
        minusScore(score);
        maxScore(score);
    }

    public boolean isHigherThan (Score other) {
        return this.score > other.score;
    }

    private void minusScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException(MINUS_SCORE);
        }
    }

    private void maxScore(int score) {
        if (score >= 100) {
            throw new IllegalArgumentException(MAX_SCORE);
        }
    }
}
