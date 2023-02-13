package ru.gb.lesson6;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
    }

    public void run(int runDist) {
        if(runDist <= 500){
            System.out.println(name + " пробежал " + runDist + "м");
        }else{
            System.out.println("Собака не может пробежать больше 500м");
        }

    }

    public void swim(int swimDist) {
        if(swimDist <= 10){
            System.out.println( name + " проплыл " + swimDist + "м");
        }else {
            System.out.println("Собака не может проплыть больше 10м");
        }

    }

    @Override
    public void run() {

    }

    @Override
    public void swim() {

    }
}
