package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

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

    @DisplayName("음수 값 입력 시 예외 발생")
    @Test
    void 음수_값_입력_시_예외_발생() {
        //given
        int input = -5;

        //when&then
        assertThatThrownBy(() -> new Score(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 점수는 음수 일 수 없습니다.");
    }
}
