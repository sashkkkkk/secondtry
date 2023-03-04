package ru.core.lesson2;

public class MainClass {
    public static void main(String[] args) {
        try{
        methodArray();}catch (MyArrayDataException | MyArraySizeException e){
            e.printStackTrace();
        }

    }

    public static void methodArray() throws MyArraySizeException, MyArrayDataException {
        String[][] arr = new String[4][4];
        if (arr.length > 4) throw new MyArraySizeException("Превышение длины массива");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = "1";
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] arr1 = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr1[i][j] = Integer.parseInt(arr[i][j]);

                if(arr[i][j].equals(arr1[i][j])) throw new MyArrayDataException("Не удалось изменить тип ячейки i = " + i + " j = " + j);

                arr1[i][j] = arr1[i][j] + 1;
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


    }
}


