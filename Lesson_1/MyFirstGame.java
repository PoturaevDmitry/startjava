public class MyFirstGame {

    public static void main(String[] args) {
        int secretNum = 83;
        int userNum = 0;
        System.out.println("Угадайте число от 1 до 100.");
        do {
            userNum += (userNum == 0) ? (101 - secretNum) : 
                (userNum < secretNum) ? ((secretNum - userNum > 10) ? 10 : 1) : 
                (userNum > secretNum) ? ((userNum - secretNum > 10) ? -10 : -1) : 0;
            if (userNum > secretNum) {
                System.out.println("число " + userNum + " больше того, что загадал компьютер");
            } else if (userNum < secretNum) {
                System.out.println("число " + userNum + " меньше того, что загадал компьютер");
            }
        } while (userNum != secretNum);
        System.out.println("Вы победили!");
    }
}