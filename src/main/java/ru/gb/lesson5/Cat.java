package ru.gb.lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age){
        System.out.println("Конструктор класса Cat");
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat(String name){
        this.name = name;
        this.color = "Неизвестно";
        this.age = 0;
    }

}
