package ru.core.lesson1;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik","Belyi", 2);
        System.out.println(cat);
        Wolf wolf = new Wolf("VOlchara","Seriy",4);
        System.out.println(wolf);
        cat.setAge(5);
        System.out.println(cat);
        cat.voice();
        Turtle turtle = new Turtle("Tortilla","Seriy", 122);
        wolf.voice();
        turtle.voice();
        Field field = new Field(20);
        wolf.setRunSpeed(5);
        cat.setRunSpeed(4);
        turtle.setRunSpeed(1);
        wolf.run(field);
        turtle.run(field);
        cat.run(field);
        Pool pool = new Pool(10);
        wolf.setSwimSpeed(2);
        cat.setSwimSpeed(1);
        turtle.setSwimSpeed(5);
        wolf.swim(pool);
        cat.swim(pool);
        turtle.swim(pool);





    }
}
