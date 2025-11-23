package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TeamTest {
    @DisplayName("팀 이름으로 Team 객체 생성")
    @Test
    void 팀_이름으로_Team_객체_생성() {
        //input
        String input = "팀A";

        //when&then
        assertThatCode(() -> new Team(input))
                .doesNotThrowAnyException();
    }
}
