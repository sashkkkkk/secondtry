package ru.gb.lesson6;

public class Cat extends Animal {
    String color;

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void catInfo() {
        System.out.println("Кличка кота: " + name + " Окраска кота: " + color);
    }

}
