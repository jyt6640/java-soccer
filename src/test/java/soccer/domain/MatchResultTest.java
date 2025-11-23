package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MatchResultTest {
    @DisplayName("TeamStatus를 2개 입력받아 MatchResult 객체 생성")
    @Test
    void TeamStatus를_2개_입력받아_MatchResult_객체_생성() {
        //given
        TeamStatus input1 = new TeamStatus(new Team("TeamA"), new Score(5));
        TeamStatus input2 = new TeamStatus(new Team("TeamB"), new Score(3));

        //when&then
        assertThatCode(() -> new MatchResult(input1, input2))
                .doesNotThrowAnyException();
    }
}
