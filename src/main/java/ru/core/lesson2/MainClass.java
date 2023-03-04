package ru.core.lesson2;

public class MainClass {
    public static void main(String[] args) {
        methodArray();

    }

    public static void methodArray() throws MyArraySizeException {
        String[][] arr = new String[4][4];
        if(arr.length > 4){
            throw new  MyArraySizeException("Превышение длины массива");
        }

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = "aaa";
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

