package ru.gb.lesson5;


public class LesApp {
    public static void main(String[] args) {

        Worker[] workArray = new Worker[5];
        workArray[0] = new Worker("Грубый Семен Витальевич", "Местный Вася", "GruboJestko@mail.ru", "+79687234566", 22);
        workArray[1] = new Worker("Люсин Дмитрий Павлович", "Главный роджер", "LusDim@ya.ru", "+79775487263", 29);
        workArray[2] = new Worker("Клюша Ирина Робертовна", "Ревнивая кобра", "IrishkaLove@mail.ru", "+79213459965", 25);
        workArray[3] = new Worker("Сизая Людмила Семеновна", "Пришлая соседка", "LusyaSizaya@mail.ru", "+79215667824", 21);
        workArray[4] = new Worker("Грандэ де Сильвия Рикардо", "Иностранный специалист", "RicardoMaster@gmail.com", "5828737276718", 37);

        System.out.println();
        System.out.println("Работники возрастом больше 25:");

        for(int i = 0; i < workArray.length; i++){
            if(workArray[i].getAge() > 25){
                System.out.println(workArray[i].getName() + " " + workArray[i].getPost() + " " + workArray[i].getMail() + " " + workArray[i].getTel() + " " + workArray[i].getAge());
            }
        }
    }
}
