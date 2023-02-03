package ru.gb.lesson3;
import java.util.Arrays;

public class homeWork {
    public static void main(String[] args) {
        chnArr();
        numFill();
        doubl();
        table();
    }


    public static void chnArr() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {arr[i] = 0;}else if
            (arr[i] == 0){arr[i] = 1;}
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void numFill(){
        int[] arr = new int[100];
        int c = 1;
        for(int i = 0; i < arr.length; i++){
            arr[i] = c;
            c++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void doubl(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 6){arr[i] *= 6;}
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void table() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = 8;
                if (arr[i] == arr[j]) {arr[i][j] = 1;}
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
