package ru.gb.lesson6;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public Animal() {

    }

    public abstract void run();
    public abstract void swim();

}

