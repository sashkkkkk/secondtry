package ru.gb.lesson7;

public class Plate {
    int food;

    public Plate(int food){
        this.food = food;
    }

    public void decreaseFood(int d){
       if(d <= food){ food -= d;}
       else {
           System.out.println("В тарелке недостаточно еды");
       }
    }

    public void increaseFood(int f){
        food += f;
        System.out.println("В тарелку добавили " + f + " еды");
        System.out.println("Теперь в тарелке " + food + " еды");
    }


    public void plateInfo(){
        System.out.println("Еды в тарелке: " + food);
    }
}
