package ru.core.lesson3.comparable;

import java.util.Arrays;

public class Box2 implements Comparable<Box2> {
    private int size;

    public Box2(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Box2{" +
                "size=" + size +
                '}';
    }


    @Override
    public int compareTo(Box2 box) {
        return getSize() - box.getSize();
    }

    public static void main(String[] args) {
        Box2 box1 = new Box2(16);
        Box2 box2 = new Box2(22);

        System.out.println(box1.compareTo(box2));

        Box2[] boxes2 = {new Box2(2), new Box2(6), new Box2(17), new Box2(13)};
        Arrays.sort(boxes2);
        System.out.println(Arrays.toString(boxes2));
    }

}
