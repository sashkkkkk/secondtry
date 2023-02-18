package ru.gb.lesson7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Барсек", 5);
        cat[1] = new Cat("Мурзик", 3);
        cat[2] = new Cat("Пушок", 4);
        cat[3] = new Cat("Лучик", 6);
        Plate plate = new Plate(6);
        plate.plateInfo();

        for(int i = 0; i < cat.length; i++ ){
            cat[i].eat(plate);
            plate.plateInfo();
            if(cat[i].full == 0){
                plate.increaseFood(cat[i-1].appetit);
                cat[i].eat(plate);
                plate.plateInfo();
            }
        }

        /*plate.plateInfo();
        cat[0].eat(plate);
        plate.plateInfo();
        cat[1].eat(plate);
        plate.plateInfo();
        plate.increaseFood(1);
        cat[1].eat(plate);
        plate.plateInfo();*/

    }

}
