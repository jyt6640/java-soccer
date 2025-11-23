package soccer.view;

public class OutputView {
    public void printWinner(String winner) {
        System.out.println(winner);
    }

    public void printError(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
