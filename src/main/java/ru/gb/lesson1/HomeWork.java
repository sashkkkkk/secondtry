package ru.gb.lesson1;

public class HomeWork {
    public static void main(String[] args) {
        checkSum();
        checkColor();
        compareNum();
    }


    public static void checkSum() {
        int a = 2, b = -3, c = a + b;
        if (c > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void checkColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("red");
        }

        if (value > 0 && value <= 100) {
            System.out.println("yellow");
        }

        if (value > 100) {
            System.out.println("green");
        }
    }

    public static void compareNum() {
        int a = 20, b = 7;

        if(a>=b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

}








