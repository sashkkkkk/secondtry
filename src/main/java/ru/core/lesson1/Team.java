package ru.core.lesson1;

public class Team {
    String name;
    Teammate[] teamArr = new Teammate[4];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teammate[] getTeamArr() {
        return teamArr;
    }

    public void setTeamArr(Teammate[] teamArr) {
        this.teamArr = teamArr;
    }

    public Team (String name) {
        this.name = name;
        teamArr[0] = new Teammate("Валя", 5);
        teamArr[1] = new Teammate("Боря", 15);
        teamArr[2] = new Teammate("Рикардо", 22);
        teamArr[3] = new Teammate("Ли Си Юнь", 12);
    }

    public Team () {
        name = "Скольд";
        teamArr[0] = new Teammate("Валя", 5);
        teamArr[1] = new Teammate("Боря", 15);
        teamArr[2] = new Teammate("Рикардо", 22);
        teamArr[3] = new Teammate("Ли Си Юнь", 12);
    }

    public void getInfo(){
        for(int i = 0; i < teamArr.length; i++){
            System.out.println("Игрок " + teamArr[i].name + " может пробежать " + teamArr[i].canRun + "м");
        }




    }

}


