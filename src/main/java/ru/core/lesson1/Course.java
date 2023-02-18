package ru.core.lesson1;

public class Course {
    int[] c;

    public Course(){
        int[] c = {2, 7, 15, 22};
    }

    public void doIt(int d){
        for(int i = 0; i < c.length; i++){
            if(d > c[i]){
                System.out.println("Игрок сдался");
            }else{
                System.out.println("Игрок справился");
            }
        }



    }



}
