public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.gender = "самец";
        wolf.name = "Вольфганг";
        wolf.weight = 30;
        wolf.age = 7;
        wolf.color = "серый";
        System.out.println("Волк " + wolf.name + ", " + wolf.gender);
        System.out.println("Волку " + wolf.age + " лет, его вес - " + wolf.weight);
        System.out.println("Волк " + wolf.name + " активный, он:");
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}