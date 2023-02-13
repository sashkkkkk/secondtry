package ru.gb.lesson6;

public class Cat extends Animal {

    public Cat(String name){
        super();
        this.name = name;
    }

      public void run(int runDist){
        if(runDist <= 200){
            System.out.println(name + " пробежал " + runDist + "м");
        }else {
            System.out.println("Кот не может пробежать больше 200м");
        }

    }

    @Override
    public void run() {

    }

    public void swim(){
        System.out.println("Кот не умеет плавать");
    }

}
