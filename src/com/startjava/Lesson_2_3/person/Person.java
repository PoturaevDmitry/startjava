package com.startjava.Lesson_2_3.person;

public class Person {

    String gender = "male";
    String name = "Ivan";
    double height = 1.73;
    double weight = 75.4;
    int age = 37;

    void go() {
        System.out.println("Я иду");
    }

    void sit() {
        System.out.println("Я сижу");
    }

    void run() {
        System.out.println("Я бегу");
    }

    String speak() {
        return "Бла-бла-бла";
    }

    void learnJava() {
        System.out.println("Я изучаю Java!");
    }
}