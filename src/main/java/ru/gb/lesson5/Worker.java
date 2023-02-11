package ru.gb.lesson5;

public class Worker {
    private String name;
    private String post;
    private String mail;
    private String tel;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Worker(String name, String post, String mail, String tel, int age){
        this.name = name;
        this.post = post;
        this.mail = mail;
        this.tel = tel;
        this.age = age;

        System.out.println(name + " " + post + " " + mail + " " + tel + " " + age);

    }

}


