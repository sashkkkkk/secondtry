package ru.core.lesson1;

import java.util.Objects;

public class Cat extends Animal implements CanRun{
    private int runSpeed;
    private int swimSpeed;

    public int getRunSpeed() {
        return runSpeed;
    }

    public void setRunSpeed(int runSpeed) {
        this.runSpeed = runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }

    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    public void voice(){
        System.out.println(getName() + ": Meow");
    }

    public int run(Field field) {
        System.out.println("Cat is running");
        System.out.println("Spend " + field.getDistance() / runSpeed);
        return field.getDistance() / runSpeed;
    }

    public int swim(Pool pool) {
        System.out.println("Cat is swimming");
        System.out.println("Spend " + pool.getDistance() / swimSpeed);
        return pool.getDistance() / swimSpeed;
    }


}
