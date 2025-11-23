package soccer.view;

public class OutputView {
    public void printWinner(String winner) {
        System.out.println(winner + " 승리");
    }

    public void printError(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
