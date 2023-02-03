package ru.gb.lesson2;

public class SecApp {
    public static void main(String[] args) {
        System.out.println(summ(5,5));
        printSomeText();
        printMyText("World!");
        drawCat();
        System.out.println(boolExc());
    }

    public static int summ(int a, int b) {
        return a + b;
    }

    public static void printSomeText () {
        System.out.println("Hello");
    }

    public static void printMyText( String txtToPrint) {
        System.out.println(txtToPrint);
    }

    public static void drawCat() {
        System.out.println("            _..---...,\"\"-._     ,/}/)\n" +
                "        .''         ,      ``..'(/-<\n" +
                "       /   _       {        )       \\\n" +
                "       ;  _ `.      `.     <       a(\n" +
                "     ,'  ( \\   )     `.   \\ __.._ .: y\n" +
                "    (  <\\_-) )'-.____...\\  `._ //-'\n" +
                "     `.  `-' /-._)))     `-._)))\n" +
                "       `...' ");

    }

    public static boolean boolExc() {
        int a = 1;
        int b = 2;
        boolean c = a > b;
        return (c);
    }

}
