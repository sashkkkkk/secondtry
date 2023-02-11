package ru.gb.lesson4;

import java.util.Arrays;
import java.util.Random;

public class Test {public static void main(String[] args) {
    meth();
}
    public static void meth() {
        Random rand = new Random();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            int x = rand.nextInt(100);
            arr[i] = x;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();

        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max value is " + max);

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min value is " + min);

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("Summ of numbers is " + sum);
    }





}
