package ru.core.lesson3;

public class GenBox<T> {
    private T object;

    public GenBox(T object){
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "GenBox{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        GenBox<Integer> box1 = new GenBox<>(5);
        GenBox<Integer> box2 = new GenBox<>(10);

        int sum = box1.getObject() + box2.getObject();
        System.out.println(sum);


    }


}
