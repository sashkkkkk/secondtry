package ru.core.lesson1;

public class Teammate {
    String name;
    int canRun;

    public String getName() {
        return name;
    }

    public void setCanRun(int canRun) {
        this.canRun = canRun;
    }

    public int getCanRun() {
        return canRun;
    }


    public Teammate(String name, int canRun){
        this.name = name;
        this.canRun = canRun;
    }
}
