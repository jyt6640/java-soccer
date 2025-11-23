package soccer.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String INTRODUCE_SERVICE = "축구 경기 결과 분석기 입니다.";
    private static final String INPUT_TEAM_STATUS = "팀 이름과 점수를 입력해주세요. (예시: 팀A 3, 팀B 2)";

    public void introduceService() {
        System.out.println(INTRODUCE_SERVICE);
        System.out.println(INPUT_TEAM_STATUS);
    }

    public String readTeamStatus() {
        return Console.readLine();
    }
}
