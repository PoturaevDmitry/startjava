import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Игра \"Угадай число\"");
        System.out.println("Правила игры: \n" +
                " - в игре участвуют два игрока\n" +
                " - компьютер загадывает число от 1 до 100\n" + 
                " - игроки по очереди пытаются угадать число\n" +
                " - выигрывает игрок, первым угадавший число\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        GuessNumber game = new GuessNumber(new Player(name1), new Player(name2));

        String answer = "";
        do {
            game.start();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (!answer.equals("no"));
        System.out.println("Конец игры");
    }
}