package soccer.domain;

public class Score {
    private final int score;

    public Score(int score) {
        validate(score);
        this.score = score;
    }

    public void validate(int score) {
        minusScore(score);
    }

    private void minusScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("[ERROR] 점수는 음수 일 수 없습니다.");
        }
    }
}
