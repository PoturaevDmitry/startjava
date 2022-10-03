package com.startjava.lesson_2_3.animal;

public class WolfTest {
    
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("самец");
        wolf.setName("Вольфганг");
        wolf.setWeight(30);
        wolf.setAge(7);
        wolf.setColor("серый");
        System.out.println("Волк " + wolf.getName() + ", " + wolf.getGender());
        System.out.println("Волку " + wolf.getAge() + " лет, его вес - " + wolf.getWeight());
        System.out.println("Волк " + wolf.getName() + " активный, он:");
        wolf.go();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}