package ru.gb.lesson3;

public class LesApp {
    public static void main(String[] args) {
        prAr(new int [12]);
    }

    public static void prAr (int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

