package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TeamTest {
    @DisplayName("팀 이름으로 Team 객체 생성")
    @Test
    void 팀_이름으로_Team_객체_생성() {
        //given
        String input = "팀A";

        //when&then
        assertThatCode(() -> new Team(input))
                .doesNotThrowAnyException();
    }

    @DisplayName("팀 이름 10자 이상 입력 시 예외 발생")
    @Test
    void 팀_이름_10자_이상_입력_시_예외_발생() {
        //given
        String input = "pobiwonijeong";

        assertThatThrownBy(() -> new Team(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 팀 이름은 10자 미만으로 입력해주세요.");
    }
}
