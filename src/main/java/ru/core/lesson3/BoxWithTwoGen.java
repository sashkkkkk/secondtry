package ru.core.lesson3;

public class BoxWithTwoGen <T, S> {
    private T obj1;
    private S obj2;


    public BoxWithTwoGen (T obj1, S obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public S getObj2() {
        return obj2;
    }

    public void setObj2(S obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "BoxWithTwoGen{" +
                "obj1=" + obj1 +
                ", obj2=" + obj2 +
                '}';
    }

    public static void main(String[] args) {
        BoxWithTwoGen<Integer,String> intStrBox = new BoxWithTwoGen<>(27, "jija");
        System.out.println(intStrBox.getObj2() + " " + intStrBox.getObj1());

    }

}
