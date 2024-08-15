package main.java.com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 먹습니다");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달리기를 합니다");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다");
    }

    public void jump() {
        System.out.println("토끼가 점프를 합니다");

    }
}

