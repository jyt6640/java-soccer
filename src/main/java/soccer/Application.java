package soccer;

import camp.nextstep.edu.missionutils.Console;
import soccer.controller.SoccerController;

public class Application {
    public static void main(String[] args) {
        SoccerController soccerController = new SoccerController();
        try {
            soccerController.run();
        } finally {
            Console.close();
        }
    }
}
