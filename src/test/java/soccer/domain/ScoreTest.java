package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ScoreTest {
    @DisplayName("점수 입력 시 Score 객체 생성")
    @Test
    void 점수_입력_시_Score_객체_생성() {
        //given
        int input = 5;

        //when&then
        assertThatCode(() -> new Score(input))
                .doesNotThrowAnyException();
    }
}
