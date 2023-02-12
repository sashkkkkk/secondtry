package ru.gb.lesson6;

public class MainApp {
    public static void main(String[] args) {
        Animal animal = new Animal("Дружок");
        Cat cat = new Cat("Мурзик", "черный");
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();
    }

}
