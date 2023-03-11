package ru.core.lesson3;

public class Box {
    private Object object;

    public Box(Object object){
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Box{" +
                "object=" + object +
                '}';
    }

    public static void main(String[] args) {
        Box box1 = new Box(5);
        Box box2 = new Box(10);

        System.out.println(box1.getObject().getClass());
        System.out.println(box2.getObject().getClass());

        int sum = (Integer) box2.getObject() + (Integer) box1.getObject();
        System.out.println(sum);

        Box box3 = new Box("text");
        System.out.println(box3.getObject().getClass());
        System.out.println(box3);

    }

}
