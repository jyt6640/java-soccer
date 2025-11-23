package soccer.domain;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TeamStatusTest {
    private Team team;
    private Score score;

    @DisplayName("Team과 Score를 입력받아 상태를 저장하는 TeamStatus 객체 생성")
    @Test
    void Team과_Score를_입력받아_상태를_저장하는_TeamStatus_객체_생성() {
        //given
        team = new Team("TeamA");
        score = new Score(5);

        //when&then
        assertThatCode(() -> new TeamStatus(team, score))
                .doesNotThrowAnyException();
    }
}
