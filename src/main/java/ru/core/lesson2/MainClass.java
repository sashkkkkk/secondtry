package ru.core.lesson2;

public class MainClass {
   /* public static void main(String[] args) {
        try {
            int a = 10;
            a -= 10;
            int b = 42 / a;
            int[] с = {1, 2, 3};
            с[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("Дeлeниe на ноль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }
        System.out.println("Пocлe блока операторов try/catch");
    }*/

    public static void main(String[] args) {
        methodArray();
    }

    public static void methodArray() {
        int[][] arr = new int[4][4];
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
                throw new ArrayIndexOutOfBoundsException();
            }
            }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");

        }
    }

}

