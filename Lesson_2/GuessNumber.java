import java.util.Scanner;

public class GuessNumber {

    Player player1;
    Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        int secretNum = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        boolean turnPlayer1 = false;
        int playerNum;
        System.out.println("Угадайте число от 1 до 100...");
        do {
            turnPlayer1 = !turnPlayer1;
            System.out.print("Ход игрока " + 
                    (turnPlayer1 ? player1.getName() : player2.getName()) + ": ");
            playerNum = scanner.nextInt();
            if (playerNum > secretNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
            } else if (playerNum < secretNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
            } else {
                System.out.println("Победил игрок " + 
                        (turnPlayer1 ? player1.getName() : player2.getName()));
            }
        } while (playerNum != secretNum);
    }
}