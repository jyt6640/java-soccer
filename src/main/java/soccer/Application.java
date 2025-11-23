package soccer;

import camp.nextstep.edu.missionutils.Console;
import soccer.controller.soccerController;

public class Application {
    public static void main(String[] args) {
        soccerController soccerController = new soccerController();
        try {
            soccerController.run();
        } finally {
            Console.close();
        }
    }
}
