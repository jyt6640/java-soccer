package soccer.util;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputParserTest {
    private InputParser inputParser;

    @BeforeEach
    void setUp() {
        inputParser = new InputParser();
    }

    @DisplayName("입력 문자열을 공백 기준으로 분리하여 이름과 점수 반환")
    @Test
    void 입력_문자열을_공백_기준으로_분리하여_이름과_점수_반환() {
        //given
        String input = "팀A 3";

        //when
        MatchInput result = inputParser.parse(input);

        //then
        assertThat(result.teamName()).isEqualTo("팀A");
        assertThat(result.score()).isEqualTo(3);
    }

    @DisplayName("입력 형식이 올바르지 않으면 예외 발생")
    @Test
    void 입력_형식이_올바르지_않으면_예외_발생() {
        //given
        String input = "팀A";

        //when&then
        assertThatThrownBy(() -> inputParser.parse(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 입력 형식이 올바르지 않습니다.");
    }
}
