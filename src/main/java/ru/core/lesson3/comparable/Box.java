package ru.core.lesson3.comparable;

import java.util.Arrays;

public class Box implements Comparable {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Box(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box{" +
                "size=" + size +
                '}';
    }



    public static void main(String[] args) {
        Box box1 = new Box(2);
        Box box2 = new Box(5);

        System.out.println(box1.compareTo(box2));

        Box[] boxes = {new Box(2), new Box(5), new Box(6), new Box(1)};
        Arrays.sort(boxes);
        System.out.println(Arrays.toString(boxes));

    }

    @Override
    public int compareTo(Object o) {
        return size - ((Box) o).getSize();
    }
}
