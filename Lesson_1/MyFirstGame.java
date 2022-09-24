public class MyFirstGame {

    public static void main(String[] args) {
        int secretNum = 83;
        int playerNum = 0;
        System.out.println("Угадайте число от 1 до 100.");
        do {
            if (playerNum == 0) {
                playerNum = 101 - secretNum;
            }
            if (playerNum > secretNum) {
                System.out.println("число " + playerNum + " больше того, что загадал компьютер");
                playerNum -= (playerNum - secretNum > 10) ? 10 : 1;
            } else if (playerNum < secretNum) {
                System.out.println("число " + playerNum + " меньше того, что загадал компьютер");
                playerNum += (secretNum - playerNum > 10) ? 10 : 1;
            }
        } while (playerNum != secretNum);
        System.out.println("Вы победили!");
    }
}