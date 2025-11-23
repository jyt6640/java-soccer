package soccer;

import soccer.controller.soccerController;

public class Application {
    public static void main(String[] args) {
        soccerController soccerController = new soccerController();
        soccerController.run();
    }
}
