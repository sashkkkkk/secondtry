package ru.gb.lesson7;

public class Cat {
    String name;
    int appetit;
    int full = 0;

    public Cat(String name, int appetit){
        this.name = name;
        this.appetit = appetit;
        System.out.println(name + " голоден");
    }

    public void eat(Plate p){
        if(appetit <= p.food){
        p.decreaseFood(appetit);
        full = 1;}
        else{
            System.out.println(name + " не удалось поесть и остался голоден");
        }
        if(full > 0){
            System.out.println(name + " поел " + appetit + " еды и сыт");
        }
    }


}
