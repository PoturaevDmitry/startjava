public class Person {

    String gender = "male";
    String name = "Ivan";
    double growth = 1.73;
    double weight = 75.4;
    int age = 37;

    void toGo() {
        System.out.println("Я иду");
    }

    void toSit() {
        System.out.println("Я сижу");
    }

    void toRun() {
        System.out.println("Я бегу");
    }

    String toSpeak() {
        return "Бла-бла-бла";
    }

    void learnJava() {
        System.out.println("Я изучаю Java!");
    }
}