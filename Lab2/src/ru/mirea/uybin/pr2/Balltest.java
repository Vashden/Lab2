package ru.mirea.uybin.pr2;

public class Balltest {
    public Balltest() {
    }

    public static void main(String[] args) {
        Ball green = new Ball(100.0D, 50.0D);
        System.out.println(green);
        green.move(50.0D, 10.0D);
        System.out.println(green);
    }
}
