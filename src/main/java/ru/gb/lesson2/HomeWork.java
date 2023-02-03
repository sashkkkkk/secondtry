package ru.gb.lesson2;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(checkSum(10,24));
        checkNum1(-3);
        System.out.println(checkNum2(-2));
        printNum("JiJa",3);
    }

    public static boolean checkSum (int a, int b) {
        int c = a + b;

        boolean i = c >= 10 && c <= 20;

        return i;
    }

    public static void checkNum1 (int a) {
        if (a >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

    public static boolean checkNum2 (int a) {

        boolean i = a >= 0;

        return i;
    }

    public  static void printNum (String txtToPrint, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(txtToPrint);
        }

    }


}
