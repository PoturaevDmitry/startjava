package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Striker Eureka");
        jaeger1.setMark("Mark-5");
        jaeger1.setOrigin("Australia");
        jaeger1.setHeight(76.2f);
        jaeger1.setWeight(1.85f);
        jaeger1.setStrength(10);
        jaeger1.setArmor(9);

        Jaeger jaeger2 = new Jaeger("Crimson Typhoon", "Mark-4", "China",
            76.2f, 1.72f, 8, 6);

        System.out.println(jaeger1);
        System.out.println("\n" + jaeger2);

        System.out.print("\n" + jaeger1.getModelName() + ": ");
        jaeger1.move();
        System.out.print(jaeger2.getModelName() + ": ");
        jaeger2.move();

        jaeger1.setStrength(jaeger1.getStrength() - 3);
        jaeger2.setStrength(jaeger2.getStrength() - 2);

        System.out.println("\n" + jaeger1);
        System.out.println("\n" + jaeger2);

        System.out.print("\n" + jaeger1.getModelName() + ": ");
        jaeger1.useVortexCannon();
        System.out.print(jaeger2.getModelName() + ": ");
        jaeger2.useVortexCannon();

        jaeger1.setArmor(jaeger1.getArmor() - 1);
        jaeger2.setArmor(jaeger2.getArmor() - 2);

        System.out.println("\n" + jaeger1);
        System.out.println("\n" + jaeger2);
    }
}