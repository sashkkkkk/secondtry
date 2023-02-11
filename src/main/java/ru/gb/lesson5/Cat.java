package ru.gb.lesson5;

public class Cat {
    private String name;
    private String color;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setAge(int age){
        if(age >= 0){this.age = age;}else{
            System.out.println("Введен некорректный возраст");
        }
    }

    public int getAge(){
        return age;
    }

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
