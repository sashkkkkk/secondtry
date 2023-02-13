package ru.gb.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        cat.run(155);
        cat.swim();
        dog.run(203);
        dog.swim(2);


    }

}
