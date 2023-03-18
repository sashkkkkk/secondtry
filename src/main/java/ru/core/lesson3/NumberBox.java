package ru.core.lesson3;

import java.util.Arrays;

public class NumberBox<T extends Number> {
    private T[] arrayNumbers;

    public NumberBox(T... arrayNumbers){
        this.arrayNumbers = arrayNumbers;
    }

    public T[] getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(T[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    @Override
    public String toString() {
        return "NumberBox{" +
                "arrayNumbers=" + Arrays.toString(arrayNumbers) +
                '}';
    }

    public double calcAverage(){
        double sum = 0.0;
        for(T num : arrayNumbers){
            sum += num.doubleValue();
        }

        return sum / arrayNumbers.length;
    }

    public boolean isSameAverage(NumberBox<?> boxToCompare){
        return Math.abs(calcAverage() - boxToCompare.calcAverage()) <= 0.001;

    }

    public static <U extends Number> U getFirstEl(NumberBox<U> box){
        return box.getArrayNumbers()[0];
    }

    public static void main(String[] args) {

        NumberBox<Integer> integerNumberBox = new NumberBox<>(1,2,4,5,6,2,2);

        System.out.println(integerNumberBox.calcAverage());
        NumberBox<Double> doubleNumberBox = new NumberBox<>(1.2, 4.3, 3.6, 7.8, 9.0);
        System.out.println(doubleNumberBox.calcAverage());
        System.out.println(integerNumberBox.isSameAverage(doubleNumberBox));
        System.out.println(getFirstEl(integerNumberBox));
        System.out.println(getFirstEl(doubleNumberBox));

    }



}
