package soccer.service;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import soccer.domain.Score;
import soccer.domain.Team;
import soccer.domain.TeamStatus;
import soccer.service.dto.WinnerName;

public class MatchServiceTest {
    TeamStatus input1 = new TeamStatus(new Team("TeamA"), new Score(5));
    TeamStatus input2 = new TeamStatus(new Team("TeamB"), new Score(3));
    TeamStatus input3 = new TeamStatus(new Team("TeamC"), new Score(5));

    @DisplayName("TeamStatus를 2개 입력받아 MatchResult 객체 생성")
    @Test
    void TeamStatus를_2개_입력받아_MatchResult_객체_생성() {
        //when&then
        assertThatCode(() -> new MatchService(input1, input2))
                .doesNotThrowAnyException();
    }

    @DisplayName("팀 점수를 비교하여 승자팀 반환")
    @Test
    void 팀_점수를_비교하여_승자팀_반환() {
        //given
        MatchService matchService = new MatchService(input1, input2);

        //when
        WinnerName result = matchService.result();

        //then
        assertThat(result.winnerName()).isEqualTo("TeamA");
    }

    @DisplayName("팀 점수를 비교하여 무승부 시 무승부 반환")
    @Test
    void 팀_점수를_비교하여_무승부_시_무승부_반환() {
        //given
        MatchService matchService = new MatchService(input1, input3);

        //when
        WinnerName result = matchService.result();

        //then
        assertThat(result.winnerName()).isEqualTo("무승부");
    }
}
